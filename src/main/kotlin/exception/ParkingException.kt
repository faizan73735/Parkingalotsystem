/**
 *
 */
package exception

/**
 * Created by MD FAIZAN
 */
class ParkingException : Exception {

    constructor(message: String?) : super(message)
    constructor(throwable: Throwable?) : super(throwable)
    constructor(message: String?, throwable: Throwable?) : super(message, throwable)

}