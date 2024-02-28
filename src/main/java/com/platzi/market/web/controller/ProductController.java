package com.platzi.market.web.controller;

import com.platzi.market.domain.Product;
import com.platzi.market.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public List<Product> getAAll() {
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProduct(@PathVariable("id") Long productId) {
        return productService.getProduct(productId);
    }

    @GetMapping("/category/{id}")
    public Optional<List<Product>> getByCategory(@PathVariable("id") Long categoryId) {
        return productService.getByCategory(categoryId);
    }

    @GetMapping("/quantity/{id}")
    public Optional<List<Product>> getScarseProducts(Long quantity) {
        return productService.getScarseProducts(quantity);
    }

    @PostMapping("")
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Long productId) {
        return productService.delete(productId);
    }
}