package board.crud.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Bbs {

    private int seq;
    private String id;
    private String title;
    private String content;
}
