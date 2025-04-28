package by.kardychka.Publisher.utils.mappers;

import by.kardychka.Publisher.DTOs.Requests.CreatorRequestDTO;
import by.kardychka.Publisher.DTOs.Responses.CreatorResponseDTO;
import by.kardychka.Publisher.models.Creator;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-28T16:48:23+0300",
    comments = "version: 1.6.0, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class CreatorsMapperImpl implements CreatorsMapper {

    @Override
    public CreatorResponseDTO toCreatorResponse(Creator creator) {
        if ( creator == null ) {
            return null;
        }

        CreatorResponseDTO creatorResponseDTO = new CreatorResponseDTO();

        creatorResponseDTO.setFirstname( creator.getFirstname() );
        creatorResponseDTO.setId( creator.getId() );
        creatorResponseDTO.setLastname( creator.getLastname() );
        creatorResponseDTO.setLogin( creator.getLogin() );
        creatorResponseDTO.setPassword( creator.getPassword() );

        return creatorResponseDTO;
    }

    @Override
    public List<CreatorResponseDTO> toCreatorResponseList(List<Creator> creators) {
        if ( creators == null ) {
            return null;
        }

        List<CreatorResponseDTO> list = new ArrayList<CreatorResponseDTO>( creators.size() );
        for ( Creator creator : creators ) {
            list.add( toCreatorResponse( creator ) );
        }

        return list;
    }

    @Override
    public Creator toCreator(CreatorRequestDTO creatorRequestDTO) {
        if ( creatorRequestDTO == null ) {
            return null;
        }

        Creator creator = new Creator();

        creator.setFirstname( creatorRequestDTO.getFirstname() );
        if ( creatorRequestDTO.getId() != null ) {
            creator.setId( creatorRequestDTO.getId() );
        }
        creator.setLastname( creatorRequestDTO.getLastname() );
        creator.setLogin( creatorRequestDTO.getLogin() );
        creator.setPassword( creatorRequestDTO.getPassword() );

        return creator;
    }
}
