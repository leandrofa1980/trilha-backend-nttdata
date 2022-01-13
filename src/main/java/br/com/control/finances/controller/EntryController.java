package br.com.control.finances.controller;

import br.com.control.finances.entities.Entry;
import br.com.control.finances.repository.CategoryRepository;
import br.com.control.finances.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Repository
@RequestMapping("/entries")
public class EntryController  extends RuntimeException{

    @Autowired
    private EntryRepository entryRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/read")
    public List<Entry> readPaid(@RequestParam(required = false) Boolean paid){
            if (paid != null) {
               return entryRepository.findByPaid(paid);
            }

        return entryRepository.findAll();
    }

    @GetMapping("/read/{id}")
    public Entry readById(@PathVariable("id") Long id){
        return entryRepository.findById(id).orElseThrow();
    }
    
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Entry createEntry(@RequestBody Entry entry) throws Exception {
       if (categoryRepository.findById(entry.getCategory().getId()).isPresent()){
           return entryRepository.save(entry);
       }
       else {
           throw new Exception("erro");
       }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody Entry entry){
        return entryRepository.findById(id)
                .map(record -> {
                    record.setId(entry.getId());
                    record.setName(entry.getName());
                    record.setDescription(entry.getDescription());
                    record.setType(entry.getType());
                    record.setAmount(entry.getAmount());
                    record.setDate(entry.getDate());
                    record.setPaid(entry.getPaid());
                    Entry update = entryRepository.save(record);
                    return ResponseEntity.ok().body(update);})
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id){
        entryRepository.deleteById(id);
    }
    
}
