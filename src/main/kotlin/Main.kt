import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import util.SvgParsing
import util.SvgParsingUtil

@OptIn(ExperimentalComposeUiApi::class)
@Composable
@Preview
fun App() {
    val pars: SvgParsing = SvgParsingUtil()

    pars.setSvg("drawing.svg")

    MaterialTheme {
        LazyColumn {
            items(pars.getAllRect()) {
                Text(it.toString())
            }
        }
    }
}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        resizable = true
    ) {
        App()
    }
}