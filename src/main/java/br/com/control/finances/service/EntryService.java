package br.com.control.finances.service;

import br.com.control.finances.entities.Entry;
import br.com.control.finances.repository.CategoryRepository;
import br.com.control.finances.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntryService {

    @Autowired
    private EntryRepository entryRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public Entry validateCategoryById(Entry entry) throws Exception {
        if (categoryRepository.findById(entry.getCategory().getId()).isPresent()){
            return entryRepository.save(entry);
        }
        else {
            throw new Exception("erro");
        }
    }

}
