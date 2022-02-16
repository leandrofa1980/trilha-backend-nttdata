package br.com.control.finances.service;

import br.com.control.finances.domain.dto.ChartDto;
import br.com.control.finances.domain.dto.EntryDto;
import br.com.control.finances.domain.entities.Category;
import br.com.control.finances.domain.entities.Entry;
import br.com.control.finances.infrastructure.exceptions.GetEntryListException;
import br.com.control.finances.infrastructure.exceptions.GetEntryPendingException;
import br.com.control.finances.infrastructure.mapper.EntryMapper;
import br.com.control.finances.infrastructure.repository.CategoryRepository;
import br.com.control.finances.infrastructure.repository.EntryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EntryService {

    @Autowired
    private EntryRepository entryRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private EntryMapper entryMapper;

    public List<Entry> findAllPaid(Boolean paid){
        if (paid != null) {
            return entryRepository.findByPaid(paid);
        }
        return entryRepository.findAll();
    }

    public Entry findById(Long id){
        Optional<Entry> idRead = entryRepository.findById(id);
        return idRead.get();
    }

    public Optional<Category> byIdCategory(Long id){
        return categoryRepository.findById(id);
    }

    public Entry validateCategoryById(EntryDto entryDto) {
        if (categoryRepository.findById(entryDto.getCategory().getId()).isPresent()){
            return entryRepository.save(entryMapper.dtoToEntity(entryDto));
        }
        return null;
    }

    public Entry update (Long id, EntryDto entryDto){
        Entry upEntry = entryRepository.getById(id);
        updateEntry(upEntry, entryDto);
        return entryRepository.save(upEntry);
    }

    private void updateEntry(Entry upEntry, EntryDto entryDto) {
        upEntry.setName(entryDto.getName());
        upEntry.setDescription(entryDto.getDescription());
        upEntry.setType(entryDto.getType());
        upEntry.setAmount(entryDto.getAmount());
        upEntry.setDate(entryDto.getDate());
        upEntry.setPaid(entryDto.getPaid());
    }

    public void delete (Long id){
        entryRepository.deleteById(id);
    }

    public List<ChartDto> amount(){
        List<ChartDto> listAmount = new ArrayList<>();
        List<Category> newListCategory = categoryRepository.findAll();
        newListCategory.forEach(category -> listAmount.add(new ChartDto(category.getName(),
                category.getEntries().stream()
                        .map(Entry::getAmount)
                        .reduce(BigDecimal.ZERO, BigDecimal::add)))); 
        /*BigDecimal sum = BigDecimal.ZERO;
        for(int i = 0; i <= newListCategory.size()-1; i++){
            List<Entry> newListEntry = newListCategory.get(i).getEntries();
            for (int j = 0;j <= newListEntry.size()-1;j++){

                sum = sum.add(newListEntry.get(j).getAmount());
            }
            listAmount.add(new ChartDto(newListCategory.get(i).getName(), sum));
        }*/
        return listAmount;
    }

    public Integer calculaMedia(Integer x, Integer y){
        return x/y;q
    }

    public List<Entry> getEntryPending(String date, BigDecimal amount, Boolean paid) throws GetEntryPendingException, GetEntryListException{
        if (date == null || amount == null){
            throw new GetEntryPendingException("Parâmetros com valores errados");
        }
        else if (date == "" || amount.equals(0)){
            throw new GetEntryListException("Não existe os dados pelo parâmetro passado");
        }/*
        else {
            return entryRepository.findByPaidOrAmountOrDate(paid, amount, date);
        }*/
        List<Entry> entryNewList = entryRepository.findByPaidOrAmountOrDate(paid, amount, date)
                .stream()
                .filter((Entry entry) -> entry.getDate().equals(date)
                && entry.getAmount().equals(amount)
                && entry.getPaid() == paid)
                .collect(Collectors.toList());
        return entryNewList;
    }
}
