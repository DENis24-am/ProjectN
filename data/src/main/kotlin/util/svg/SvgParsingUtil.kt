package util.svg

import model.svg.ImageUi
import model.svg.RectUi
import model.svg.Svg
import model.svg.toUiModel
import org.simpleframework.xml.Serializer
import org.simpleframework.xml.core.Persister
import java.io.InputStream

class SvgParsingUtil : SvgParsing {
    private var svgCode: String = ""
    private val serializer: Serializer = Persister()
    private var data: Svg? = null

    override fun getAllRect(): List<RectUi> {
        return data?.group?.rects.orEmpty().map { it.toUiModel() }
    }

    override fun getAllImages(): List<ImageUi> {
        return data?.group?.images.orEmpty().map { it.toUiModel() }
    }


    override fun parseSvgFromAsset(path: String) {
        val svgInputStream: InputStream = javaClass.classLoader.getResourceAsStream(path) ?: throw FoundAssetException()
        svgCode = svgInputStream.bufferedReader().use { it.readText() }
        data = serializer.read(Svg::class.java, svgCode.trimIndent())
    }
}

class FoundAssetException : Exception()