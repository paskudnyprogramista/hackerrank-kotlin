package algorithms.warmup.easy

import java.util.*

fun birthdayCakeCandles(candles: Array<Int>): Int? {
    val countedCandles = candles.groupingBy { it }.eachCount().maxBy { it.value }

    return countedCandles?.value
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val count = scan.nextLine().trim().toInt()

    val array = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = birthdayCakeCandles(array)

    println(result)
}