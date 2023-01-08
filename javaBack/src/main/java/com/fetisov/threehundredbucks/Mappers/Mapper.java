package com.fetisov.threehundredbucks.Mappers;

import com.fetisov.threehundredbucks.DTO.BaseAuthorDTO;
import com.fetisov.threehundredbucks.Entities.BasicAuthorEntity;

public interface Mapper<E extends BasicAuthorEntity, D extends BaseAuthorDTO> {
    E toEntity(D dto);

    D toDto(E entity);
}
