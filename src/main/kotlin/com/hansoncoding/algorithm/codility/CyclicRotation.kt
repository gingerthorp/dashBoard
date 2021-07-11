package com.hansoncoding.algorithm.codility

class CyclicRotation {
}

fun solution(A: IntArray, K: Int): IntArray {

    val A_result = A.copyOf()
    val size = A.size
    var i = 0

    for (a in A) {
        val target = (i + K) % size
        A_result[target] = a
        i += 1
    }

    return A_result
}

fun main() {
    val arr = IntArray(5, { 0 })
    arr[0] = 1
    arr[1] = 2
    arr[2] = 3
    arr[3] = 4
    arr[4] = 5


    solution(arr, 3)
}