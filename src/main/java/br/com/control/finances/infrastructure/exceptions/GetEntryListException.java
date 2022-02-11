package br.com.control.finances.infrastructure.exceptions;

public class GetEntryListException extends RuntimeException{

    public GetEntryListException (String s){
        super("Não existe os dados pelo parâmetro passado");
    }
}
