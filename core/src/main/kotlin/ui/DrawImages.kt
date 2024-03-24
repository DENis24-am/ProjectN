package ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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
            modifier = modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }
}