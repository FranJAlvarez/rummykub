package com.project

class TileBag {
    private val tiles = mutableListOf<Tile>()

    init {
        for (color in TileColor.entries) {
            for (number in 1..13) {
                tiles.add(Tile(number, color))
                tiles.add(Tile(number, color)) // Two of each tile in Rummikub
            }
        }
        tiles.shuffle()
    }

    fun draw(): Tile? = if (tiles.isNotEmpty()) tiles.removeAt(tiles.lastIndex) else null

    fun size(): Int = tiles.size

    fun isEmpty(): Boolean = tiles.isEmpty()
}