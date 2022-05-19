package ru.netology


fun main() {

    val meloman = true
    var sumPurchaseWithDiscount: Double

    print("Введите сумму покупки: ")
    var purchase = readLine()?.toDouble() ?: return

    if (purchase > 1_000) {
        sumPurchaseWithDiscount = purchase - 100
        println("Сумма покупки со скидкой 5%: ${sumPurchaseWithDiscount.toInt()} руб ${sumPurchaseWithDiscount.toInt() % 100} коп")
    } else if (purchase > 10_000) {
        sumPurchaseWithDiscount = (purchase * 0.95)
        println("Сумма покупки со скидкой 100 рублей: ${sumPurchaseWithDiscount.toInt()} руб ${sumPurchaseWithDiscount.toInt() % 100} коп")
    } else {
        sumPurchaseWithDiscount = purchase
        println("Сумма покупки: ${sumPurchaseWithDiscount.toInt()} руб ${sumPurchaseWithDiscount.toInt() % 100} коп")
    }

    val melomanAmount = when (meloman) {
        true -> sumPurchaseWithDiscount * 0.99
        else -> sumPurchaseWithDiscount
    }

    println("Сумма покупки с дополнительной скидкой 1% для постоянных клиентов: ${melomanAmount.toInt()} руб ${melomanAmount.toInt() % 100} коп")

}



