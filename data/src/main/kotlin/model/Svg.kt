package model

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.Namespace
import org.simpleframework.xml.Root

@Root(name = "svg", strict = false)
@Namespace(prefix = "inkscape", reference = "http://www.inkscape.org/namespaces/inkscape")
data class Svg(
    @field:Attribute(name = "width")
    var width: Int = 0,

    @field:Attribute(name = "height")
    var height: Int = 0,

    @field:Attribute(name = "viewBox")
    var viewBox: String? = null,

    @field:Attribute(name = "version")
    var version: String? = null,

    @field:Attribute(name = "id")
    var id: String? = null,

    @field:Element(name = "g")
    var group: Group? = null
)

