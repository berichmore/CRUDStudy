package board.crud.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping
@CrossOrigin("/*")
public class BbsController {



    @GetMapping()
    public String start(){
        return "/header/header";
    }

    @GetMapping("jay")
    public String jayBranch(){
        return "/jay/jaySession";
    }
    //너무짜증나ㅇㅇㅇ

}
