package com.example.mcommerceadminapp.model

import com.example.mcommerceadminapp.pojo.products.Review


class Keys {
    companion object {

        const val PRICE_RULES = "price_rules"
        const val DISCOUNT_CODE = "discount_codes"
        const val PRICE_RULES_JSON = "price_rules.json"
        const val PRODUCTS = "products.json"
        const val DISCOUNT_CODE_JSON = "discount_codes.json"
        const val INVENTORY_LEVEL = "inventory_levels/set.json"
        const val INVENTORY_LOCATION = 65322057866


        const val Shopify_Access_Token = "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"


        const val Content_Type = "application/json"

        const val BASE_URL: String = "https://madalex2022-android.myshopify.com/admin/api/2022-01/"

        val REVIEWS = listOf(
            Review(
                name = "Mariam",
                rate = 5.0F,
                date = "05/04/2021",
                desc = "This is so cool and very comfortable."
            ),
            Review(
                name = "Mahmoud",
                rate = 3.5F,
                date = "25/10/2021",
                desc = "This is so cool and very comfortable."
            ),
            Review(
                name = "Alaa",
                rate = 4.0F,
                date = "01/01/2021",
                desc = "This is so cool and very comfortable."
            ),
            Review(
                name = "Ali",
                rate = 4.5F,
                date = "16/06/2021",
                desc = "This is so cool and very comfortable."
            ),

            )

    }
}