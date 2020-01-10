package by.berdmival.derevenskoe.exception;

public class CategoryNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1637219985495049776L;

    public CategoryNotFoundException(Long categoryId) {
        super("Category with id = " + categoryId + " not found");
    }
}
