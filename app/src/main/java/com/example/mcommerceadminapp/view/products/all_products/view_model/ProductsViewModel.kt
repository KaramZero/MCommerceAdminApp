package com.example.mcommerceadminapp.view.products.all_products.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mcommerceadminapp.model.shopify_repository.products.ProductsRepo
import com.example.mcommerceadminapp.pojo.products.Products
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ProductsViewModel(private val repo: ProductsRepo) : ViewModel() {
    private val _products = MutableLiveData<ArrayList<Products>>()
    val products:LiveData<ArrayList<Products>> = _products

    private val _finished = MutableLiveData<Boolean>()
    val finished:LiveData<Boolean> = _finished
    fun getAllProduct(){
        viewModelScope.launch(Dispatchers.IO) {
            val res = repo.getAllProducts()
                _products.postValue(res)
//            withContext(Dispatchers.Main){
//                _products.value = res
//            }
        }
    }

    fun addProduct(products: Products){
        viewModelScope.launch(Dispatchers.IO) {
            val res = repo.addProduct(products)
            repo.addProductImage(res.id!!,products.image!!.src!!)

            withContext(Dispatchers.Main){
                _finished.value = true
            }
        }
    }

    fun deleteProductByID(productID:String){
        viewModelScope.launch(Dispatchers.IO) {
            repo.deleteProductByID(productID)
        }
    }
}