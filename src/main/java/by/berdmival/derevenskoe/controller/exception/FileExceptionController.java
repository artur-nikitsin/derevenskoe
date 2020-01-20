package by.berdmival.derevenskoe.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.nio.file.NoSuchFileException;

@ControllerAdvice
public class FileExceptionController {
    @ExceptionHandler(value = NoSuchFileException.class)
    public ResponseEntity<Object> notFoundException(NoSuchFileException e) {
        return new ResponseEntity<>("File '" + e.getMessage() + "' not found", HttpStatus.BAD_REQUEST);
    }
}
