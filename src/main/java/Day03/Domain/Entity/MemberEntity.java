package Day03.Domain.Entity;

import lombok.Setter;

import javax.persistence.*;

@Entity //DB 내 테이블과 연결
@Table(name="member") //테이블 속성
@Setter
public class MemberEntity {

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
