package id.bachtiar.harits.mrhungry.util

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class MarginItemDecoration(private val spaceHeight: Int, private val lastIndex: Int) :
    RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)
        with(outRect) {
            top = if (parent.getChildAdapterPosition(view) == 0) 0 else spaceHeight
            bottom =
                if (parent.getChildAdapterPosition(view) == lastIndex) spaceHeight * 2 else spaceHeight
        }
    }
}