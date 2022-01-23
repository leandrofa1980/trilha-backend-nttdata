package br.com.control.finances.service;

import br.com.control.finances.dto.CategoryDto;
import br.com.control.finances.entities.Category;
import br.com.control.finances.mapper.CategoryMapper;
import br.com.control.finances.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {

    @Autowired
    private final CategoryRepository categoryrepository;

    @Autowired
    private final CategoryMapper categoryMapper;

    public List<Category> findAll(){
        return categoryrepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> idRead = categoryrepository.findById(id);
        return idRead.get();
    }
    public Category idCategoryByName(String name){
        return categoryrepository.findByName(name);
    }

    public Category insert(CategoryDto categoryDto){
        return  categoryrepository.save(categoryMapper.dtoToEntity(categoryDto));
    }

    public Category update(Long id, CategoryDto categoryDto){
        Category upCategory = categoryrepository.findById(id).get();
        upCategory.setName(categoryDto.getName());
        upCategory.setDescription(categoryDto.getDescription());
        return categoryrepository.save(upCategory);
    }

    public void deleteCategory(Long id){
        categoryrepository.deleteById(id);
    }
}
