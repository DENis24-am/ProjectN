package model.svg

data class RectUi(
    var style: String? = null,
    var id: String? = null,
    var width: Double = 0.0,
    var height: Double = 0.0,
    var x: Double = 0.0,
    var y: Double = 0.0,
    var titleUi: TitleUi? = null,
    var extraAttributes: MutableMap<String, String>? = null
)
