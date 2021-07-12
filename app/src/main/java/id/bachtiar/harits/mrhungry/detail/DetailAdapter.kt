package id.bachtiar.harits.mrhungry.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.bachtiar.harits.mrhungry.databinding.ItemImageBinding
import id.bachtiar.harits.mrhungry.databinding.ItemTextBinding
import id.bachtiar.harits.mrhungry.databinding.ItemTextTitleBinding
import id.bachtiar.harits.mrhungry.databinding.ItemTextWithNumberBinding
import id.bachtiar.harits.mrhungry.detail.viewholder.ImageViewHolder
import id.bachtiar.harits.mrhungry.detail.viewholder.TextTitleViewHolder
import id.bachtiar.harits.mrhungry.detail.viewholder.TextViewHolder
import id.bachtiar.harits.mrhungry.detail.viewholder.TextWithNumberViewHolder
import id.bachtiar.harits.mrhungry.model.*

class DetailAdapter(private var listItem: ArrayList<BaseRecyclerItem>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        const val TYPE_IMAGE = 0
        const val TYPE_TITLE = 1
        const val TYPE_TEXT = 2
        const val TYPE_TEXT_WITH_NUMBER = 3
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            TYPE_IMAGE -> {
                val binding =
                    ItemImageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                ImageViewHolder(binding)
            }
            TYPE_TITLE -> {
                val binding =
                    ItemTextTitleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                TextTitleViewHolder(binding)
            }
            TYPE_TEXT -> {
                val binding =
                    ItemTextBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                TextViewHolder(binding)
            }
            TYPE_TEXT_WITH_NUMBER -> {
                val binding = ItemTextWithNumberBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
                TextWithNumberViewHolder(binding)
            }
            else -> {
                val binding =
                    ItemTextBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                TextViewHolder(binding)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ImageViewHolder -> holder.bind(listItem[position] as Image)
            is TextTitleViewHolder -> holder.bind(listItem[position] as Text)
            is TextViewHolder -> holder.bind(listItem[position] as Text)
            is TextWithNumberViewHolder -> holder.bind(listItem[position] as TextWithNumber)
        }
    }

    override fun getItemCount(): Int = listItem.size
    override fun getItemViewType(position: Int): Int = listItem[position].typeItem
}