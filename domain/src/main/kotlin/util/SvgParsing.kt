package util

import model.RectUi

interface SvgParsing {
    fun getAllRect(): List<RectUi>
    fun setSvg(path: String)
}