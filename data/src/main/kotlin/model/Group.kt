package model

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

@Root(name = "g")
data class Group(
    @field:Attribute(name = "label")
    var label: String? = null,

    @field:Attribute(name = "groupmode")
    var groupMode: String? = null,

    @field:Attribute(name = "id")
    var id: String? = null,

    @field:ElementList(inline = true, entry = "rect")
    var rects: List<Rect>? = null
)