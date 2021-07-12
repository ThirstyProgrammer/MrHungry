package id.bachtiar.harits.mrhungry.detail.viewholder

import androidx.recyclerview.widget.RecyclerView
import id.bachtiar.harits.mrhungry.databinding.ItemTextTitleBinding
import id.bachtiar.harits.mrhungry.model.Text

class TextTitleViewHolder constructor(private val viewBinding: ItemTextTitleBinding) :
    RecyclerView.ViewHolder(viewBinding.root) {

    fun bind(data: Text) {
        viewBinding.tvText.text = data.text
    }
}