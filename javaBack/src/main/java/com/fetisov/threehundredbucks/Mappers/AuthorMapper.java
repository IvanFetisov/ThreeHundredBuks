package com.fetisov.threehundredbucks.Mappers;

import com.fetisov.threehundredbucks.DTO.AuthorDTO;
import com.fetisov.threehundredbucks.Entities.Author;
import com.fetisov.threehundredbucks.Repos.AuthorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Objects;
import java.util.UUID;

@Component
public class AuthorMapper extends AbstractMapper<Author,AuthorDTO>{

    private final ModelMapper mapper;
    private final AuthorRepository authorRepository;


    AuthorMapper(Class<Author> entityClass, Class<AuthorDTO> dtoClass, ModelMapper mapper, AuthorRepository authorRepository) {
        super(entityClass, dtoClass);
        this.mapper = mapper;
        this.authorRepository = authorRepository;
    }
   @PostConstruct
   public void setupMapper() {
       mapper.createTypeMap(Author.class, AuthorDTO.class)
               .addMappings(m -> m.skip(AuthorDTO::setId)).setPostConverter(toDtoConverter());
       mapper.createTypeMap(AuthorDTO.class, Author.class)
               .addMappings(m -> m.skip(Author::setCourse)).setPostConverter(toEntityConverter());
   }
   @Override
   public void mapSpecificFields(Author source, AuthorDTO destination){
       destination.setId(getId(source));
   }
   private UUID getId(Author source){
       return Objects.isNull(source)|| Objects.isNull(source.getId()) ? null: source.getId();

   }

    @Override
    public Author toEntity(AuthorDTO dto){
        return Objects.isNull(dto)? null:mapper.map(dto,Author.class);
    }

}
