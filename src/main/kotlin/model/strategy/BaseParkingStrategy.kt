package model.strategy

/**
 * Created by MD FAIZAN
 */
interface BaseParkingStrategy {
    fun addSlot(i: Int)

    fun getSlot(): Int

    fun removeSlot(slot: Int)
}