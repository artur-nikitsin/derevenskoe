package by.berdmival.derevenskoe.controller.exception;

import by.berdmival.derevenskoe.exception.order.OrderNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class OrderExceptionController {
    @ExceptionHandler(value = OrderNotFoundException.class)
    public ResponseEntity<Object> notFoundByIdException(OrderNotFoundException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
