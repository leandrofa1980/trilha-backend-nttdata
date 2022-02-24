package br.com.control.finances.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private String amount;
    private String date;
    private Boolean paid;
    private Long categoryId;

    public Entry(String amount, String date, Boolean paid) {
        this.amount = amount;
        this.date = date;
        this.paid = paid;
    }
}
