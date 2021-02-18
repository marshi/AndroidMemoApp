package dev.marshi.memo.feature.editor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import dev.marshi.memo.data.db.memo.MemoDao
import dev.marshi.memo.feature.home.databinding.EditorFragmentBinding
import javax.inject.Inject

@AndroidEntryPoint
class EditorFragment : Fragment() {

  companion object {
    fun newInstance() = EditorFragment()
  }

  private val viewModel: EditorViewModel by viewModels()
  private val binding: EditorFragmentBinding by lazy {
    EditorFragmentBinding.inflate(layoutInflater)
  }
  @Inject lateinit var memoDao: MemoDao

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    requireActivity().onBackPressedDispatcher.addCallback {
      viewModel.insert(binding.editText.text.toString())
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
    println("aiueo")
  }
}
