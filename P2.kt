fun one (n:String):Int {
    when(n) {
        "X" -> return 1
        "Y" -> return 2
        "Z" -> return 3
    }
    return 0
}
fun win (a:String,b:String):Int {
    return if (a == "A" && b=="Y") 6
    else if (a=="B" && b=="Z") 6
    else if (a=="C" && b=="X") 6
    else 0
}
fun draw (a:String,b:String):Int {
    return if (a == "A" && b=="X") 3
    else if (a=="B" && b=="Y") 3
    else if (a=="C" && b=="Z") 3
    else 0
}
fun main() {
    var sum = 0
    val string = MutableList(3) {readln().split(" ")}
    for (i in 0..2) {
        sum += one(string[i][1]) + win(string[i][0],string[i][1]) +draw(string[i][0],string[i][1])
    }
    println(sum)

}

