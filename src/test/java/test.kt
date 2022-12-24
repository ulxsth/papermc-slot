fun test() {
    val figures: Array<Int> = arrayOf(0, 0, 0)
    var reel = ""
    for (i in 0..2) {
        figures[i] = (0..9).random()
        reel += figures[i]
        reel += " "
    }
    println(reel)
    if (figures[0] == figures[1] && figures[1] == figures[2]) {
        println("HIT!!")
    } else {
        println("Boo")
    }
}