package br.com.control.finances.application.controller;

import br.com.control.finances.domain.dto.CategoryDto;
import br.com.control.finances.domain.entities.Category;
import br.com.control.finances.infrastructure.repository.CategoryRepository;
import br.com.control.finances.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService ;

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
    public ResponseEntity<Category> createCategory(@Valid @RequestBody CategoryDto category){
        return ResponseEntity.ok().body(categoryService.insert(category));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Category> updateCategory(@Valid @PathVariable("id") Long id, @RequestBody CategoryDto categoryDto){
        Category updateCategory = categoryService.update(id, categoryDto);
        return new ResponseEntity<>(updateCategory,HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        categoryService.deleteCategory(id);
        return ResponseEntity.noContent().build();
    }
}
