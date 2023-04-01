fun main() {
    //input by count
    val l = readln().toInt()
    var c = 0
    repeat(l) {
        val n = MutableList(2) { readln() }
        if (n[0].first() <= n[1].first() && n[0].last() >= n[1].last()) {
            c++
        }
    }
    println(c)
}