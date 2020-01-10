package by.berdmival.derevenskoe.exception.product;

public class ProductNotFoundByIdException extends RuntimeException {
    private static final long serialVersionUID = -8914925991597428951L;

    public ProductNotFoundByIdException(Long productId) {
        super("Product with id = " + productId + " not found");
    }
}
