package id.bachtiar.harits.mrhungry.model

data class Text(
    override var typeItem: Int,
    val text: String = ""
): BaseRecyclerItem()
