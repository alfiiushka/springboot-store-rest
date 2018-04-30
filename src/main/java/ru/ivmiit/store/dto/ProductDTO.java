package ru.ivmiit.store.dto;

import lombok.Data;
import ru.ivmiit.store.model.Product;

@Data
public class ProductDTO {

    private String name;
    private Integer price;
    private Boolean inStock;

    public ProductDTO(Product product){
        this.name=product.getName();
        this.inStock=product.getInStock();
        this.price=product.getPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Boolean getInStock() {
        return inStock;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }
}
