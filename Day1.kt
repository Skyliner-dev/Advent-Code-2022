fun main() {
    val input = readln()
    var up=0
    var down=0
    for (i in input) {
        if (i== '(') up++
        else if (i == ')') down--
    }
    println(up+down)
}
