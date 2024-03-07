package model

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "title", strict = false)
data class Title(
    @field:Element
    var value: String? = null
)