package by.kardychka.Publisher.utils.mappers;

import by.kardychka.Publisher.DTOs.Requests.StickerRequestDTO;
import by.kardychka.Publisher.DTOs.Responses.StickerResponseDTO;
import by.kardychka.Publisher.models.Sticker;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-28T16:48:22+0300",
    comments = "version: 1.6.0, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class StickersMapperImpl implements StickersMapper {

    @Override
    public StickerResponseDTO toStickerResponse(Sticker sticker) {
        if ( sticker == null ) {
            return null;
        }

        StickerResponseDTO stickerResponseDTO = new StickerResponseDTO();

        stickerResponseDTO.setId( sticker.getId() );
        stickerResponseDTO.setName( sticker.getName() );

        return stickerResponseDTO;
    }

    @Override
    public List<StickerResponseDTO> toStickerResponseList(List<Sticker> stickers) {
        if ( stickers == null ) {
            return null;
        }

        List<StickerResponseDTO> list = new ArrayList<StickerResponseDTO>( stickers.size() );
        for ( Sticker sticker : stickers ) {
            list.add( toStickerResponse( sticker ) );
        }

        return list;
    }

    @Override
    public Sticker toSticker(StickerRequestDTO stickerRequestDTO) {
        if ( stickerRequestDTO == null ) {
            return null;
        }

        Sticker sticker = new Sticker();

        if ( stickerRequestDTO.getId() != null ) {
            sticker.setId( stickerRequestDTO.getId() );
        }
        sticker.setName( stickerRequestDTO.getName() );

        return sticker;
    }

    @Override
    public List<Sticker> toStickerList(List<StickerRequestDTO> stickerRequestDTOList) {
        if ( stickerRequestDTOList == null ) {
            return null;
        }

        List<Sticker> list = new ArrayList<Sticker>( stickerRequestDTOList.size() );
        for ( StickerRequestDTO stickerRequestDTO : stickerRequestDTOList ) {
            list.add( toSticker( stickerRequestDTO ) );
        }

        return list;
    }
}
