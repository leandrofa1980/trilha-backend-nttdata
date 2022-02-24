package br.com.control.finances.application.controller;

import br.com.control.finances.domain.dto.ChartDto;
import br.com.control.finances.domain.dto.EntryDto;
import br.com.control.finances.domain.entities.Entry;
import br.com.control.finances.infrastructure.exceptions.ArithmeticException;
import br.com.control.finances.infrastructure.exceptions.GetEntryListException;
import br.com.control.finances.infrastructure.exceptions.GetEntryPendingException;
import br.com.control.finances.infrastructure.exceptions.StandardError;
import br.com.control.finances.infrastructure.repository.EntryRepository;
import br.com.control.finances.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.List;

/*@Qualifier("controller")*/
@RestController
@RequestMapping(path = "/entries")
public class EntryController {

    @Autowired
    private EntryService entryService;

    @Autowired
    private EntryRepository entryRepository;

    @GetMapping
    public ResponseEntity<List<Entry>> getAll(@RequestParam(required = false) Boolean paid){
        return ResponseEntity.ok().body(entryService.findAllPaid(paid));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Entry> getById(@PathVariable("id") Long id){
        Entry readById = entryService.findById(id);
        return ResponseEntity.ok().body(readById);
    }

   /* @GetMapping("/dashboard")
    public ResponseEntity<List<ChartDto>> amount(){
        return ResponseEntity.ok(entryService.amount());
    }
*/
    @PostMapping("/create")
    public ResponseEntity<Object> create(@Valid @RequestBody EntryDto entryDto) {
        Entry create = entryService.validateCategoryById(entryDto);
        if(create == null){
            return ResponseEntity.badRequest().body("Categoria não existe");
        }
        return new ResponseEntity<>(create, HttpStatus.CREATED);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Entry> update(@Valid @PathVariable("id") Long id, @RequestBody EntryDto entryDto){
        return ResponseEntity.ok(entryService.update(id, entryDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        entryService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/calcula{x}/{y}")
    public Integer calculaMedia(@PathVariable("x") Integer x, @PathVariable("y") Integer y) throws Exception {
        try {
            return entryService.calculaMedia(x,y);
        }
        catch (Exception e){
            throw new ArithmeticException("Não é divisivel por 0");
        }

    }

    @GetMapping("/filter")
    public ResponseEntity<List<Entry>> getEntryDependents(
            @RequestParam(value = "date", required = false) String date,
            @RequestParam(value = "amount", required = false) BigDecimal amount,
            @RequestParam(value = "paid", required = false) boolean paid) throws GetEntryPendingException,
            GetEntryListException, NullPointerException {
        return ResponseEntity.ok(entryService.getEntryPending(date, amount, paid));
        /*try {
            return ResponseEntity.ok(entryService.getEntryPending(date, amount, paid));
        }
        catch (GetEntryPendingException ex){
            throw new GetEntryPendingException("Parâmetros com valores errados");
        }
        catch (GetEntryListException exception){
            throw new GetEntryListException("Não existe os dados pelo parâmetro passado");
        }
*/
    }
}
