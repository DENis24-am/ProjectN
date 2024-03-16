package util.json

import model.json.ActionJsonUi

interface JsonParser {
    fun parseJson(path: String): ActionJsonUi
}