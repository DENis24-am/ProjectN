package util.svg

import model.svg.ImageUi
import model.svg.RectUi

interface SvgParsing {
    fun getAllRect(): List<RectUi>

    fun getAllImages(): List<ImageUi>
    fun parseSvgFromAsset(path: String)
}