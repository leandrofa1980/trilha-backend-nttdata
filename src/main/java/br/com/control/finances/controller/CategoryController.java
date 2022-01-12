package br.com.control.finances.controller;

import br.com.control.finances.entities.Category;
import br.com.control.finances.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;


/*    private List<Category> list = new ArrayList<>();*/

    @GetMapping("/read")
    public List<Category> read(){
        return categoryRepository.findAll();
    }

    @GetMapping("/read/{id}")
    public Category readById(@PathVariable("id") Long id){
        return categoryRepository.findById(id).orElseThrow();
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Category createCategory(@RequestBody Category category){
        return categoryRepository.save(category);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateCategoryId(@PathVariable("id") Long id, @RequestBody Category category){
        return categoryRepository.findById(id)
                .map(record -> {
                    record.setId(category.getId());
                    record.setName(category.getName());
                    record.setDescription(category.getDescription());
                    Category update = categoryRepository.save(record);
                    return ResponseEntity.ok().body(update);})
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        categoryRepository.deleteById(id);
    }


}
