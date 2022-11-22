package dev.droidchef.foundation

class WeakFoundation : Foundation {
    override fun getStrength(): Int {
        println("This is a weak foundation!!")
        return 50
    }
}