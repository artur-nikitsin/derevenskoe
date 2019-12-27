package by.berdmival.derevenskoe.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderForm {
    private List<OrderProductDto> products;
}
