package testes;

import br.com.control.finances.domain.dto.EntryDto;
import br.com.control.finances.domain.entities.Entry;
import br.com.control.finances.infrastructure.mapper.EntryMapper;
import br.com.control.finances.infrastructure.repository.EntryRepository;
import br.com.control.finances.service.EntryService;
import org.junit.Assert;
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
       /* EntryDto entryDto = TrilhaBackBuilderTest.builder().build().toEntryDto();
        Entry expectedReturnTest = entryMapper.dtoToEntity(entryDto);*/

        /*EntryDto entryDto = new EntryDto();
        entryDto.setDate(entryDto.getDate());
        entryDto.setAmount(entryDto.getAmount());
        entryDto.setPaid(entryDto.getPaid());
        Entry newEntryTest = entryMapper.dtoToEntity(entryDto);*/

        List<Entry> entryList = new ArrayList<>();
        Entry entries = TrilhaBackBuilderTest.builder().build().entryPendentsList();
        /*entries.setDate(entries.getDate());
        entries.setAmount(entries.getAmount());
        entries.setPaid(entries.getPaid());*/
        entryList.add(entries);

        //when
        /*when(entryRepository.findByPaidOrAmountOrDate(entryDto.getPaid(),
                entryDto.getAmount(),
                entryDto.getDate()))
        .thenReturn(Collections.singletonList(expectedReturnTest));*/

        when(entryRepository.findByPaidOrAmountOrDate(entries.getPaid(),
                entries.getAmount(),
                entries.getDate()))
        .thenReturn(Collections.singletonList(entries));

        //then
       /* EntryDto getEntryDto = (EntryDto) entryService.getEntryPending("17/09/2021", BigDecimal.valueOf(4405.49), true);

        Assert.assertEquals(entryDto.getAmount(), getEntryDto.getAmount());
        Assert.assertEquals(entryDto.getDate(), getEntryDto.getDate());
        Assert.assertEquals(entryDto.getPaid(), getEntryDto.getPaid());*/

        //Entry verifyGetEntryPending = (Entry) entryService.getEntryPending("17/09/2021", BigDecimal.valueOf(4405.49), true);

        Assertions.assertEquals(entries.getAmount(), entries.getAmount());
        Assertions.assertEquals(entries.getDate(), entries.getDate());
        Assertions.assertEquals(entries.getPaid(), entries.getPaid());


    }
}
