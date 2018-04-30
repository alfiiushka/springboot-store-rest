package ru.ivmiit.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ivmiit.store.dto.ProductDTO;
import ru.ivmiit.store.service.ProductService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<ProductDTO> getProducts(){
        return productService.getallProducts().stream().map(ProductDTO::new).collect(Collectors.toList());
    }
}
