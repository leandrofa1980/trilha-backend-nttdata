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
        List<Category> readAll = categoryService.findAll();
        return ResponseEntity.ok().body(readAll);
    }

    @GetMapping
    public ResponseEntity<Category> nameById(Long id, String name){
        Category readNameById = categoryService.idCategoryByName(id, name);
        return ResponseEntity.ok().body(readNameById);
    }

    @GetMapping("/read/{id}")
    public ResponseEntity<Category> readById(@PathVariable("id") Long id){
        Category readById = categoryService.findById(id);
        return ResponseEntity.ok().body(readById);
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
        category = categoryService.update(id, category);
        return new ResponseEntity<>(category,HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        categoryService.deleteCategory(id);
        return ResponseEntity.noContent().build();
    }
}
