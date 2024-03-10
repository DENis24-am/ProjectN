package ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import model.json.ActionJsonUi
import model.svg.ImageUi
import model.svg.RectUi

@Composable
fun DrawScenes(
    images: List<ImageUi>,
    buttons: List<RectUi>,
    modifier: Modifier = Modifier,
    onClick: (ActionJsonUi) -> Unit = {},
    content: @Composable () -> Unit = {}
) {
    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        DrawImages(
            images = images,
            modifier = Modifier
        )
        DrawButton(
            buttons = buttons,
            modifier = Modifier,
            onClick = onClick
        )
        content()
    }
}