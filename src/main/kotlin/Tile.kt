package com.project

enum class TileColor {
    RED, BLUE, BLACK, YELLOW
}


data class Tile(val number: Int, val color: TileColor) {
    init {
        require(number in 1..13) { "Tile number must be between 1 and 13" }
    }
}
