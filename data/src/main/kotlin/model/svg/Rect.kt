package model.svg

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementMap
import org.simpleframework.xml.Root

@Root(name = "rect", strict = false)
data class Rect(
    @field:Attribute(name = "style", required = false)
    var style: String? = null,

    @field:Attribute(name = "id", required = false)
    var id: String? = null,

    @field:Attribute(name = "width", required = false)
    var width: Double = 0.0,

    @field:Attribute(name = "height", required = false)
    var height: Double = 0.0,

    @field:Attribute(name = "x", required = false)
    var x: Double = 0.0,

    @field:Attribute(name = "y", required = false)
    var y: Double = 0.0,

    @field:Element(name = "title", required = false)
    var title: Title? = null,

    @field:ElementMap(entry = "extra", key = "name", attribute = true, inline = true, required = false)
    var extraAttributes: MutableMap<String, String>? = null
)

fun Rect.toUiModel(): RectUi {
    return RectUi(
        style = style,
        id = id,
        width = width,
        height = height,
        x = x,
        y = y,
        titleUi = title?.toUiModel(),
        extraAttributes = extraAttributes
    )
}
