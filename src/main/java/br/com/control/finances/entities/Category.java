package br.com.control.finances.entities;

import javax.persistence.*;
import java.util.List;

@Table(name = "CATEGORIES")
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 50)
    private  String name;
    @Column(nullable = false, length = 100)
    private  String description;
/*

    @ManyToOne
    private List<Entry> entry;
*/

    public Category() {
    }

    public Category(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    @Override
    public String toString() {
        return  "id=" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description;
    }
}
