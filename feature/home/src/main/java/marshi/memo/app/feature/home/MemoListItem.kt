package marshi.memo.app.feature.home

import android.view.View
import com.xwray.groupie.viewbinding.BindableItem
import dev.marshi.feature.home.R
import dev.marshi.feature.home.databinding.MemoListItemBinding

class MemoListItem(val model: MemoModel) : BindableItem<MemoListItemBinding>() {
  override fun bind(viewBinding: MemoListItemBinding, position: Int) {
    viewBinding.memo.text = model.text
  }

  override fun getLayout(): Int {
    return R.layout.memo_list_item
  }

  override fun initializeViewBinding(view: View): MemoListItemBinding {
    return MemoListItemBinding.bind(view)
  }
}