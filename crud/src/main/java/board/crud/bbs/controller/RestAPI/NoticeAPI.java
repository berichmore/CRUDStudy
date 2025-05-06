package board.crud.bbs.controller.RestAPI;


import board.crud.bbs.dto.NoticeDto;
import board.crud.bbs.service.NoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/notice")
public class NoticeAPI {

    private final NoticeService noticeService;

    //공지사항 리스트 API
    @GetMapping("/list")
    public List<NoticeDto> getPageList(@RequestParam(name = "page", defaultValue = "1")int page,
                                       @RequestParam(name = "size", defaultValue = "10")int size){
        List<NoticeDto> listPage = noticeService.getPageList(page, size);
        return listPage;
    }
}
