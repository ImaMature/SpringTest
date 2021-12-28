package Day02.Day02_1_롬복_타임리프.Dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor //미리 만들어 진것들은 첫글자 대문자이기 때문에
@NoArgsConstructor
public class BoardDto {

    //필드
    private String b_title;
    private String b_contents;
    private Date b_date;

    //생성자
    //public BoardDto(){} -> (빈생성자) @NoArgsConstructor로 대체

/*  (풀생성자) @AllArgsConstructor로 대체
    public BoardDto(private String b_title, private String b_contents, private String b_date){
        this.b_title = b_title;
        this.b_contents = b_contents;
        this.b_date = b_date;
    }
*/

    //메소드
    //get / set메소드 -> @Getter /@Setter로 대체 가능
}

//롬복 사용하는 이유
