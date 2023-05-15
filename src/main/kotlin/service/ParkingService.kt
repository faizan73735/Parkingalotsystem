package service

import exception.ParkingException
import model.Car

/**
 * Created by MD FAIZAN
 */
interface ParkingService: BaseService {
    @Throws(ParkingException::class)
    fun createParkingLot(capacity: Int)

    fun parkVehicle(car: Car)
    fun leave(registrationNumber: String, hour: Int)
    fun status()

}