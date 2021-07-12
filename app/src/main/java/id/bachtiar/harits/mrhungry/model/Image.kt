package id.bachtiar.harits.mrhungry.model

data class Image(
    override var typeItem: Int,
    val photo: Int,
    val description: String
) : BaseRecyclerItem()
