package br.com.control.finances.infrastructure.mapper;

import br.com.control.finances.domain.dto.EntryDto;
import br.com.control.finances.domain.entities.Entry;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EntryMapper {

    EntryMapper INSTANCE = Mappers.getMapper(EntryMapper.class);

    Entry dtoToEntity(EntryDto entryDto);

    EntryDto entityToDto(Entry entry);
}
