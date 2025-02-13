fun main() {
    val comSize = 0.0075
    val amount = 7500

    comRes(comSize, amount)
}
fun comRes(comSize: Double, amount: Int){
    var res = (amount * comSize).toInt()
    if (res < 35) {
        res = 35
        println("Размер комисии: $res")
    } else {
        println("Размер комисии: $res")
    }
}
