package model

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

@Root(name = "g", strict = false)
data class Group(
    @field:Attribute(name = "label", required = false)
    var label: String? = null,

    @field:Attribute(name = "groupmode", required = false)
    var groupMode: String? = null,

    @field:Attribute(name = "id", required = false)
    var id: String? = null,

    @field:ElementList(inline = true, entry = "rect", required = false)
    var rects: List<Rect>? = null
)