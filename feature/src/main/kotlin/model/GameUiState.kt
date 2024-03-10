package model

import model.svg.ImageUi
import model.svg.RectUi

data class GameUiState(
    val images: List<ImageUi> = listOf(),
    val rect: List<RectUi> = listOf(),
    val currentImage: String = "img1"
)
