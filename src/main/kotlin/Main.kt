@file:Suppress("UNUSED_CHANGED_VALUE")
fun calculateWordStat(input: String): String {
    var list = input.split(" ")
    var temp = ""
    var number = 0
    var result = ""

    for (i in 0..list.size - 1) {
        var count = 0
        for (j in 0..list.size - 1) {
            if (list[i] == list[j])
                count++
        }
        if (count > number) {
            number = count
            result = list[i]
        }
    }
    var r = "$result встречается $number раз"
    println(r)
    return r
}
fun main(args: Array<String>) {
    calculateWordStat("q ee fd q jj q jj q q")

}






