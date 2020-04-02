package algorithms.warmup.easy

import java.util.*
import kotlin.collections.*
import kotlin.text.*

fun plusMinus(array: Array<Int>): HashMap<Int, MutableList<Int>> {
    val hashMap = hashMapOf(
        0 to mutableListOf<Int>(),
        1 to mutableListOf<Int>(),
        2 to mutableListOf<Int>()
    )

    return array.groupByTo(hashMap, {
        when {
            it > 0.0 -> 0
            it < 0.0 -> 1
            else -> 2
        }
    })
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val array = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    for ((_, value) in plusMinus(array)) {
        val result = value.count().toFloat() / n

        println("%.6f".format(result))
    }
}
