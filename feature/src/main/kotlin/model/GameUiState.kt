package model

import model.button.ButtonInfoUi
import model.svg.ImageUi

data class GameUiState(
    val images: List<ImageUi> = listOf(),
    val buttonsInfo: List<ButtonInfoUi> = listOf(),
    val currentImage: String = "img1"
)
