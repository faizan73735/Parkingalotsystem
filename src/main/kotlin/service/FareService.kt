package service

/**
 * Created by MD FAIZAN
 */
interface FareService: BaseService {
    fun calculateFare(parkingDurationInHour: Int): Int
}