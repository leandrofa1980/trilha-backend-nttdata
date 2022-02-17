package br.com.control.finances.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ENTRIES")
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String type;
    private BigDecimal amount;
    private String date;
    private Boolean paid;

    @ManyToOne
    @JoinColumn(name = "category")
    private Category category;

    public Entry(Long id, String name, String description, String type, BigDecimal amount, String date, Boolean paid) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.paid = paid;
    }
}
