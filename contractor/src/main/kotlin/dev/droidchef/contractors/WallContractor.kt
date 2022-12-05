package dev.droidchef.contractors

import dev.droidchef.wall.Wall

class WallContractor {

    init {
        println("Hello I am the Wall Contractor")
    }

    companion object {

        fun buildDryWall(height: Double, width: Double, depth: Double): Wall {
            println("Hello I am the Wall Contractor")
            return DryWall(h = height, w = width, d = depth)
        }

    }
}