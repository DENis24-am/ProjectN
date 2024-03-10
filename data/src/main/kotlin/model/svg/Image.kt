package model.svg

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Root

@Root(name = "image", strict = false)
data class Image(
    @field:Attribute(name = "width", required = false)
    var width: Float? = null,

    @field:Attribute(name = "height", required = false)
    var height: Float? = null,

    @field:Attribute(name = "preserveAspectRatio", required = false)
    var preserveAspectRatio: String? = null,

    @field:Attribute(name = "style", required = false)
    var style: String? = null,

    @field:Attribute(name = "href", required = false)
    var href: String? = null,

    @field:Attribute(name = "id", required = false)
    var imageId: String? = null,

    @field:Attribute(name = "x", required = false)
    var x: Float? = null,

    @field:Attribute(name = "y", required = false)
    var y: Float? = null,
)

fun Image.toUiModel(): ImageUi {
    return ImageUi(
        width = width,
        height = height,
        preserveAspectRatio = preserveAspectRatio,
        style = style,
        href = href,
        imageId = imageId,
        x = x,
        y = y
    )
}

