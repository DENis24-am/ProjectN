package util

import java.io.File

class FindAssetsUtil : FindAssets {
    override fun getAsset(fileName: String): Boolean {
        println(File(fileName).exists()) // delete this
        return File(fileName).exists()
    }
}