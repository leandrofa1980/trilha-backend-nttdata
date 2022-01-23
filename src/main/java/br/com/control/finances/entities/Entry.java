package br.com.control.finances.entities;

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
    @Column(nullable = false, length = 50)
    private String name;
    @Column(nullable = false, length = 100)
    private String description;
    @Column(nullable = false, length = 15)
    private String type;
    @Column(nullable = false)
    private BigDecimal amount;
    @Column(nullable = false, length = 10)
    private String date;
    @Column(nullable = false)
    private boolean paid;

    @ManyToOne
    @JoinColumn(name = "category")
    private Category category;

}
