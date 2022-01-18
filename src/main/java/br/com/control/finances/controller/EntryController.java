package br.com.control.finances.controller;

import br.com.control.finances.entities.Category;
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
public class EntryController  extends RuntimeException{

    @Autowired
    private EntryService entryService;

    @Autowired
<<<<<<< HEAD
    private CategoryRepository categoryRepository;

    @Autowired
=======
>>>>>>> 6a831e153880f670e590fad117892bb69034103a
    private EntryRepository entryRepository;

    @GetMapping("/read")
    public List<Entry> readPaid(@RequestParam(required = false) Boolean paid){
        if (paid != null) {
            return entryRepository.findByPaid(paid);
        }

        return entryService.findAll();
    }

    @GetMapping("/read/{id}")
    public ResponseEntity<Entry> readById(@PathVariable("id") Long id){
        Entry readById = entryService.findById(id);
        return ResponseEntity.ok().body(readById);
    }

    @PostMapping("/create")
    public ResponseEntity<Entry> createEntry(@RequestBody Entry entry) throws Exception{
        entry = entryService.insert(entry);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(entry.getId())
                .toUri();
        return ResponseEntity.created(location).body(entry);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Entry> update(@PathVariable("id") Long id, @RequestBody Entry entry){
        entry = entryService.update(id, entry);
        return ResponseEntity.ok().body(entry);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        entryRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
