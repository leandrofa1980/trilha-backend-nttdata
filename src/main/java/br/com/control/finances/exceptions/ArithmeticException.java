package br.com.control.finances.exceptions;

public class ArithmeticException extends RuntimeException{

    public ArithmeticException(String s){
        super("Não pode ser dividido por 0");
    }
}
