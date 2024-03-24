package ui.screen.composable

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import ui.DrawScenes
import ui.screen.GameViewModel

@Composable
fun GameScren(
    viewModel: GameViewModel,
    screenWidth: Int,
    screenHeight: Int,
    modifier: Modifier = Modifier
) {
    val state by viewModel.state.collectAsState()

    DrawScenes(
        images = state.images,
        buttons = state.buttonsInfo,
        screenWidth = screenWidth,
        screenHeight = screenHeight,
        onClick = viewModel::moveTo,
        modifier = modifier
    )
}

