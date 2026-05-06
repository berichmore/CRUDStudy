//package board.crud.bbs.service;
//
//import board.crud.bbs.dto.NoticeDto;
//import board.crud.bbs.mapper.NoticeMapper;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class NoticeService {
//
//    private final NoticeMapper noticeMapper;
//
//    // 게시글 리스트 + 페이지네이션
//    public List<NoticeDto> getPageList(int page, int size){
//        int offset = (page - 1) * size;
//        List<NoticeDto> list = noticeMapper.getPageList(page, size);
//
////        if(!list.isEmpty()){
////            list.get(0).setTotalCount(totalCount);
////        }
//        return list;
//    }
//}
