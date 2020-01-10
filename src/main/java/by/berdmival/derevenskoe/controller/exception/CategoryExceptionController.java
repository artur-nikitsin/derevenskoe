package by.berdmival.derevenskoe.controller.exception;

import by.berdmival.derevenskoe.entity.product.Category;
import by.berdmival.derevenskoe.exception.CategoryNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CategoryExceptionController {
    @ExceptionHandler(value = CategoryNotFoundException.class)
    public ResponseEntity<Object> notFoundException(){
        return new ResponseEntity<>("Category not found", HttpStatus.BAD_REQUEST);
    }
}
