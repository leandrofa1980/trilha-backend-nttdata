package br.com.control.finances.dto;

import br.com.control.finances.entities.Category;
import br.com.control.finances.entities.Entry;

import java.io.Serializable;

public class EntryDTO  implements Serializable {

    private String name;
    private String description;
    private String type;
    private Double amount;
    private String date;
    private boolean paid;
    private Category category;

    public EntryDTO(){
    }

    public EntryDTO(String name, String description, String type, Double amount, String date, boolean paid, Category category) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.paid = paid;
        this.category = category;
    }

    public static EntryDTO convertDTO(Entry entry){
        return new EntryDTO(entry.getName(), entry.getDescription(), entry.getType(),
                entry.getAmount(), entry.getDate(),
                entry.getPaid(), entry.getCategory());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
