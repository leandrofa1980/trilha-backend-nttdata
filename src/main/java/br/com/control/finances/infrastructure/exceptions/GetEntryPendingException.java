package br.com.control.finances.infrastructure.exceptions;

public class GetEntryPendingException extends RuntimeException{

    public GetEntryPendingException(String s){
        super("Parâmetros com valores errados");
    }
}
