package com.kenil.ecommerce.service;

import com.kenil.ecommerce.dto.request.ProductRequest;
import com.kenil.ecommerce.dto.response.ProductResponse;

import java.util.List;

public interface ProductService {

    ProductResponse createProduct(ProductRequest request);

    List<ProductResponse> getAllProducts();
    ProductResponse getProductById(Long id);
    ProductResponse updateProduct(Long id, ProductRequest request);

    void deleteProduct(Long id);

    ProductResponse getProductByName(String name);
    List<ProductResponse> searchProducts(String keyword);
}