package testes;

import br.com.control.finances.domain.entities.Entry;
import lombok.Builder;

import java.math.BigDecimal;

@Builder
public class TrilhaBackBuilderTest {

    @Builder.Default
    private BigDecimal amount = BigDecimal.valueOf(4410.49);

    @Builder.Default
    private String date = "17/09/2021";

    @Builder.Default
    private Boolean paid = true;


    public TrilhaBackBuilderTest() {
    }

    public TrilhaBackBuilderTest(BigDecimal amount, String date, Boolean paid) {
        this.amount = amount;
        this.date = date;
        this.paid = paid;
    }

    public Entry entryPendentsList(){
        return new Entry(amount,
                date,
                paid);
    }
}
