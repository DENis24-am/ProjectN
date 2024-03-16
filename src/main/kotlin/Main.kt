import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import ui.screen.GameViewModel
import ui.screen.composable.GameScren

@Composable
@Preview
fun App(viewModel: GameViewModel) {
    MaterialTheme {
        GameScren(
            viewModel = viewModel
        )
    }
}

fun main() = application {
    val viewModel = GameViewModel()
    Window(
        onCloseRequest = ::exitApplication,
        resizable = true
    ) {
        App(viewModel)
    }
}