package by.berdmival.derevenskoe.exception.product;

public class CategoryNotFoundByIdException extends RuntimeException {
    private static final long serialVersionUID = 1637219985495049776L;

    public CategoryNotFoundByIdException(Long categoryId) {
        super("Category with id = " + categoryId + " not found");
    }
}
