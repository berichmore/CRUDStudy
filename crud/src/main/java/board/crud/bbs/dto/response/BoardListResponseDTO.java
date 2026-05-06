package board.crud.bbs.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class BoardListResponseDTO {
    private Long boardId;
    private String title;
    private String writer;
    private LocalDateTime createdAt;
    private boolean isSecret;

    // MyBatis 매핑을 위한 생성자 또는 Builder
}
