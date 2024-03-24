package util

import model.json.ActionJsonUi
import util.json.JsonParsing

fun jsonParse(pathJson: String): ActionJsonUi {
    return JsonParsing().parseJson(pathJson)
}