package dev.marshi.memo.feature.editor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import dagger.hilt.android.AndroidEntryPoint
import dev.marshi.memo.core.domain.model.MemoModel
import dev.marshi.memo.feature.home.databinding.EditorFragmentBinding

@AndroidEntryPoint
class EditorFragment : Fragment() {

  companion object {
    fun newInstance() = EditorFragment()
  }

  private val args by navArgs<EditorFragmentArgs>()
  private val viewModel: EditorViewModel by viewModels()
  private val binding: EditorFragmentBinding by lazy {
    EditorFragmentBinding.inflate(layoutInflater)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    requireActivity().onBackPressedDispatcher.addCallback {
      viewModel.insert(MemoModel(args.memoId, binding.editText.text.toString()))
      findNavController().popBackStack()
    }
  }

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    viewLifecycleOwner.lifecycleScope.launchWhenStarted {
      args.memoId?.let { id ->
        binding.editText.setText(viewModel.initialMemo(id)?.text, TextView.BufferType.NORMAL)
      }
    }
  }
}
