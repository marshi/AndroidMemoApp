package dev.marshi.memo.feature.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.viewbinding.GroupieViewHolder
import dagger.hilt.android.AndroidEntryPoint
import dev.marshi.memo.feature.home.databinding.AppFragmentBinding
import dev.marshi.memo.feature.home.databinding.MemoListItemBinding
import kotlinx.coroutines.flow.collect

@AndroidEntryPoint
class AppFragment : Fragment(R.layout.app_fragment) {

  private val viewModel: AppViewModel by viewModels()
  private var _binding: AppFragmentBinding? = null
  private val binding get() = _binding!!
  private val adapter = GroupAdapter<GroupieViewHolder<MemoListItemBinding>>()

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    _binding = AppFragmentBinding.inflate(inflater, container, false)
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    binding.recyclerView.adapter = adapter
    binding.fab.setOnClickListener {
      findNavController().navigate(R.id.action_appFragment_to_editorFragment)
    }
    viewLifecycleOwner.lifecycleScope.launchWhenStarted {
      viewModel.uiModel.collect { uiModel ->
        adapter.update(uiModel.memos.map { MemoListItem(it, viewModel) })
      }
    }
    viewModel.memoList()
  }

  override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
  }
}
