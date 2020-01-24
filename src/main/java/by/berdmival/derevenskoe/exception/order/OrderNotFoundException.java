package by.berdmival.derevenskoe.exception.order;

public class OrderNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -6553162580887281756L;

    public OrderNotFoundException(String orderId) {
        super("Order with id = " + orderId + " not found");
    }
}
