package ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import model.svg.ImageUi

@Composable
fun DrawImages(
    images: List<ImageUi>,
    modifier: Modifier = Modifier
) {
    images.forEach { image ->
        Image(
            painter = painterResource("assets/${image.href}"),
            contentDescription = null,
            modifier = modifier
                .offset(image.x?.dp ?: 0.dp, image.y?.dp ?: 0.dp)
                .size(image.width?.dp ?: 10.dp, image.height?.dp ?: 10.dp)
        )
    }
}