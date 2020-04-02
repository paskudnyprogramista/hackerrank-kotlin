package algorithms.warmup.easy

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val array = scan.nextLine().split(" ").map{ it.trim().toLong() }.toTypedArray()

    println(array.sum())
}
