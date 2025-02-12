fun main() {
    val comSize = 0.75
    val amount = 69

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
