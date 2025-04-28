package by.kardychka.Publisher.utils.mappers;

import by.kardychka.Publisher.DTOs.Requests.NewsRequestDTO;
import by.kardychka.Publisher.DTOs.Responses.NewsResponseDTO;
import by.kardychka.Publisher.models.News;
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
public class NewssMapperImpl implements NewssMapper {

    @Override
    public NewsResponseDTO toNewsResponse(News news) {
        if ( news == null ) {
            return null;
        }

        NewsResponseDTO newsResponseDTO = new NewsResponseDTO();

        newsResponseDTO.setContent( news.getContent() );
        newsResponseDTO.setCreated( news.getCreated() );
        newsResponseDTO.setId( news.getId() );
        newsResponseDTO.setModified( news.getModified() );
        newsResponseDTO.setTitle( news.getTitle() );

        newsResponseDTO.setCreatorId( news.getCreator().getId() );
        newsResponseDTO.setStickers( news.getStickers().stream().map(sticker -> sticker.getName()).toList() );

        return newsResponseDTO;
    }

    @Override
    public List<NewsResponseDTO> toNewsResponseList(List<News> newss) {
        if ( newss == null ) {
            return null;
        }

        List<NewsResponseDTO> list = new ArrayList<NewsResponseDTO>( newss.size() );
        for ( News news : newss ) {
            list.add( toNewsResponse( news ) );
        }

        return list;
    }

    @Override
    public News toNews(NewsRequestDTO newsRequestDTO) {
        if ( newsRequestDTO == null ) {
            return null;
        }

        News news = new News();

        news.setContent( newsRequestDTO.getContent() );
        if ( newsRequestDTO.getId() != null ) {
            news.setId( newsRequestDTO.getId() );
        }
        news.setTitle( newsRequestDTO.getTitle() );

        return news;
    }
}
