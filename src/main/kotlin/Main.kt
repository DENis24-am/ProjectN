import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import ui.screen.GameViewModel
import ui.screen.composable.GameScren

@Composable
@Preview
fun App(
    screenWidth: Int,
    screenHeight: Int,
    viewModel: GameViewModel
) {
    MaterialTheme {
        GameScren(
            screenWidth = screenWidth,
            screenHeight = screenHeight,
            viewModel = viewModel
        )
    }
}

val viewModel = GameViewModel()

@OptIn(ExperimentalComposeUiApi::class)
fun main() = application {

    val windowState = remember { mutableStateOf(WindowState(width = 1920.dp, height = 1080.dp)) }

    Window(
        onCloseRequest = ::exitApplication,
        state = windowState.value,
        resizable = true
    ) {
        val screenWidth = LocalWindowInfo.current.containerSize.width
        val screenHeight = LocalWindowInfo.current.containerSize.height

        App(
            screenWidth = screenWidth,
            screenHeight = screenHeight,
            viewModel
        )
    }
}

