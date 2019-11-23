package by.berdmival.derevenskoe.dto;

import by.berdmival.derevenskoe.entity.product.Product;
import lombok.Data;

@Data
public class OrderProductDto {
    private Product product;
    private int quantity;
}
