package dev.droidchef.contractors

import dev.droidchef.wall.Wall

class WallContractor {

    companion object {

        fun buildDryWall(height: Double, width: Double, depth: Double): Wall {
            return DryWall(h = height, w = width, d = depth)
        }

    }
}