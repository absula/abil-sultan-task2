package com.example.abil_sultan_task2.product.support;

import com.example.abil_sultan_task2.product.api.request.ProductRequest;
import com.example.abil_sultan_task2.product.api.response.ProductResponse;
import com.example.abil_sultan_task2.product.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product toProduct(ProductRequest request) {
        return new Product(request.getName());
    }

    public ProductResponse toResponse(Product product) {
        return new ProductResponse(product.getId(), product.getName());
    }
}