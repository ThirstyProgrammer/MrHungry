package id.bachtiar.harits.mrhungry.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CookingStep(
    var number: Int = 1,
    var description: String = ""
) : Parcelable
