package br.com.control.finances.infrastructure.mapper;

import br.com.control.finances.domain.dto.CategoryDto;
import br.com.control.finances.domain.entities.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    Category dtoToEntity(CategoryDto categoryDto);

    CategoryDto entityToDto(Category category);
}
