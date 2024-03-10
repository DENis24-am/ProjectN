package model

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.Namespace
import org.simpleframework.xml.Root

@Root(name = "svg", strict = false)
@Namespace(prefix = "inkscape", reference = "http://www.inkscape.org/namespaces/inkscape")
data class Svg(
    @field:Attribute(name = "width", required = false)
    var width: Int = 0,

    @field:Attribute(name = "height", required = false)
    var height: Int = 0,

    @field:Attribute(name = "viewBox", required = false)
    var viewBox: String? = null,

    @field:Attribute(name = "version", required = false)
    var version: String? = null,

    @field:Attribute(name = "id", required = false)
    var id: String? = null,

    @field:Element(name = "g", required = false)
    var group: Group? = null
)

