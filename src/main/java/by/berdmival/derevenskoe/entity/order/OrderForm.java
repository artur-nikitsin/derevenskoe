package by.berdmival.derevenskoe.entity.order;

import by.berdmival.derevenskoe.entity.account.UserMainInfo;
import lombok.Data;

import java.util.List;

@Data
public class OrderForm {
    private List<OrderProductDto> products;
    private UserMainInfo info;
}
