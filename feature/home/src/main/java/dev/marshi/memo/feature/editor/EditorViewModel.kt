package dev.marshi.memo.feature.editor

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import dev.marshi.memo.data.db.memo.MemoDao
import dev.marshi.memo.data.db.memo.MemoEntity
import javax.inject.Inject

class EditorViewModel @ViewModelInject constructor(
  private val memoDao: MemoDao
) : ViewModel() {
  init {
    println(memoDao)
  }

  fun insert(memoText: String) {
    viewModelScope.launch {
      if(memoText.isNotBlank()) {
        memoDao.insert(MemoEntity(memoText = memoText))
      }
    }
  }
}
