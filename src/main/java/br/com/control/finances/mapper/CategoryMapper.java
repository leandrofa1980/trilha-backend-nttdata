package br.com.control.finances.mapper;

import br.com.control.finances.dto.CategoryDto;
import br.com.control.finances.entities.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    Category dtoToEntity(CategoryDto categoryDto);

    CategoryDto entityToDto(Category category);
}
