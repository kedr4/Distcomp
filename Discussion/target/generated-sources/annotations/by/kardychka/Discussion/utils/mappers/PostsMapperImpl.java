package by.kardychka.Discussion.utils.mappers;

import by.kardychka.Discussion.DTOs.Requests.PostRequestDTO;
import by.kardychka.Discussion.DTOs.Responses.PostResponseDTO;
import by.kardychka.Discussion.models.Post;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-28T16:45:59+0300",
    comments = "version: 1.6.0, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class PostsMapperImpl implements PostsMapper {

    @Override
    public PostResponseDTO toPostResponse(Post post) {
        if ( post == null ) {
            return null;
        }

        PostResponseDTO postResponseDTO = new PostResponseDTO();

        postResponseDTO.setContent( post.getContent() );

        postResponseDTO.setId( post.getKey().getId() );
        postResponseDTO.setNewsId( post.getKey().getNewsId() );

        return postResponseDTO;
    }

    @Override
    public List<PostResponseDTO> toPostResponseList(Iterable<Post> posts) {
        if ( posts == null ) {
            return null;
        }

        List<PostResponseDTO> list = new ArrayList<PostResponseDTO>();
        for ( Post post : posts ) {
            list.add( toPostResponse( post ) );
        }

        return list;
    }

    @Override
    public Post toPost(PostRequestDTO postRequestDTO) {
        if ( postRequestDTO == null ) {
            return null;
        }

        Post post = new Post();

        post.setContent( postRequestDTO.getContent() );

        post.setKey( new Post.PostKey(postRequestDTO.getNewsId()) );

        return post;
    }
}
