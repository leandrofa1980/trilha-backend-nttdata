package br.com.control.finances.dto;

import com.fasterxml.jackson.databind.deser.UnresolvedId;
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

}
