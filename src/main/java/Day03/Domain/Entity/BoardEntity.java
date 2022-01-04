package Day03.Domain.Entity;

import lombok.*;

import javax.persistence.*;

@Entity //db내 테이블과 매핑 설정
@Table (name="board") // db 내 테이블 속성 설정(이름)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter @Setter
public class BoardEntity extends BaseTimeEntity{ //날짜 시간 상속 받아 필드 2개 더 생김

    @Id //pk
    @GeneratedValue(strategy= GenerationType.IDENTITY) //auto key
    private int b_num;

    @Column
    private String b_title;
    @Column
    private String b_contents;
    @Column
    private String b_writer;
    @Column
    private int b_count;
}
