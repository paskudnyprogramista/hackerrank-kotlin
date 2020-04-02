package algorithms.warmup.easy

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun Array<Int>.scoreParallelValues(other: Array<Int>): Array<Int> {
    val scoring = Array(2) { 0 }

    for (i in indices) {
        val v1: Int = this[i]
        val v2: Int = other[i]

        when (v1.compareTo(v2)) {
            1 -> scoring[0] += 1
            -1 -> scoring[1] += 1
        }
    }

    return scoring
}

fun readTriplets(): Array<Int> = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

fun main(args: Array<String>) {
    val left: Array<Int> = readTriplets()
    val right: Array<Int> = readTriplets()

    val result = left.scoreParallelValues(right)

    println(result.joinToString(" "))
}
