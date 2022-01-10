package br.com.control.finances.controller;

import br.com.control.finances.entities.Entry;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/entries")
public class EntryController {
    
    private List<Entry> list = new ArrayList<>();
    
    @GetMapping("/read")
    public List<Entry> read(){
        return list;
    }
    
    @PostMapping("/create")
    public ResponseEntity<List<Entry>>create(@RequestBody Entry entry){
        Entry entry1 = new Entry();

        entry1.setId(entry.getId());
        entry1.setName(entry.getName());
        entry1.setDescription(entry.getDescription());
        entry1.setType(entry.getType());
        entry1.setAmount(entry.getAmount());
        entry1.setDate(entry.getDate());
        entry1.setPaid(entry.getPaid());

        list.add(entry1);

        return ResponseEntity.status(HttpStatus.CREATED).body(list);
    }
    
}
