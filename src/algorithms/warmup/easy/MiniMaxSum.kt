package algorithms.warmup.easy

import java.util.*
import kotlin.collections.*
import kotlin.text.*

fun minMaxSum(array: Array<Long>): String {
    val sortedValues: Array<Long> = array.sortedArray()
    val sumOfHead = sortedValues.take(4).sum()
    val sumOfTail = sortedValues.takeLast(4).sum()

    return "$sumOfHead $sumOfTail"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val array = scan.nextLine().split(" ").map{ it.trim().toLong() }.toTypedArray()

    println(minMaxSum(array))
}