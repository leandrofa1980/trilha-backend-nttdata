package br.com.control.finances.controller;

import br.com.control.finances.entities.Entry;
import br.com.control.finances.repository.CategoryRepository;
import br.com.control.finances.repository.EntryRepository;
import br.com.control.finances.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/entries")
public class EntryController {

    @Autowired
    private EntryService entryService;

    @GetMapping("/read")
    public ResponseEntity<List<Entry>> findAll(@RequestParam(required = false) Boolean paid){
        return ResponseEntity.ok().body(entryService.findAllPaid(paid));
    public List<Entry> findAll(@RequestParam(required = false) Boolean paid){
      /*  if (paid != null) {
            return entryRepository.findByPaid(paid);
        }*/
        return entryService.findAll();
    }

    @GetMapping("/read/{id}")
    public ResponseEntity<Entry> readById(@PathVariable("id") Long id){
        Entry readById = entryService.findById(id);
        return ResponseEntity.ok().body(readById);
    }

    @PostMapping("/create")
    public ResponseEntity<Object> createEntry(@RequestBody Entry entry) {
        Entry create = entryService.validateCategoryById(entry);
        if(create == null){
            return ResponseEntity.badRequest().body("Categoria não existe");
        }
        return new ResponseEntity<>(create, HttpStatus.CREATED);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<Entry> update(@PathVariable("id") Long id, @RequestBody Entry entry){
        return new ResponseEntity<>(entry, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        entryService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
