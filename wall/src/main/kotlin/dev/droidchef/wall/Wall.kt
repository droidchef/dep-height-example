package dev.droidchef.wall

interface Wall {
    fun getHeight(): Double
    fun getWidth(): Double
    fun getDepth(): Double
    fun getType(): String
    fun hasInsulation(): Boolean
}