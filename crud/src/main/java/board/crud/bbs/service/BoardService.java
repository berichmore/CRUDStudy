package board.crud.bbs.service;


import board.crud.bbs.dto.request.BoardSearchRequestDTO;
import board.crud.bbs.dto.response.BoardListResponseDTO;
import board.crud.bbs.mapper.BoardMapper;
import board.crud.common.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BoardService {

    private final BoardMapper boardMapper;

    public ApiResponse<Map<String, Object>> getBoardList(BoardSearchRequestDTO boardSearchRequestDTO) {
        // 1. 목록 조회
        List<BoardListResponseDTO> list = boardMapper.findAll(boardSearchRequestDTO);

        // 2. 전체 갯수 조회
        int totalCount = boardMapper.countAll(boardSearchRequestDTO);

        // 3. 페이징 결과와 함께 반환 (커스텀 공통 객체 사용 가능)
        Map<String, Object> result = new HashMap<>();
        result.put("list", list);
        result.put("totalCount", totalCount);
        result.put("currentPage", boardSearchRequestDTO.getPage());
        return ApiResponse.success(HttpStatus.OK, "조회 성공", result);
    }
}
