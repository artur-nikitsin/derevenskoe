package by.berdmival.derevenskoe.dto;

import java.util.List;

public class OrderForm {

    private List<OrderProductDto> products;

    public List<OrderProductDto> getProducts() {
        return products;
    }

    public void setProducts(List<OrderProductDto> products) {
        this.products = products;
    }
}
