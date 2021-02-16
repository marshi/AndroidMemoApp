package marshi.memo.app.feature.editor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import dev.marshi.feature.home.R
import dev.marshi.feature.home.databinding.EditorFragmentBinding
import marshi.memo.data.db.memo.MemoDao
import marshi.memo.data.db.memo.MemoEntity
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
      viewModel.insert(binding.textInputEditMemoText.text.toString())
      findNavController().popBackStack()
    }
  }

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    return inflater.inflate(R.layout.editor_fragment, container, false)
  }
}
