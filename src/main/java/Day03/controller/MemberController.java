package Day03.controller;

import Day03.Domain.Dto.MemberDto;
import Day03.Domain.Entity.MemberRepository;
import Day03.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class MemberController {
    
    @GetMapping("/member/login") //로그인 페이지 연결
    public String login(){
        return "Day03/member/login";
    }

    @GetMapping("/member/signup")//회원가입 페이지 연결
    public String signup() { return "Day03/member/signup"; }


  // MemberService memberService = new MemberService();
    @Autowired
    MemberService memberService;
    //HttpSession httpSession;

    //회원가입 처리 연결
    @PostMapping("/member/signupcontroller")
    public String signupcontroller(MemberDto memberDto){
                                    //자동주입 : form에서 입력한 name이름들과 dto의 필드 이름들이 동일하면 자동 주입
                                    //입력이 없는 필드들은 초기값 (문자는 null, 숫자는 0)
        //System.out.println(memberDto.toString()); //mapping한 값들이 제대로 나오는지 출력하기(Autowired하기전)
        memberService.membersignup(memberDto);

        return "redirect:/member/login"; //회원가입 성공시 로그인 페이지로 매핑
    }

    //회원 로그인 메소드
    @PostMapping("/member/logincontroller")
    public String logincontroller(MemberDto memberDto){
        MemberDto loginDto = memberService.login(memberDto);
        if(loginDto!=null){
            System.out.println("login success");
        }else{
            System.out.println("login fail");
        }
        return "redirect:/";
    }
}
