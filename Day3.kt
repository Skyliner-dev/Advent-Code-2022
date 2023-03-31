//still in progress
fun main() {
    val l = readln().toInt()
    val ruckSack = MutableList(l) { readln() }
    var s1: String
    var s2: String
    val list = mutableListOf<Char>()
    for (i in 0 until l) {
        ruckSack[i].also { ti ->
            ti.substring(0, ti.length / 2).also { s1 = it }
            ti.substring(ti.length / 2, ti.length).also { s2= it }
            for (j in s1 ) {
                for (k in s2) {
                    if (j==k) {
                        list.add(k)
                    }
                }
            }
        }
    }
    println(sum(list.toCharArray()))
}
fun priority(c:Char) :Int{
    return when(c) {
        'a' ->1
        'b' ->2
        'c' ->3
        'd' ->4
        'e' ->5
        'f' ->6
        'g' ->7
        'h' ->8
        'i' ->9
        'j' ->10
        'k' ->11
        'l' ->12
        'm' ->13
        'n' ->14
        'o' ->15
        'p' ->16
        'q' ->17
        'r' ->18
        's' ->19
        't' ->20
        'u' ->21
        'v' ->22
        'w' ->23
        'x' ->24
        'y' ->25
        'z' ->26
        'A' ->27
        'B' ->28
        'C' ->29
        'D' ->30
        'E' ->31
        'F' ->32
        'G' ->33
        'H' ->34
        'I' ->35
        'J' ->36
        'K' ->37
        'L' ->38
        'M' ->39
        'N' ->40
        'O' ->41
        'P' ->42
        'Q' ->43
        'R' ->44
        'S' ->46
        'T' ->47
        'U' ->48
        'V' ->49
        'W' ->50
        'X' ->51
        'Y' ->52
        'Z' ->53
        else -> {0}
    }
}
fun sum(lol:CharArray):Int {
    var sum = 0
    for (chr in lol) {
        sum += priority(chr)
    }
    return sum
}

