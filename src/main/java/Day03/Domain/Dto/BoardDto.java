package Day03.Domain.Dto;

import Day03.Domain.Entity.BoardEntity;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Builder //생성자의 안정성을 보장하는 builder, 인수구분 X null도 받아줌
@ToString
public class BoardDto {

    private int b_num;
    private String b_title;
    private String b_contents;
    private String b_writer;
    private LocalDateTime createdDate; //생성일
    private int b_count;

    //dto -> entity 변경하는 메소드
    public BoardEntity toentity(){
        return  BoardEntity.builder()
                .b_title(this.b_title) //b_num, b_count는 직접 넣어주는게 아니라 뺐음
                .b_contents(this.b_contents)
                .b_writer(this.b_writer)
                .build();
    }
}
