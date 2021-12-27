package Day01.Day01_2.Dto;

import lombok.*;
//lombook이라는 라이브러리는 클래스 설계시 사용되는 어노테이션 제공
    //실행시 자동으로 메소드 생성
@Setter //현재 필드에 set 메소드를 제공
@Getter //현재 필드에 get 메소드를 제공
@NoArgsConstructor //빈 생성자 제공
@AllArgsConstructor // 풀 생성자 제공
//@RequiredArgsConstructor // 생성자 사용 시 null일 경우(자료데이터가 없을 경우) null 값 부여 [NotNullPoint 예외처리]
@ToString //객체 정보 메소드 제공
public class Member {
    //필드
    private String id;
    private String password;

    //생성자 (롬북 @NoArgsConstructor 사용하면 굳이 안 만들어도 됨)
    //메소드 롬북사용하면 get,set 메소드 자동 생성)
}
