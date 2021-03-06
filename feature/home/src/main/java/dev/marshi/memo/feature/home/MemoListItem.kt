package dev.marshi.memo.feature.home

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupWindow
import android.widget.Toast
import androidx.navigation.Navigation
import com.xwray.groupie.Item
import com.xwray.groupie.viewbinding.BindableItem
import dev.marshi.memo.core.domain.model.MemoModel
import dev.marshi.memo.core.util.dpToPx
import dev.marshi.memo.feature.home.databinding.MemoListItemBinding
import dev.marshi.memo.feature.home.databinding.PopupMenuBinding

class MemoListItem(
  private val model: MemoModel,
  private val viewModel: AppViewModel
) : BindableItem<MemoListItemBinding>(
  model.id?.value?.toLong() ?: throw IllegalArgumentException()
) {

  override fun getLayout(): Int {
    return R.layout.memo_list_item
  }

  override fun initializeViewBinding(view: View): MemoListItemBinding {
    return MemoListItemBinding.bind(view)
  }

  override fun bind(viewBinding: MemoListItemBinding, position: Int) {
    viewBinding.memo.text = model.text
    val popupMenuLayoutBinding =
      PopupMenuBinding.inflate(LayoutInflater.from(viewBinding.root.context))

    val popupWindow = PopupWindow(
      popupMenuLayoutBinding.root,
      ViewGroup.LayoutParams.WRAP_CONTENT,
      ViewGroup.LayoutParams.WRAP_CONTENT,
      true
    ).apply {
      setBackgroundDrawable(ColorDrawable(Color.WHITE))
      elevation = 24.dpToPx()
    }
    popupMenuLayoutBinding.delete.setOnClickListener {
      viewModel.deleteMemo(model)
      popupWindow.dismiss()
    }

    viewBinding.root.setOnClickListener {
      Toast.makeText(viewBinding.root.context, "aiueo", Toast.LENGTH_SHORT).show()
      val action =
        AppFragmentDirections.actionAppFragmentToEditorFragment(model.id)
      Navigation.findNavController(viewBinding.root).navigate(action)
    }
    viewBinding.more.setOnClickListener {
      popupWindow.showAsDropDown(it, -8.dpToPx().toInt(), 0, Gravity.END)
    }
  }

  override fun hasSameContentAs(other: Item<*>): Boolean {
    if (other !is MemoListItem) {
      return false
    }
    return this.model == other.model
  }
}
