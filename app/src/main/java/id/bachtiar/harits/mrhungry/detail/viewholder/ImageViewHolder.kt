package id.bachtiar.harits.mrhungry.detail.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.bachtiar.harits.mrhungry.databinding.ItemImageBinding
import id.bachtiar.harits.mrhungry.model.Image

class ImageViewHolder constructor(private val viewBinding: ItemImageBinding) :
    RecyclerView.ViewHolder(viewBinding.root) {

    fun bind(data: Image) {
        viewBinding.tvCountry.text = data.description
        Glide.with(viewBinding.root.context)
            .load(data.photo)
            .into(viewBinding.ivPhoto)
    }
}