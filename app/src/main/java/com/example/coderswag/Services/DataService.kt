package com.example.coderswag.Services

import com.example.coderswag.model.Category
import com.example.coderswag.model.Product

object DataService {
    val categories  = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie" , "18$", "hats01"),
        Product("Devslopes Hat Black" , "20$", "hats02"),
        Product("Devslopes Hat White" , "18$", "hats03"),
        Product("Devslopes Hat SnapBack" , "22$", "hats04")
    )

    val hoodies = listof(
        Product("Devslopes Hoodie Gray", "28$", "hoodie01"),
        Product("Devslopes Hoodie Red", "32$", "hoodie02"),
        Product("Devslopes Gray Hoodie", "28$", "hoodie03"),
        Product("Devslopes Black Hoodie", "32$", "hoodie04")
        )

    val shirts = listof(
        Product("Devslopes Shirt Gray", "18$", "shirt01"),
        Product("Devslopes Badge Light Gray", "20$", "shirt02"),
        Product("Devslopes Logo Shirt Red", "22$", "shirt03"),
        Product("Devslopes Hustle", "22$", "shirt04"),
        Product("KickFlip Studios", "18$", "shirt05")
        )
}