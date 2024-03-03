package util

import model.RectUi
import model.Svg
import model.toUiModel
import org.simpleframework.xml.Serializer
import org.simpleframework.xml.core.Persister
import java.io.File

class SvgParsingUtil : SvgParsing {
    private var svgText: String = ""

    override fun getAllRect(): List<RectUi> {
        val serializer: Serializer = Persister()
        val dataFetch = serializer.read(Svg::class.java, svgText.trimIndent())

        return dataFetch.group?.rects?.map { it.toUiModel() } ?: listOf()
    }

    override fun setSvg(path: String) {
        val svgFile = File(javaClass.classLoader.getResource(path)?.file ?: "")
        svgText = svgFile.readText()
    }
}