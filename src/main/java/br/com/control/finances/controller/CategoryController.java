package br.com.control.finances.controller;

import br.com.control.finances.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private List<Category> list = new ArrayList<>();

    @GetMapping("/read")
    public List<Category> read(){
        return list;
    }

    @PostMapping("/create")
    public ResponseEntity<List<Category>>create(@RequestBody Category category){
        Category category1 = new Category();

        category1.setId(category.getId());
        category1.setName(category.getName());
        category1.setDescription(category.getDescription());

        list.add(category1);
        return ResponseEntity.status(HttpStatus.CREATED).body(list);
    }


}
