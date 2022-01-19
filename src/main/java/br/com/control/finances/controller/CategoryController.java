package br.com.control.finances.controller;

import br.com.control.finances.entities.Category;
import br.com.control.finances.repository.CategoryRepository;
import br.com.control.finances.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;


@RestController
@Repository
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/read")
    public ResponseEntity<List<Category>> read(){
        return ResponseEntity.ok().body(categoryService.findAll());
    }

    @GetMapping
    public ResponseEntity<Category> nameById(@RequestParam(name = "id") Long id, @RequestParam String name){
        Category readNmeById = categoryService.idCategoryByName(id, name);
        return ResponseEntity.ok().body(readNmeById);
    }

    @GetMapping
    public ResponseEntity<Category> nameById(Long id, String name){
        Category readNameById = categoryService.idCategoryByName(id, name);
        return ResponseEntity.ok().body(readNameById);
    }

    @GetMapping("/read/{id}")
    public ResponseEntity<Category> readById(@PathVariable("id") Long id){
        return ResponseEntity.ok().body(categoryService.findById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<Category> createCategory(@RequestBody Category category){
        category = categoryService.insert(category);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(category.getId())
                .toUri();
        return ResponseEntity.created(location).body(category);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Category> updateCategory(@PathVariable("id") Long id, @RequestBody Category category){
        return ResponseEntity.status(HttpStatus.CREATED).body(categoryService.update(id, category));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        categoryService.deleteCategory(id);
        return ResponseEntity.noContent().build();
    }
}
