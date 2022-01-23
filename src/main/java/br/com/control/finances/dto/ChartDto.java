package br.com.control.finances.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChartDto {

    private String name;
    private String type;
    private Double total;

    public ChartDto(String name, BigDecimal total) {

    }
}

