package ui

import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.unit.dp
import model.json.ActionJsonUi
import model.svg.RectUi
import util.json.JsonParsing

@Composable
fun DrawButton(
    buttons: List<RectUi>,
    modifier: Modifier = Modifier,
    onClick: (ActionJsonUi) -> Unit = {}
) {
    val json = JsonParsing()
    buttons.forEach { button ->
        Button(
            onClick = {
                onClick(json.parseJson(button.titleUi?.value ?: ""))
            },
            modifier = modifier
                .offset(button.x.dp, button.y.dp)
                .size(button.width.dp, button.height.dp)
                .alpha(0.7f)
        ) {
        }
    }
}