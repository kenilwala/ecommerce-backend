package com.kenil.ecommerce.controller;

import com.kenil.ecommerce.dto.request.ProductRequest;
import com.kenil.ecommerce.dto.response.ProductResponse;
import com.kenil.ecommerce.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ProductResponse createProduct(
            @Valid @RequestBody ProductRequest request) {

        return productService.createProduct(request);
    }

    @GetMapping
    public List<ProductResponse> getAllProducts() {

        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public ProductResponse getProductById(
            @PathVariable Long id) {

        return productService.getProductById(id);
    }

    @PutMapping("/{id}")
    public ProductResponse updateProduct(
            @PathVariable Long id,
            @Valid @RequestBody ProductRequest request) {

        return productService.updateProduct(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

    @GetMapping("/name/{name}")
    public ProductResponse getProductByName(@PathVariable String name) {
        return productService.getProductByName(name);
    }

    @GetMapping("/search")
    public List<ProductResponse> searchProducts(
            @RequestParam String keyword) {

        return productService.searchProducts(keyword);
    }
}