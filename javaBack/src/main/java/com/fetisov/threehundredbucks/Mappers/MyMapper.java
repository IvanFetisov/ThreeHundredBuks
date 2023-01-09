package com.fetisov.threehundredbucks.Mappers;

import com.fetisov.threehundredbucks.DTO.AuthorDTO;
import com.fetisov.threehundredbucks.Entities.Author;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MyMapper {

    Author dtoToEntity(AuthorDTO authorDTO);
    AuthorDTO entityToDto(Author author);



}
