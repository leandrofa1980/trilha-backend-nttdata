package br.com.control.finances.dto;

import br.com.control.finances.entities.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntryDto {

    private String name;
    private String description;
    private String type;
    private BigDecimal amount;
    private String date;
    private boolean paid;

    private Category category;

}
