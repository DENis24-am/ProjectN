package ui.res

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

val LocalDimen = compositionLocalOf { LocalDimension() }

data class LocalDimension(
    val alphaButton: Float = 0.8f,
    val buttonPadding: Dp = 15.dp
)