package com.aryastudio.kotlinsearch.seeders

import com.aryastudio.kotlinsearch.models.Product
import com.aryastudio.kotlinsearch.repositories.ProductRepository
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component
import kotlin.random.Random

/*
@Component
class DataSeeder(private val productRepository: ProductRepository): ApplicationRunner {
    override fun run(args: ApplicationArguments?) {

            val product = Product()
            product.title = "Title anjing"
            product.description="Description kontol"
            product.image = "http://lorempixel.com/200x200?" + Random.nextInt(1000)
            product.price = Random.nextInt(10, 100)
           ///println(product.price)
           this.productRepository.save(product)

    }


}
*/
