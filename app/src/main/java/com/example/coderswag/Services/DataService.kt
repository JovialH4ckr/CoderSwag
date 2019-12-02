package com.example.coderswag.Services

import com.example.coderswag.model.Category
import com.example.coderswag.model.Product as Product1

object DataService {
    val categories  = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
        Product1("Devslopes Graphic Beanie" , "18$", "hats01"),
        Product1("Devslopes Hat Black" , "20$", "hats02"),
        Product1("Devslopes Hat White" , "18$", "hats03"),
        Product1("Devslopes Hat SnapBack" , "22$", "hats04")
    )

    val hoodies = listOf(
        Product1("Devslopes Hoodie Gray", "28$", "hoodie01"),
        Product1("Devslopes Hoodie Red", "32$", "hoodie02"),
        Product1("Devslopes Gray Hoodie", "28$", "hoodie03"),
        Product1("Devslopes Black Hoodie", "32$", "hoodie04")
        )

    val shirts = listOf(
        Product1("Devslopes Shirt Gray", "18$", "shirt01"),
        Product1("Devslopes Badge Light Gray", "20$", "shirt02"),
        Product1("Devslopes Logo Shirt Red", "22$", "shirt03"),
        Product1("Devslopes Hustle", "22$", "shirt04"),
        Product1("KickFlip Studios", "18$", "shirt05")
        )
}