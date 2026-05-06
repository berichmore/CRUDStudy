package board.crud.common;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice   // 모든 Controller에서 발생하는 예외를 가로챕니다.
public class GlobalExceptionHandler {

    /*
    비즈니스 로직 중 발생하는 일반적인 예외 처리
     */
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ApiResponse<Void>> handleIllegalException(IllegalArgumentException e) {
        log.error("잘못된 인자값 전달: {}", e.getMessage());
        //우리가 만든 ApiResponse.fail()형식을 사용함
         return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(ApiResponse.fail(HttpStatus.BAD_REQUEST, e.getMessage()));

    }
    /**
     * 서버 내부에서 발생하는 예상치 못한 모든 예외 처리 (DB 에러 등)
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<Void>> hadleAllException(Exception e) {
        log.error("서버 내부 에러 발생: ", e);
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ApiResponse.fail(HttpStatus.INTERNAL_SERVER_ERROR,
                        "서버시스템에 문제가 발생했습니다 문의하세요"));
    }
}
