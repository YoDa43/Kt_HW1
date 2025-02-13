import kotlin.math.ceil

fun main() {
    val price = 15_000
    val startPrice = 1_000
    val maxPrice = 10_000
    val discount = 100
    val maxDiscount = 0.95
    val regularCustomerDiscount = false

    val result = when {
        (price > maxPrice) -> price * maxDiscount
        (price > startPrice) -> price - discount
        else -> price
    }

    val discounted = if (regularCustomerDiscount) result.toDouble() * 0.99
    else result.toDouble()

    println(ceil(discounted).toInt())
}