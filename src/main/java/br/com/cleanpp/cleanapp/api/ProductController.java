package br.com.cleanpp.cleanapp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    
    @Autowired
    private ProductRepository repository;

    @GetMapping("/products")
    public List<Product> listProducts(){
        List<Product> products = repository.findAll();
        return products;
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product){
        Product savedProduct = repository.save(product);
        return savedProduct;
    }

}
