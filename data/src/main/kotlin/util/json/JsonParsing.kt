package util.json

import com.google.gson.Gson
import model.json.ActionJsonUi

class JsonParsing : JsonParser {
    private val gson = Gson()

    override fun parseJson(path: String): ActionJsonUi {
        return gson.fromJson(path, ActionJsonUi::class.java)
    }
}