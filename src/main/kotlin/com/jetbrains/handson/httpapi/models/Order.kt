package com.jetbrains.handson.httpapi.models

import kotlinx.serialization.Serializable

val orderStorage = listOf(
    Order("1", listOf(
        OrderItem("Ham Sandwitch", 2, 5.50),
        OrderItem("Water", 1, 1.50),
        OrderItem("Beer", 3, 2.30)
    )),
    Order("2", listOf(
        OrderItem("CheeseBurger", 5, 80.00),
        OrderItem("Coke", 1, 1.75)
    ))
)

@Serializable
data class Order(val number: String, val contents: List<OrderItem>)

@Serializable
data class OrderItem(val item: String, val amount: Int, val price: Double)
