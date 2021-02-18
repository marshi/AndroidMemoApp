package marshi.memo.app.feature.home

import dev.marshi.memo.core.domain.model.MemoModel

data class MemoListUiModel(
  val memos: List<MemoModel>
) {
  companion object {
    val EMPTY = MemoListUiModel(emptyList())
  }
}
