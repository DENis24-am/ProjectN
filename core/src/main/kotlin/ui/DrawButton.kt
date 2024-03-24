package ui

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.unit.dp
import model.button.ButtonInfoUi
import model.button.ButtonUi
import model.json.ActionJsonUi
import ui.res.LocalDimen

@Composable
fun BoxScope.DrawButton(
    screenWith: Int,
    screenHeight: Int,
    buttonsUi: List<ButtonInfoUi>,
    onClick: (ActionJsonUi) -> Unit
) {
    buttonsUi.forEach {
        val buttonUi = it.buttonUi

        when (it.buttonUi) {
            ButtonUi.Left -> SimpleButton(
                text = "Left",
                onClick = { onClick(it.actionJsonUi) },
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .size((screenWith * buttonUi.percentWidth).dp, (screenHeight * buttonUi.percentHeight).dp)
            )

            ButtonUi.Right -> SimpleButton(
                text = "Right",
                onClick = { onClick(it.actionJsonUi) },
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .size((screenWith * buttonUi.percentWidth).dp, (screenHeight * buttonUi.percentHeight).dp)
            )

            ButtonUi.Top -> SimpleButton(
                text = "Top",
                onClick = { onClick(it.actionJsonUi) },
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .size((screenWith * buttonUi.percentWidth).dp, (screenHeight * buttonUi.percentHeight).dp)
            )

            else -> { /*Unknown button*/
            }
        }
    }
}

@Composable
private fun SimpleButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {

    Button(
        onClick = onClick,
        modifier = modifier
            .alpha(LocalDimen.current.alphaButton)
            .padding(all = LocalDimen.current.buttonPadding)
    ) {
        Text(
            text = text
        )
    }
}