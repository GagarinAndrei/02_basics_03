const val PRICE: Int = 1000

fun main() {
    print("Is regular client: ")
    val isRegularClient = readln() == "yes"

    print("Previous purchases: ")
    val previousPurchases = readln().toInt()

    print("Number of goods: ")
    val numberOfGoods = readln().toInt()

    val finalPrice = discountCalc(numberOfGoods, previousPurchases, isRegularClient)

    if (isRegularClient) {
        println(
            "Product amount: $finalPrice\n" +
                    "With 1% discount: ${finalPrice * 99 / 100}"
        )
    } else {
        println("Product amount: $finalPrice")
    }
}

fun discountCalc(numberOfGoods: Int, previousPurchases: Int, isRegularClient: Boolean): Int {
    var productAmount = numberOfGoods * PRICE

    if (previousPurchases in 1001..10000) {
        productAmount = numberOfGoods * (PRICE - 100)
    } else if (previousPurchases >= 10001) {
        productAmount = productAmount * 95 / 100
    }
    return productAmount
}


