package board.crud.dao;

import board.crud.domain.Bbs;
import board.crud.domain.SearchParam;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardDAO {
    //전체 조회
    List<Bbs> selectBoardList(SearchParam param);

    // 단건 조회
    Bbs selectBoardById(int id);

    // 전체 게시글 개수 조회( 페이징 하단 번호 계산용)
    int selectBoardCount();

    //게시글 생성
    void insertBoard(Bbs bbs);

    // 게시글 수정
    int updateBoard(Bbs bbs);

    // 게시글 삭제
    int deleteBoard(int id);
}
