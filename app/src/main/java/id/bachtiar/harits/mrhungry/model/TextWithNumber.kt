package id.bachtiar.harits.mrhungry.model

data class TextWithNumber(
    override var typeItem: Int,
    var number: Int = 1,
    var description: String = ""
) : BaseRecyclerItem()
