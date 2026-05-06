package board.crud.bbs.mapper;

import board.crud.bbs.dto.request.BoardSearchRequestDTO;
import board.crud.bbs.dto.response.BoardListResponseDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    // 게시글 목록 조회 (검색 및 페이징 포함)
    List<BoardListResponseDTO> findAll(BoardSearchRequestDTO searchRequestDTO);

    // 전체 게시글 개수 (페이징 계산용)
    int countAll(BoardSearchRequestDTO searchRequestDTO);
}
