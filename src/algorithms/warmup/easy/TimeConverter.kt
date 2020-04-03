package algorithms.warmup.easy

import java.text.SimpleDateFormat
import java.util.*

fun timeConversion(time: String): String {
    val inFormat = SimpleDateFormat("hh:mm:ssa")
    val outFormat = SimpleDateFormat("HH:mm:ss")
    val unparsedTime = inFormat.parse(time)

    return outFormat.format(unparsedTime)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val time = scan.nextLine()

    println(timeConversion(time))
}