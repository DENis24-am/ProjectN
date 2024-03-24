package ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import model.button.ButtonInfoUi
import model.json.ActionJsonUi
import model.svg.ImageUi

@Composable
fun DrawScenes(
    images: List<ImageUi>,
    buttons: List<ButtonInfoUi>,
    screenWidth: Int,
    screenHeight: Int,
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
            screenWith = screenWidth,
            screenHeight = screenHeight,
            buttonsUi = buttons,
            onClick = onClick
        )
        content()
    }
}