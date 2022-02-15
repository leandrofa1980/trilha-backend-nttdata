package br.com.control.finances.domain.dto;

import br.com.control.finances.domain.entities.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntryDto {

    @NotBlank(message = "{name.not.blank}")
    @Size(min = 3, max = 45)
    private  String name;

    @NotBlank(message = "{description.not.blank}")
    @Size(min = 15, max = 150)
    private  String description;

    @NotBlank(message = "{type.not.blank}")
    @Size(min = 3, max = 10)
    private String type;

    @NotNull(message = "{amount.not.null}")
    @Min(value = 0)
    private BigDecimal amount;

    @NotNull(message = "{date.not.null}")
    private String date;

    @NotNull(message = "{paid.not.null}")
    private Boolean paid;

    private Category category;

}
