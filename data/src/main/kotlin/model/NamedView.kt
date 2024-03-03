package model

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Root

@Root(name = "namedview")
data class NamedView(
    @field:Attribute(name = "id")
    var id: String? = null,

    @field:Attribute(name = "pagecolor")
    var pageColor: String? = null
)