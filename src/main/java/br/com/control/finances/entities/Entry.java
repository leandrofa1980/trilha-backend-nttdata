package br.com.control.finances.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ENTRIES")
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(nullable = false, length = 50)
    private String name;
    @NotNull
    @Column(nullable = false, length = 100)
    private String description;
    @NotNull
    @Column(nullable = false, length = 15)
    private String type;
    @NotNull
    @Column(nullable = false)
    private String amount;
    @NotNull
    @Column(nullable = false, length = 10)
    private String date;
    @NotNull
    @Column(nullable = false)
    private boolean paid;
    @NotNull
    @Column(nullable = false)
    private Long categoryId;

    @ManyToOne
    @JoinColumn(name = "category")
    private Category category;

    public Entry() {
    }

    public Entry(Long id, String name, String description, String type, String amount, String date, boolean paid, Long categoryId, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.paid = paid;
        this.categoryId = categoryId;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean getPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", amount='" + amount + '\'' +
                ", data='" + date + '\'' +
                ", paid=" + paid + '\'' +
                ", categoryId=" + categoryId;
    }
}
