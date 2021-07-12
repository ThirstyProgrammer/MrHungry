package id.bachtiar.harits.mrhungry.detail.viewholder

import androidx.recyclerview.widget.RecyclerView
import id.bachtiar.harits.mrhungry.databinding.ItemTextWithNumberBinding
import id.bachtiar.harits.mrhungry.model.TextWithNumber

class TextWithNumberViewHolder constructor(private val viewBinding: ItemTextWithNumberBinding) :
    RecyclerView.ViewHolder(viewBinding.root) {

    fun bind(data: TextWithNumber) {
        viewBinding.tvNumber.text = data.number.toString()
        viewBinding.tvText.text = data.description
    }
}