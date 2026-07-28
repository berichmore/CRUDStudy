package board.crud.controller;

import board.common.ApiResponse;
import board.common.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController("/")
public class BoardController {

    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    public ResponseEntity<ApiResponse<Map<String,Object>>> getList(
//            @RequestParam
            /*
            서버가 요청을 보낼 때 , URL 뒤에 물음표를 붙여서 데이터를 보내는데
            ex) http://localhost:8080/list?page=2&size=20

            이때, 스프링 컨트롤러에게 "URL에 붙어있는 page라는 값을 읽어서 내 자바 변수 int page에 쓱
            넣어줘! 라고 부탁하는 어노테이션이 바로 @RequestParam
             */
    ){

        return null;
    }
}
