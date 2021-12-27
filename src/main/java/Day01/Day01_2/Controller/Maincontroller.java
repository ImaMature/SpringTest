package Day01.Day01_2.Controller;

import Day01.Day01_2.Dto.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //현재 클래스에 컨트롤러 부여
public class Maincontroller {

    @GetMapping(value="/")
    public Member mainpage(){ //객체반환 반환타입 = 클래스
        Member member = new Member("aa","aa");
        return member;
    }
}
