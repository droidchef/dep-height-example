package dev.droidchef.contractors

import dev.droidchef.wall.Wall

class DryWall(private val h: Double, private val w: Double, private val d: Double) : Wall {
    override fun getHeight(): Double = h

    override fun getWidth(): Double = w

    override fun getDepth(): Double = d

    override fun getType(): String = "Dry Wall"

    override fun hasInsulation(): Boolean = true
}