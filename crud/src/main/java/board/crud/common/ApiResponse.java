package board.crud.common;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
//@Setter   //ApiResponse는 변경될 일이 없으니 삭제해야함
@NoArgsConstructor(access = AccessLevel.PROTECTED) //외부에서 무분별한 생성을 막음
@AllArgsConstructor
public class ApiResponse<T> {
    private int status;      // success 또는 fail
    private String message;     // 사용자에게 보여줄 메시지
    private T data;         // 실제 결과 데이터 (리스트 혹은 단일 객체)
    private long timestamp; // 응답 생성 시간

    // 성공 응답
     public static <T> ApiResponse<T> success(HttpStatus status, String message,T data) {
         return new ApiResponse<>(status.value(), message, data, System.currentTimeMillis());
     }

     // 데이터 없이 성공 응답 (보통 삭제, 수정 시 사용)
    public static <T> ApiResponse<T> success(HttpStatus status, String message) {
         return success(status, message, null);
    }

    // 실패 응답
     public static <T> ApiResponse<T> fail(HttpStatus status,String message) {
         return new ApiResponse<>(status.value(), message, null, System.currentTimeMillis());
     }
}
