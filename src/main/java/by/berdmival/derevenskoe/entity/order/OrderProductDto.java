package by.berdmival.derevenskoe.entity.order;

import by.berdmival.derevenskoe.entity.product.Product;
import by.berdmival.derevenskoe.service.product.ProductService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class OrderProductDto {
    @JsonIgnore
    @Autowired
    private ProductService productService;

    private long productId;
    private int quantity;

    @JsonIgnore
    public Product getProduct() {
        return productService.findById(productId);
    }
}
