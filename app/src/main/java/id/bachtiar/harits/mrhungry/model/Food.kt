package id.bachtiar.harits.mrhungry.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Food(
    var name: String = "",
    var photo: Int = 0,
    var country: String = "",
    var description: String = "",
    var ingredients: List<String> = arrayListOf(),
    var cookingStep: List<CookingStep> = arrayListOf(),
) : Parcelable
