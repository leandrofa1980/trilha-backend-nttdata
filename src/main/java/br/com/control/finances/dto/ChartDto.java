package br.com.control.finances.dto;

import br.com.control.finances.entities.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChartDto {

    private String name;
    private BigDecimal sum;

}

