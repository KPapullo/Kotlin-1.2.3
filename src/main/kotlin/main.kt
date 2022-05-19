package ru.netology

val MUSIC_LOVER = true
val DISCOUNT_5_PERCENTS = 0.05
val DISCOUNT_100_RUBLES = 100

fun main() {


    print("Введите сумму покупки: ")
    var purchase = readLine()?.toDouble() ?: return
    var sumPurchaseWithDiscount: Double

    if (purchase > 1_000) {
        sumPurchaseWithDiscount = purchase - DISCOUNT_100_RUBLES
        println("Сумма покупки со скидкой 5%: ${sumPurchaseWithDiscount.toInt()} руб ${sumPurchaseWithDiscount.toInt() % 100} коп")
    } else if (purchase > 10_000) {
        sumPurchaseWithDiscount = purchase - (purchase * DISCOUNT_5_PERCENTS)
        println("Сумма покупки со скидкой 100 рублей: ${sumPurchaseWithDiscount.toInt()} руб ${sumPurchaseWithDiscount.toInt() % 100} коп")
    } else {
        sumPurchaseWithDiscount = purchase
        println("Сумма покупки: ${sumPurchaseWithDiscount.toInt()} руб ${sumPurchaseWithDiscount.toInt() % 100} коп")
    }

    if (MUSIC_LOVER == true) sumPurchaseWithDiscount * 0.99 else sumPurchaseWithDiscount



    println("Сумма покупки с дополнительной скидкой 1% для постоянных клиентов: ${sumPurchaseWithDiscount.toInt()} руб ${sumPurchaseWithDiscount.toInt() % 100} коп")
}





