package id.bachtiar.harits.mrhungry.util

import android.content.res.Resources
import kotlin.math.roundToInt

fun dpToPx(dp: Int): Int {
    val density = Resources.getSystem().displayMetrics.density
    return (dp * density).roundToInt()
}