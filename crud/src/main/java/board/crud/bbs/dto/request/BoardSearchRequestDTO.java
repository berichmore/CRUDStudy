package board.crud.bbs.dto.request;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardSearchRequestDTO {
    private String keyword;  // 검색어
    private int page = 1;   // 현재 페이지
    private int size = 10;  // 한 페이지당 보여줄 개수

    // MyBatis에서 offset 계산을 위해 사용
    public int getOffset() {
        return (page - 1) * size;
    }
}
