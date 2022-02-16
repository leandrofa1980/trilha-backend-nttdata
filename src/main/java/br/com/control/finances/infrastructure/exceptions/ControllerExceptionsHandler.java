package br.com.control.finances.infrastructure.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@ControllerAdvice
public class ControllerExceptionsHandler {

    @ExceptionHandler({ArithmeticException.class})
    public ResponseEntity<StandardError> arithmeticException(ArithmeticException e, HttpServletRequest request){
        String error = "Erro, número invalido";
        HttpStatus status = HttpStatus.BAD_REQUEST;
        StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
        return  ResponseEntity.status(status).body(err);
    }
    @ExceptionHandler({GetEntryPendingException.class})
    public ResponseEntity<StandardError> getEntryPendingException(GetEntryPendingException ex,HttpServletRequest request){
        String errorPending = "Erro, parâmetros com valores invalidos";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(Instant.now(), status.value(), errorPending, ex.getMessage(), request.getRequestURI());
        return  ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler({GetEntryListException.class})
    public ResponseEntity<StandardError> getEntryListException(GetEntryListException exception,HttpServletRequest request){
        String errorList = "Erro, parâmetros passado invalidos";
        HttpStatus status = HttpStatus.ACCEPTED;
        StandardError err = new StandardError(Instant.now(), status.value(), errorList, exception.getMessage(), request.getRequestURI());
        return  ResponseEntity.status(status).body(err);
    }
}
