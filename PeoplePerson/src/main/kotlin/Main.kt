fun main() {
    val like = 19911
    printLike(like)
}
fun printLike(like: Int) {
    if (like % 10 != 1 || like % 100 == 11) {
        println("Понравилось $like людям")
    } else
        println("Понравилось $like человеку")
}
