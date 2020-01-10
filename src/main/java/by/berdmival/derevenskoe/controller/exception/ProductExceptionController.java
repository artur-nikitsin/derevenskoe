package by.berdmival.derevenskoe.controller.exception;

import by.berdmival.derevenskoe.exception.product.ProductNotFoundByIdException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductExceptionController {
    @ExceptionHandler(value = ProductNotFoundByIdException.class)
    public ResponseEntity<Object> notFoundByIdException(ProductNotFoundByIdException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
