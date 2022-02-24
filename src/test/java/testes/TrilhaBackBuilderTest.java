package testes;

import br.com.control.finances.domain.dto.EntryDto;
import br.com.control.finances.domain.entities.Entry;
import lombok.Builder;

import java.math.BigDecimal;

@Builder
public class TrilhaBackBuilderTest {

    @Builder.Default
    private String amount = "4410.49";

    @Builder.Default
    private String date = "";

    @Builder.Default
    private Boolean paid = true;


    public TrilhaBackBuilderTest() {
    }

    public TrilhaBackBuilderTest(String amount, String date, Boolean paid) {
        this.amount = amount;
        this.date = date;
        this.paid = paid;
    }

    public EntryDto toEntryDto(){
        return new EntryDto(amount,
                date,
                paid);
    }

    public Entry entryPendentsList(){
        return new Entry(amount,
                date,
                paid);
    }
}
