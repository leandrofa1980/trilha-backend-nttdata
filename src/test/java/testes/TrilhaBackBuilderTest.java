package testes;

import br.com.control.finances.domain.dto.EntryDto;
import br.com.control.finances.domain.entities.Entry;
import lombok.Builder;

import java.math.BigDecimal;

@Builder
public class TrilhaBackBuilderTest {

    @Builder.Default
    private Long id = Long.valueOf(1);

    @Builder.Default
    private String name = "freela";

    @Builder.Default
    private String description = "Recebimento salário";

    @Builder.Default
    private String type = "revenue";

    @Builder.Default
    private BigDecimal amount = BigDecimal.valueOf(4410.49);

    @Builder.Default
    private String date = "17/09/2021";

    @Builder.Default
    private Boolean paid = true;

    public EntryDto toEntryDto(){
        return new EntryDto(amount,
                date,
                paid);
    }

    public Entry entryPendentsList(){
        return new Entry(id,
                name,
                description,
                type,
                amount,
                date,
                paid);
    }
}
