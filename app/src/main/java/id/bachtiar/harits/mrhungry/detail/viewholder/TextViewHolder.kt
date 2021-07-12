package id.bachtiar.harits.mrhungry.detail.viewholder

import androidx.recyclerview.widget.RecyclerView
import id.bachtiar.harits.mrhungry.databinding.ItemTextBinding
import id.bachtiar.harits.mrhungry.model.Text

class TextViewHolder constructor(private val viewBinding: ItemTextBinding) :
    RecyclerView.ViewHolder(viewBinding.root) {

    fun bind(data: Text) {
        viewBinding.tvText.text = data.text
    }
}