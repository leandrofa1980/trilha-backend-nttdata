package br.com.control.finances.service;

import br.com.control.finances.dto.ChartDto;
import br.com.control.finances.dto.EntryDto;
import br.com.control.finances.entities.Category;
import br.com.control.finances.entities.Entry;
import br.com.control.finances.mapper.EntryMapper;
import br.com.control.finances.repository.CategoryRepository;
import br.com.control.finances.repository.EntryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EntryService {

    @Autowired
    private final EntryRepository repository;

    @Autowired
    private final CategoryRepository categoryRepository;

    @Autowired
    private final EntryMapper entryMapper;

    public List<Entry> findAllPaid(Boolean paid){
        if (paid != null) {
            return repository.findByPaid(paid);
        }
        return repository.findAll();
    }

    public Entry findById(Long id){
        Optional<Entry> idRead = repository.findById(id);
        return idRead.get();
    }

    public Optional<Category> byIdCategory(Long id){
        return categoryRepository.findById(id);
    }

    public Entry validateCategoryById(EntryDto entryDto) {
        if (categoryRepository.findById(entryDto.getCategory().getId()).isPresent()){
            return repository.save(entryMapper.dtoToEntity(entryDto));
        }
        return null;
    }

    public Entry update (Long id, EntryDto entryDto){
        Entry upEntry = repository.getById(id);
        updateEntry(upEntry, entryDto);
        return repository.save(upEntry);
    }

    private void updateEntry(Entry upEntry, EntryDto entryDto) {
        upEntry.setName(entryDto.getName());
        upEntry.setDescription(entryDto.getDescription());
        upEntry.setType(entryDto.getType());
        upEntry.setAmount(entryDto.getAmount());
        upEntry.setDate(entryDto.getDate());
        upEntry.setPaid(entryDto.isPaid());
    }

    public void delete (Long id){
        repository.deleteById(id);
    }

    public List<ChartDto> amount(){
        List<ChartDto> listAmount = new ArrayList<>();
        List<Category> newListCategory = categoryRepository.findAll();
        BigDecimal sum = BigDecimal.ZERO;
        for(int i = 0; i <= newListCategory.size()-1; i++){
            List<Entry> newListEntry = newListCategory.get(i).getEntries();
            for (int j = 0;j <= newListEntry.size()-1;j++){

                sum = sum.add(newListEntry.get(j).getAmount());
            }
            listAmount.add(new ChartDto(newListCategory.get(i).getName(), sum));
        }
        return listAmount;
    }
}
