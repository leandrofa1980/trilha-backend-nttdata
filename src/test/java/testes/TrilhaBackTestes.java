package testes;

import br.com.control.finances.domain.dto.EntryDto;
import br.com.control.finances.domain.entities.Entry;
import br.com.control.finances.infrastructure.mapper.EntryMapper;
import br.com.control.finances.infrastructure.repository.EntryRepository;
import br.com.control.finances.service.EntryService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.when;

//@RunWith(SpringRunner.class)
@ExtendWith(MockitoExtension.class)
public class TrilhaBackTestes {

    @Mock
    private EntryRepository entryRepository;

    @InjectMocks
    private EntryService entryService;

    @Autowired
    private EntryMapper entryMapper;


    public TrilhaBackTestes() {
    }

    @Test
    public void whenGetEntryDependentsInformedThenCheckTheReturn(){
        //given
        /*EntryDto entryDto = new EntryDto();
        entryDto.setDate(entryDto.getDate());
        entryDto.setAmount(entryDto.getAmount());
        entryDto.setPaid(entryDto.getPaid());
        Entry newEntryTest = entryMapper.dtoToEntity(entryDto);*/

        List<Entry> entryList = new ArrayList<>();
        Entry entries = new Entry();
        entries.setDate(entries.getDate());
        entries.setAmount(entries.getAmount());
        entries.setPaid(entries.getPaid());
        entryList.add(entries);

        //when
        /*when(entryRepository.findByPaidOrAmountOrDate(entryDto.getPaid(),
                entryDto.getAmount(),
                entryDto.getDate()))
        .thenReturn(Collections.singletonList(newEntryTest));*/

        when(entryService.getEntryPending(entries.getDate(),
                entries.getAmount(),
                entries.getPaid()))
        .thenReturn(Collections.singletonList(entries));

        //then
        List<Entry> verifyGetEntryPending = entryService.getEntryPending("17/09/2021", BigDecimal.valueOf(4405.49), true);

        Assertions.assertEquals(entries, verifyGetEntryPending);

    }
}
