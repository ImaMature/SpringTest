package Day03.Domain.Dto;

import Day03.Domain.Entity.MemberEntity;
import lombok.*;

@NoArgsConstructor  //빈 생성자
@AllArgsConstructor //풀 생성자
@Getter @Setter     //get set 메소드
@ToString           //객체 정보 메소드
@Builder
public class MemberDto {

    public static String getM_id;
    //필드
    private int m_num;       //회원 번호
    private String m_id;        //회원 아이디
    private String m_password;  //회원 비밀번호
    private String m_name;      //회원 이름
    private String m_sex;       //회원 성별
    private String m_phone;     //회원 전화번호
    private String m_email;     //회원 이메일
    private String m_address;   //회원 주소
    private int m_point;        //회원 포인트
    private String m_grade;     //회원 등급

        /*// DTO -> entity
    public MemberEntity toentity(){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setM_id(this.m_id);
        memberEntity.setM_password(this.m_password);
        memberEntity.setM_name(this.m_name);
        memberEntity.setM_sex(this.m_sex);
        memberEntity.setM_phone(this.m_phone);
        memberEntity.setM_email(this.m_email);
        memberEntity.setM_address(this.m_address);
        return memberEntity;
    }*/


    //Dto -> Entity로 변환하는 메소드 Service 에서 Repository로 갈때 Dto에서 Entity로 변환해서 가야됨
    public MemberEntity memberentity(){
        return MemberEntity.builder() //클래스명.builder() 로 시작
                .m_id(this.m_id)
                .m_password(this.m_password)
                .m_name(this.m_name)
                .m_sex(this.m_sex)
                .m_phone(this.m_phone)
                .m_email(this.m_email)
                .m_point(this.m_point)
                .m_grade(this.getM_grade()).build(); //끝날때 .build(); 로 끝남
    }

}
