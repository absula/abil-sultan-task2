package com.example.abil_sultan_task2.product.service;

import com.example.abil_sultan_task2.product.api.request.ProductRequest;
import com.example.abil_sultan_task2.product.api.response.ProductResponse;
import com.example.abil_sultan_task2.product.domain.Product;
import com.example.abil_sultan_task2.product.repository.ProductRepository;
import com.example.abil_sultan_task2.product.support.ProductMapper;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    public ProductService(ProductRepository repository, ProductMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public ProductResponse create(ProductRequest request) {
        Product product = mapper.toProduct(request);
        Product savedProduct = repository.save(product);
        return mapper.toResponse(savedProduct);
    }

    public ProductResponse getById(Long id) {
        Product product = repository.findById(id);
        return mapper.toResponse(product);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public ProductResponse update(Long id, ProductRequest request) {
        Product product = mapper.toProduct(request);
        product.setId(id);
        Product updated = repository.update(id, product);
        return mapper.toResponse(updated);
    }
}