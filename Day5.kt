//in progress
fun main() {
    val a = MutableList(readln().toInt()) { readln() }
    val b = MutableList(readln().toInt()) { readln() }
    val c = MutableList(readln().toInt()) { readln() }
    for (i in 0 until readln().toInt()) {
        print("move\t")
        val number = readln().toInt()
        print("from\t")
        val firstPosition = readln().toInt()
        print("to\t")
        val secondPosition = readln().toInt()
        for (j in 0 until number) {
            if (firstPosition == 1 && secondPosition == 2) {
                move(a, b)
            } else if (firstPosition == 2 && secondPosition == 1) {
                move(b, a)
            } else if (firstPosition == 3 && secondPosition == 2) {
                move(c, b)
            } else if (firstPosition == 2 && secondPosition == 3) {
                move(b, c)
            } else if (firstPosition == 3 && secondPosition == 1) {
                move(c, a)
            } else if (firstPosition == 1 && secondPosition == 3) {
                move(a, c)
            }
        }
    }
    println("${a.last()}${b.last()}${c.last()}")


}
fun move(c1: MutableList<String>, c2: MutableList<String>) {
    c2 + c1.last()
    c1.dropLast(c1.size)
}