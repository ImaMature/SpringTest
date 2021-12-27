package Day01.Day01_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //HTTP로부터 매체 전송 가능 (thymeleaf랑 호환 XXXX!!!!)
@SpringBootApplication // 스프링부트에서 제공하는 기본적인 설정값 가져오기
public class Day01_SpringbootStart {

    //스프링부트 웹 시작메소드
    public static void main(String[] args) { //메인쓰레드
        System.out.println("안녕하세요");
        SpringApplication.run(Day01_SpringbootStart.class,args);//실행시키기
    }

    //웹에 데이터 보내기

    /*public String 보내기(){
        return "스프링부트 웹 시작"; //보내오는 거 없음
    }*/

    //보내기 메소드
    @GetMapping(value="/") //get 방식의 매핑 ("경로") /: localhost:8080-> "/" 최상위 경로(메인페이지) -> 매핑된 메소드는 실행
    public String 보내기(){
        return "스프링부트 웹 시작"; //매핑된 경로로 메소드 결과 호출

    }
}
/*
*
*
*\
 * @ : 어노테이션
 * 1. SpringBootApplication : 스프링부트에서 제공하는 데이터 가져오기
 *   1) SpringApplication 클래스 :
 *       a) run 메소드 : (현재 클래스명. css, args(main 쓰레드 배열명))
 *
 * 2. @RestController
 *   1) Restful Web API를 좀더 쉽게 만들기 위해 스프링 프레임 워크 4.0에 도입된 기능, @Controller와 @ResponseBody를 합쳐놓은 어노테이션
 *   2) @Controller : 어노테이션을 선언하면 해당 클래스를 요청을 처리하는 컨트롤러로 사용한다.
 *   3) @ResponseBody : 자바 객체를 HTTP 응답 본문의 객체로 변환해 클라이언트에게 전달해서 따로 html파일 없이도 웹 브라우저에 문자열 출력 가능
 *
 * 3. @GetMapping
 *   1) 클라이언트의 요청을 처리할 URL을 매핑한다. @GetMapping(value="/") : "/" -> 최상위 경로와 매핑   "/" 경로와 메소드 매핑[연결]
 *   2) 서버의 루트로 오는 요청을 처리할 수 있도록 value="/"로 선언
 *   3) 컨트롤러 클래스에서 요청한다.
 * HTTP : HyperText Transfer Protocol
 *
 * 4. Lombok [p.39]
 *  1) get, set, 생성자 ,ToString 등 어노테이션 제공
 *
 * */
