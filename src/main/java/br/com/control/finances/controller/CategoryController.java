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

    @GetMapping("/read/nameCategory/{name}")
    public ResponseEntity<Long> name(@PathVariable("name") String name){
        Category readName = categoryService.idCategoryByName(name);
        return ResponseEntity.ok().body(readName.getId());
    }

    @GetMapping("/read/{id}")
    public ResponseEntity<Category> readById(@PathVariable("id") Long id){
        Category readById = categoryService.findById(id);
        return ResponseEntity.ok().body(readById);
    }

    @PostMapping("/create")
    public ResponseEntity<Category> createCategory(@RequestBody Category category){
        Category createCategory = categoryService.insert(category);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(category.getId())
                .toUri();
        return ResponseEntity.created(location).body(createCategory);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Category> updateCategory(@PathVariable("id") Long id, @RequestBody Category category){
        Category updateCategory = categoryService.update(id, category);
        return new ResponseEntity<>(updateCategory,HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        categoryService.deleteCategory(id);
        return ResponseEntity.noContent().build();
    }
}
