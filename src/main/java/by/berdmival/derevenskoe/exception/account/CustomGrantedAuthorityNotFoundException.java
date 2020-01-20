package by.berdmival.derevenskoe.exception.account;

public class CustomGrantedAuthorityNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 3416929196385239085L;

    public CustomGrantedAuthorityNotFoundException(String authority) {
        super("Authority with id = " + authority + " not found");
    }
}
