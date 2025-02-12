import kotlin.math.ceil

fun main() {
    val price = 15_000
    val startPrice = 1_000
    val maxPrice = 10_000
    val discount = 100
    val maxDiscount = 0.95
    val regularCustomerDiscount = true

    val result =
        if (regularCustomerDiscount) price * maxDiscount * 0.99
        else if (price > maxPrice) price.toDouble() * maxDiscount
        else if (price > startPrice) price.toDouble() - discount
        else price.toDouble()

    println(ceil(result).toInt())
}
