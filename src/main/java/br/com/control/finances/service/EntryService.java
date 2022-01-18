package br.com.control.finances.service;

import br.com.control.finances.entities.Category;
import br.com.control.finances.entities.Entry;
import br.com.control.finances.repository.CategoryRepository;
import br.com.control.finances.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntryService {

    @Autowired
    private EntryRepository entryRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Entry> findAll(){
        return entryRepository.findAll();
    }

    public Entry findById(Long id){
        Optional<Entry> idRead = entryRepository.findById(id);
        return idRead.get();
    }

    public Entry insert(Entry entry){
        return entryRepository.save(entry);
    }

    public Optional<Category> byIdCategory(Long id){
        return categoryRepository.findById(id);
    }

    public Entry validateCategoryById(Long id) throws Exception {
        Entry entry = new Entry();
        if (categoryRepository.findById(entry.getCategory().getId()).isPresent()){
            return entryRepository.save(entry);
        }
        else {
            throw new Exception("erro");
        }
    }
    public Entry update(Long id, Entry entry){
        Entry upEntry = entryRepository.getOne(id);
        updateDate(upEntry, entry);
        return entryRepository.save(upEntry);
    }

    public void updateDate(Entry upEntry, Entry entry) {
        upEntry.setName(entry.getName());
        upEntry.setDescription(entry.getDescription());
        upEntry.setType(entry.getType());
        upEntry.setAmount(entry.getAmount());
        upEntry.setDate(entry.getDate());
        upEntry.setPaid(entry.getPaid());
    }

    public  void delete(Long id){
        entryRepository.deleteById(id);
    }

}
