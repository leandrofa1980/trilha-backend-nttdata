package br.com.control.finances.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DTOChart {

    private String name;
    private String type;
    private String total;



}
