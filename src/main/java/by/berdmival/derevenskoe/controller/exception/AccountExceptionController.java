package by.berdmival.derevenskoe.controller.exception;

import by.berdmival.derevenskoe.exception.account.CustomGrantedAuthorityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AccountExceptionController {
    @ExceptionHandler(value = CustomGrantedAuthorityNotFoundException.class)
    public ResponseEntity<Object> notFoundByIdException(CustomGrantedAuthorityNotFoundException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
