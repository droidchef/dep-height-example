package house

import dev.droidchef.foundation.Foundation
import dev.droidchef.wall.Wall

data class FourByFourRoom(
    val foundation: Foundation,
    val walls: ArrayList<Wall> = ArrayList(4)
)