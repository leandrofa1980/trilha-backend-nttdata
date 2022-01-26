package br.com.control.finances.controller;

import br.com.control.finances.dto.ChartDto;
import br.com.control.finances.dto.EntryDto;
import br.com.control.finances.entities.Entry;
import br.com.control.finances.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Repository
@RestController
@RequestMapping("/entries")
public class EntryController {

    @Autowired
    private EntryService entryService;

    @GetMapping
    public ResponseEntity<List<Entry>> findAll(@RequestParam(required = false) Boolean paid){
        return ResponseEntity.ok().body(entryService.findAllPaid(paid));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Entry> readById(@PathVariable("id") Long id){
        Entry readById = entryService.findById(id);
        return ResponseEntity.ok().body(readById);
    }

    @GetMapping("/dashboard")
    public ResponseEntity<List<ChartDto>> amount(){
        return ResponseEntity.ok(entryService.amount());
    }

    @PostMapping("/create")
    public ResponseEntity<Object> createEntry(@Valid @RequestBody EntryDto entryDto) {
        Entry create = entryService.validateCategoryById(entryDto);
        if(create == null){
            return ResponseEntity.badRequest().body("Categoria não existe");
        }
        return new ResponseEntity<>(create, HttpStatus.CREATED);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<Entry> update(@Valid @PathVariable("id") Long id, @RequestBody EntryDto entryDto){
        return ResponseEntity.ok(entryService.update(id, entryDto));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        entryService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
