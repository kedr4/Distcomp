package by.kardychka.Publisher.utils.mappers;

import by.kardychka.Publisher.DTOs.Requests.PostRequestDTO;
import by.kardychka.Publisher.DTOs.Responses.PostResponseDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-28T16:48:23+0300",
    comments = "version: 1.6.0, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class PostsMapperImpl implements PostsMapper {

    @Override
    public PostResponseDTO toPostResponse(PostRequestDTO postRequestDTO) {
        if ( postRequestDTO == null ) {
            return null;
        }

        PostResponseDTO postResponseDTO = new PostResponseDTO();

        postResponseDTO.setId( postRequestDTO.getId() );
        postResponseDTO.setNewsId( postRequestDTO.getNewsId() );
        postResponseDTO.setContent( postRequestDTO.getContent() );

        return postResponseDTO;
    }
}
