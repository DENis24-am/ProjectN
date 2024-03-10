package model

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "title", strict = false)
data class Title(
    @field:Element(name = "value", required = false)
    var value: String? = null
)