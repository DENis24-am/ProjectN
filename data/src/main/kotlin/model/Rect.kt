package model

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Root

@Root(name = "rect")
data class Rect(
    @field:Attribute(name = "style")
    var style: String? = null,

    @field:Attribute(name = "id")
    var id: String? = null,

    @field:Attribute(name = "width")
    var width: Double = 0.0,

    @field:Attribute(name = "height")
    var height: Double = 0.0,

    @field:Attribute(name = "x")
    var x: Double = 0.0,

    @field:Attribute(name = "y")
    var y: Double = 0.0
)

fun Rect.toUiModel(): RectUi {
    return RectUi(
        style = style,
        id = id,
        width = width,
        height = height,
        x = x,
        y = y
    )
}