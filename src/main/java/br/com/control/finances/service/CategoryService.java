package br.com.control.finances.service;

import br.com.control.finances.entities.Category;
import br.com.control.finances.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> idRead = repository.findById(id);
        return idRead.get();
    }
    public Category idCategoryByName(Long id, String name){
        Optional<Category> nameById = repository.findById(id);
        return repository.findByName(String.valueOf(nameById));
    }

    public Category insert(Category category){
        return  repository.save(category);
    }

    public Category update(Long id, Category category){
        Category upCategory = repository.getOne(id);
        updateDate(upCategory, category);
        return repository.save(upCategory);
    }

    public void updateDate(Category upCategory, Category category) {
        upCategory.setName(category.getName());
        upCategory.setDescription(category.getDescription());
    }

    public void deleteCategory(Long id){
        repository.deleteById(id);
    }
}
