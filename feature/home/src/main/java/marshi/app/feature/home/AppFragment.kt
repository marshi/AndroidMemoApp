package marshi.app.feature.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.android.support.DaggerFragment
import dagger.hilt.android.AndroidEntryPoint
import dev.marshi.feature.home.R
import dev.marshi.feature.home.databinding.AppFragmentBinding
import marshi.app.core.ViewModelFactory
import javax.inject.Inject

@AndroidEntryPoint
class AppFragment : Fragment(R.layout.app_fragment) {

  companion object {
    fun newInstance() = AppFragment()
  }

//  @Inject
//  lateinit var viewModelFactory: ViewModelFactory<AppViewModel>
  private val viewModel: AppViewModel by viewModels() // { viewModelFactory }
  private lateinit var binding: AppFragmentBinding

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    binding = AppFragmentBinding.bind(view)
  }
}
