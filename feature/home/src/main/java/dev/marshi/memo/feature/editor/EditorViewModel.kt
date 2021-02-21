package dev.marshi.memo.feature.editor

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.marshi.memo.core.domain.model.MemoId
import dev.marshi.memo.core.domain.model.MemoModel
import dev.marshi.memo.core.domain.repository.MemoRepository
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class EditorViewModel @ViewModelInject constructor(
  private val memoRepository: MemoRepository
) : ViewModel() {

  private val _stateFlow = MutableStateFlow<MemoModel?>(null)
  val stateFlow: StateFlow<MemoModel?> = _stateFlow

  init {
  }

  fun insert(memoModel: MemoModel) {
    viewModelScope.launch {
      if (memoModel.text.isNotBlank()) {
        memoRepository.insert(memoModel)
      }
    }
  }

  suspend fun initialMemo(memoId: MemoId): MemoModel? {
    return memoRepository.select(memoId.value)
  }
}
