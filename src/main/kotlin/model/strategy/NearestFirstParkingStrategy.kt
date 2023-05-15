package model.strategy

import java.util.*

/**
 * Created by MD FAIZAN
 */
class NearestFirstParkingStrategy : BaseParkingStrategy {

    private val freeSlots: TreeSet<Int> = TreeSet()

    override fun addSlot(i: Int) {
        freeSlots.add(i)
    }

    override fun getSlot(): Int {
        return freeSlots.first()
    }

    override fun removeSlot(slot: Int) {
        freeSlots.remove(slot)
    }
}