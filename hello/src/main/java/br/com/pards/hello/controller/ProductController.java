package br.com.pards.hello.controller;

import br.com.pards.hello.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    //Get ¬> used for data recovery
    @GetMapping("/product") //all this structure is the endpoint
    public Product showProduct(){
        Product product = new Product();
        product.setId(12345);
        product.setName("Top-of-line computer");
        product.setPrice(2500.00);
        product.setQttStock(3);

        return product;
    }

    //POST ¬> used to send data
    @PostMapping("/product")
    public String insertProduct(@RequestBody Product product){
        System.out.println("Received: " + product.getId() + " - " + product.getName() + " - " + product.getPrice() +
                " - " + product.getQttStock());
        return ("Received product");
    }


}
