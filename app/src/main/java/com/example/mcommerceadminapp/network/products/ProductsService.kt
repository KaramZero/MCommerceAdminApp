package com.example.mcommerceadminapp.network.products

import com.example.mcommerceadminapp.model.Keys
import com.google.gson.JsonObject
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.*

interface ProductsService {

    @Headers(
        "X-Shopify-Access-Token: ${Keys.Shopify_Access_Token}",
        "Content-Type: ${Keys.Content_Type}"
    )
    @GET(Keys.PRODUCTS)
    suspend fun getAllProducts(): Response<JsonObject>


    @Headers(
        "X-Shopify-Access-Token: ${Keys.Shopify_Access_Token}",
        "Content-Type: ${Keys.Content_Type}"
    )
    @POST(Keys.PRODUCTS)
    suspend fun addProducts(
        @Body requestBody: RequestBody
    ): Response<JsonObject>

    @Headers(
        "X-Shopify-Access-Token: ${Keys.Shopify_Access_Token}",
        "Content-Type: ${Keys.Content_Type}"
    )
    @POST(Keys.PRODUCTS + "/{resource}/images.json")
    suspend fun addProductImage(
        @Body requestBody: RequestBody,
        @Path("product_id") productID: String
    ): Response<JsonObject>

    @Headers(
        "X-Shopify-Access-Token: ${Keys.Shopify_Access_Token}",
        "Content-Type: ${Keys.Content_Type}"
    )
    @DELETE("products/{productID}.json")
    suspend fun deleteProductByID(@Path("productID") productID: String): Response<JsonObject>

    @Headers(
        "X-Shopify-Access-Token: ${Keys.Shopify_Access_Token}",
        "Content-Type: ${Keys.Content_Type}"
    )
    @POST(Keys.INVENTORY_LEVEL)
    suspend fun setInventoryLevel(
        @Body requestBody: RequestBody
    ): Response<JsonObject>

    @Headers(
        "X-Shopify-Access-Token: ${Keys.Shopify_Access_Token}",
        "Content-Type: ${Keys.Content_Type}"
    )
    @POST("products/{productID}/images.json")
    suspend fun addProductImage(
        @Path("productID") productID: String,
        @Body requestBody: RequestBody
    ): Response<JsonObject>

}