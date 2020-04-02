package algorithms.warmup.easy

import java.util.*
import kotlin.text.*

fun staircase(n: Int): Unit {
    for (i in 1..n) {
        println("#".repeat(i).padStart(n, ' '))
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    staircase(n)
}