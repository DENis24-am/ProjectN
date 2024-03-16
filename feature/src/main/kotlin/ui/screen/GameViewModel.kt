package ui.screen

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import model.GameUiState
import model.json.ActionJsonUi
import model.svg.ImageUi
import model.svg.RectUi
import util.FindAssets
import util.FindAssetsUtil
import util.svg.SvgParsingUtil

class GameViewModel {
    private val _state = MutableStateFlow(GameUiState())
    val state = _state.asStateFlow()

    private val svgParser = SvgParsingUtil()

    private val findAssets: FindAssets = FindAssetsUtil()

    init {
        svgParser.parseSvgFromAsset("assets/img1.svg")
        setCurrentImage(
            "img1",
            svgParser.getAllImages(),
            svgParser.getAllRect()
        )
    }

    fun moveTo(actionJsonUi: ActionJsonUi) {
        println(actionJsonUi) // delete this
//        if(findAssets.getAsset("assets/${actionJsonUi.destination}.svg")) {
        val svgPath = "assets/${_state.value.currentImage}.svg"
        svgParser.parseSvgFromAsset(svgPath)
        setCurrentImage(
            actionJsonUi.destination,
            svgParser.getAllImages(),
            svgParser.getAllRect()
        )

        println(svgParser.getAllRect()) // delete this
//        }
    }


    private fun setCurrentImage(
        image: String,
        images: List<ImageUi>,
        rects: List<RectUi>
    ) {
        _state.update {
            _state.value.copy(
                currentImage = image,
                images = images,
                rect = rects
            )
        }
    }
}