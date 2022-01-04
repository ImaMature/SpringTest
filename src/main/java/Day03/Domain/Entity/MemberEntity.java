package Day03.Domain.Entity;

import lombok.*;

import javax.persistence.*;

@Entity //DB 내 테이블과 연결
@Table(name="member") //테이블 속성
@Setter
@Getter
@Builder //생성자 안정성 보장
@AllArgsConstructor //풀 생성자
@NoArgsConstructor //빈 생성자
public class MemberEntity extends BaseTimeEntity{
    //기본 시간을 만들어주는 클래스를 만들어서 상속받기
    //왜냐면 클래스하나 만들어놓으면 여기저기서 쓰일 수 있기 때문이다.

    @Id//기본키 pk
    @GeneratedValue(strategy= GenerationType.IDENTITY) //auto key
    private int m_num;       //회원 번호

    @Column
    private String m_id;        //회원 아이디
    @Column
    private String m_password;  //회원 비밀번호
    @Column
    private String m_name;      //회원 이름
    @Column
    private String m_sex;       //회원 성별
    @Column
    private String m_phone;     //회원 전화번호
    @Column
    private String m_email;     //회원 이메일
    @Column
    private String m_address;   //회원 주소
    @Column
    private int m_point;        //회원 포인트
    @Column
    private String m_grade;     //회원 등급


}
