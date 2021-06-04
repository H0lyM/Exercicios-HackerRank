package kt.algorithms.implementation

//https://www.hackerrank.com/challenges/counting-valleys/problem?h_r=next-challenge&h_v=zen

fun countingValleys(steps: Int, path: String): Int {
    // Write your code here
    var currentPathLevel = 0
    var valleyCount = 0
    val pathArray = path.toCharArray()
    var passingTheValley = false

    for (currentPath: Char in pathArray) {
        if (currentPath == 'D') currentPathLevel -= 1
        else currentPathLevel += 1

        if (currentPathLevel < 0) passingTheValley = true

        if (passingTheValley && currentPathLevel == 0) {
            passingTheValley = false
            valleyCount++
        }
    }

    return valleyCount
}

fun main() {
    println("result=" + countingValleys(12, "DDUUDDUDUUUD"))

}
