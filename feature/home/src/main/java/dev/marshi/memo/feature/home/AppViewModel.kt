package dev.marshi.memo.feature.home

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.marshi.memo.core.domain.model.MemoModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import dev.marshi.memo.core.domain.repository.MemoRepository

class AppViewModel @ViewModelInject constructor(
  private val repository: MemoRepository
) : ViewModel() {

  private val _uiModel = MutableStateFlow(MemoListUiModel.EMPTY)
  val uiModel: StateFlow<MemoListUiModel> = _uiModel

  fun memoList() {
    viewModelScope.launch {
      repository.memoList()
        .map { memoList ->
          MemoListUiModel(memoList)
        }.collect {
          _uiModel.value = it
        }
    }
  }

  fun deleteMemo(model: MemoModel) {
    viewModelScope.launch {
      repository.delete(model)
    }
  }
}
