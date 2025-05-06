package board.crud.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/notice")
@CrossOrigin("/*")
public class NoticeController {



    @GetMapping("/header")
    public String start(){
        return "/header/header";
    }

    @GetMapping("/jay")
    public String jayBranch(){
        return "/jay/jaySession";
    }
    //너무짜증나ㅇㅇㅇ
    @GetMapping({"/",""})
    public String notice(){
        return "/notice/list";
    }


}
