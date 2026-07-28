package board.crud.service;

import board.crud.dao.BoardDAO;
import board.crud.domain.Bbs;
import board.crud.domain.SearchParam;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BoardService {

    private final BoardDAO boardDAO;

    public BoardService(BoardDAO boarddao) {
        this.boardDAO = boarddao;
    }

    public Map<String, Object> getBoardListWithCount(int page, int size) {
        int offset = (page - 1) * size;
        SearchParam param = new SearchParam();


        List<Bbs> list = boardDAO.selectBoardList();
        int totalCount = boardDAO.selectBoardCount();

        // 3.

       Map<String,Object> result =  new HashMap<>();
       result.put("list", list);    //list라는 이름으로 목록 달기
        result.put("totalCount", totalCount);
        return result;
    }
}
