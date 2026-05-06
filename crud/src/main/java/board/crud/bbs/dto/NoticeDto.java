package board.crud.bbs.dto;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class NoticeDto {
    private int noticeSeq;
    private String userId;
    private String userName;
    private String title;
    private String contents;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    //페이징
    private Integer totalCount;
}
