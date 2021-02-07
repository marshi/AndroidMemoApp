package marshi.memo.app.feature.home

import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder

class MemoListAdapter : GroupAdapter<GroupieViewHolder>() {

  init {
    update(
      listOf(
        MemoListItem(MemoModel("text")),
        MemoListItem(MemoModel("text2")),
        MemoListItem(MemoModel("text3")),
      )
    )
  }
}
