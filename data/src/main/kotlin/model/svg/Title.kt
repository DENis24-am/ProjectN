package model.svg

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Root
import org.simpleframework.xml.Text

@Root(name = "title", strict = false)
data class Title(

    @field:Attribute(name = "id", required = false)
    var id: String? = null,
    @field:Text(required = false)
    var value: String? = null
)

fun Title.toUiModel(): TitleUi {
    return TitleUi(
        id = id,
        value = value
    )
}