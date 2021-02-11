package marshi.memo.app.feature.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import dev.marshi.feature.home.R
import dev.marshi.feature.home.databinding.AppFragmentBinding

@AndroidEntryPoint
class AppFragment : Fragment(R.layout.app_fragment) {

  companion object {
    fun newInstance() = AppFragment()
  }

  //  @Inject
//  lateinit var viewModelFactory: ViewModelFactory<AppViewModel>
  private val viewModel: AppViewModel by viewModels() // { viewModelFactory }
  private var _binding: AppFragmentBinding? = null
  private val binding get() = _binding!!

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
  }

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
    binding.recyclerView.adapter = MemoListAdapter()

    binding.fab.setOnClickListener {
      findNavController().navigate(R.id.action_appFragment_to_editorFragment)
    }
  }

  override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
  }
}
