package br.com.control.finances.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {

    @NotBlank(message = "{name.not.blank}")
    @Size(min = 3, max = 15)
    private String name;

    @NotBlank(message = "{description.not.blank}")
    @Size(min = 3, max = 50)
    private String description;
}
