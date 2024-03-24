package ui.screen

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import model.GameUiState
import model.button.ButtonInfoUi
import model.button.ButtonUi
import model.json.ActionJsonUi
import model.svg.ImageUi
import model.svg.RectUi
import util.FindAssets
import util.FindAssetsUtil
import util.json.JsonParsing
import util.svg.SvgParsingUtil

class GameViewModel {
    private val _state = MutableStateFlow(GameUiState())
    val state = _state.asStateFlow()

    private val svgParser = SvgParsingUtil()

    private val findAssets: FindAssets = FindAssetsUtil()

    init {
        svgParser.parseSvgFromAsset("assets/img2.svg")
        setCurrentImage(
            "img2",
            svgParser.getAllImages(),
            svgParser.getAllRect()
        )
    }

    fun moveTo(actionJsonUi: ActionJsonUi) {
        CoroutineScope(Dispatchers.Default).launch {
            val svgPath = "assets/${_state.value.currentImage}.svg"
            svgParser.parseSvgFromAsset(svgPath)
            setCurrentImage(
                actionJsonUi.destination,
                svgParser.getAllImages(),
                svgParser.getAllRect()
            )
        }
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
                buttonsInfo = rects.map {
                    val actionJsonUi = JsonParsing().parseJson(it.titleUi?.value ?: "")
                    ButtonInfoUi(
                        buttonUi = when (actionJsonUi.id) {
                            "rect1" -> ButtonUi.Left
                            "rect2" -> ButtonUi.Right
                            "rect3" -> ButtonUi.Top
                            else -> ButtonUi.Unknown
                        },
                        actionJsonUi = actionJsonUi
                    )
                }
            )
        }
    }
}