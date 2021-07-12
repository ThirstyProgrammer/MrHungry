package id.bachtiar.harits.mrhungry

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.bachtiar.harits.mrhungry.databinding.ItemRowFoodBinding
import id.bachtiar.harits.mrhungry.model.Food

class FoodAdapter(private val listFood: ArrayList<Food>) :
    RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    private lateinit var listener: OnItemClickCallback

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val binding: ItemRowFoodBinding =
            ItemRowFoodBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FoodViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.bind(listFood[position])
        holder.itemView.setOnClickListener {
            listener.onItemClicked(
                listFood[position]
            )
        }
    }

    override fun getItemCount(): Int = listFood.size

    fun setOnItemClickCallback(onItemClicCallback: OnItemClickCallback) {
        this.listener = onItemClicCallback
    }

    inner class FoodViewHolder constructor(private val viewBinding: ItemRowFoodBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {

        fun bind(food: Food) {
            Glide.with(viewBinding.root.context)
                .load(food.photo)
                .apply(RequestOptions().override(350, 550))
                .into(viewBinding.imgItemPhoto)
            viewBinding.tvItemName.text = food.name
            viewBinding.tvItemCountry.text = food.country
            viewBinding.tvItemDescription.text = food.description
        }

    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Food)
    }
}
