package br.com.control.finances.infrastructure.exceptions;

public class ArithmeticException extends RuntimeException{

    public ArithmeticException(String s){
        super("Não pode ser dividido por 0");
    }
}
