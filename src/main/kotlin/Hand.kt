package com.project

class Hand {
    val tiles = mutableListOf<Tile>()

    fun addTile(tile: Tile) {
        tiles.add(tile)
    }

    fun removeTile(tile: Tile) {
        tiles.remove(tile)
    }
}