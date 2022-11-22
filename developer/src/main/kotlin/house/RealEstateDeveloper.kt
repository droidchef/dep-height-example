package house

import dev.droidchef.contractors.WallContractor
import dev.droidchef.foundation.StrongFoundation
import dev.droidchef.wall.Wall

class RealEstateDeveloper {

    fun buildASimpleRoom(): FourByFourRoom {

        val foundation = StrongFoundation()

        val walls = ArrayList<Wall>()
        for (i in 1..4) {
            walls.add(WallContractor.buildDryWall(5.0, 5.0, 2.0))
        }

        return FourByFourRoom(foundation, walls)
    }

}