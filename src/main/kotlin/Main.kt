const val PRICE: Int = 1000

fun main() {
    print("Is regular client: ")
    val isRegularClient = readln() == "yes"

    print("Previous purchases: ")
    val previousPurchases = readln().toInt()

    print("Number of goods: ")
    val numberOfGoods = readln().toInt()

    val finalPrice = discountCalc(numberOfGoods, previousPurchases)

    println("Product amount: $finalPrice")
    if (isRegularClient) println("With 1% discount: ${finalPrice * 99 / 100}")
}


fun discountCalc(numberOfGoods: Int, previousPurchases: Int): Int {
    var productAmount = numberOfGoods * PRICE

    if (previousPurchases in 1001..10000) {
        productAmount = numberOfGoods * PRICE - 100
    } else if (previousPurchases >= 10001) {
        productAmount = productAmount * 95 / 100
    }
    return productAmount
}


