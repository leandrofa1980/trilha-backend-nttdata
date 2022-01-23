package br.com.control.finances.mapper;

import br.com.control.finances.dto.EntryDto;
import br.com.control.finances.entities.Entry;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EntryMapper {

    Entry dtoToEntity(EntryDto entryDto);

    EntryDto entityToDto(Entry entry);
}
