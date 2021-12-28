package Day02.Day02_2_mysql_JPA.domain;

import javax.persistence.*;

//javax로 임포트 해야됨
@Entity//연결된 DB에 테이블과 매핑 
@Table(name="member") //매핑할 테이블명 
public class MemberEntity {

    @Id //기본 키 설정 -> DB의 PK
    @GeneratedValue(strategy= GenerationType.IDENTITY) //오토키 어노테이션
    private Long m_num; //회원 번호

    @Column(length=200, nullable=false) //필드 속성
    private String m_id; //회원 아이디

    @Column(length=200, nullable=false) //필드 속성
    private String m_password; //회원 비밀번호
}
//JPA를 이용한 DB조작