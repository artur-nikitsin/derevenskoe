package by.berdmival.derevenskoe.controller.exception;

import by.berdmival.derevenskoe.exception.product.CategoryNotFoundByIdException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CategoryExceptionController {
    @ExceptionHandler(value = CategoryNotFoundByIdException.class)
    public ResponseEntity<Object> notFoundByIdException(CategoryNotFoundByIdException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
