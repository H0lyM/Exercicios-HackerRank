package kt.algorithms.implementation

//https://www.hackerrank.com/challenges/drawing-book/problem
fun pageCount(n: Int, p: Int): Int {
    val endToGoal = n - p
    return if (p == n || p == 1 || n < p) 0
    else if (p < endToGoal) advanceForward(p)
    else advanceBackwards(endToGoal, n)
}

fun roundNumber(number: Int): Int {
    return number - (number % 2)
}

fun advanceForward(pagesToTurn: Int): Int {
    return roundNumber(pagesToTurn) / 2
}

fun advanceBackwards(pagesToTurn: Int, lastPageNumber: Int): Int {
    return if (pagesToTurn == 1 && lastPageNumber % 2 == 0) 1
    else if (pagesToTurn % 2 == 1) (pagesToTurn - 1) / 2
    else pagesToTurn / 2
}

fun main() {
    println(pageCount(5, 4))
}



