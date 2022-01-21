package br.com.control.finances.dto;

import br.com.control.finances.entities.Category;
import br.com.control.finances.entities.Entry;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EntryDTO {

    private String name;
    private String description;
    private String type;
    private Double amount;
    private String date;
    private boolean paid;
    private Category category;

    public static EntryDTO convertToDTO(Entry entry){
        return new EntryDTO(entry.getName(), entry.getDescription(), entry.getType(),
                entry.getAmount(), entry.getDate(),
                entry.isPaid(), entry.getCategory());
    }
}
