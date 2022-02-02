package br.com.control.finances.infrastructure.mapper;

import br.com.control.finances.domain.dto.EntryDto;
import br.com.control.finances.domain.entities.Entry;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EntryMapper {

    Entry dtoToEntity(EntryDto entryDto);

    EntryDto entityToDto(Entry entry);
}
