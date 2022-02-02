package br.com.control.finances.service;

import br.com.control.finances.domain.dto.CategoryDto;
import br.com.control.finances.domain.entities.Category;
import br.com.control.finances.infrastructure.mapper.CategoryMapper;
import br.com.control.finances.infrastructure.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    private CategoryMapper categoryMapper;


    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> idRead = categoryRepository.findById(id);
        return idRead.get();
    }
    public Category idCategoryByName(String name){
        return categoryRepository.findByName(name);
    }

    public Category insert(CategoryDto categoryDto){
        return  categoryRepository.save(categoryMapper.dtoToEntity(categoryDto));
    }

    public Category update(Long id, CategoryDto categoryDto){
        Category upCategory = categoryRepository.findById(id).get();
        upCategory.setName(categoryDto.getName());
        upCategory.setDescription(categoryDto.getDescription());
        return categoryRepository.save(upCategory);
    }

    public void deleteCategory(Long id){
        categoryRepository.deleteById(id);
    }
}
