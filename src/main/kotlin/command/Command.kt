package command

/**
 * Created by MD Faizan
 */
enum class Command(var inputCommand: String) {
    CREATE_PARKING("create_parking_lot"),
    PARK("park"),
    LEAVE("leave"),
    STATUS("status"),
    HELP("help"),
    EXIT("exit"),
}