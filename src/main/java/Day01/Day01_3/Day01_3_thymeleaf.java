package Day01.Day01_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller //HTML이랑 연동할 때는 컨트롤러 사용.
@SpringBootApplication //웹 키는 거
public class Day01_3_thymeleaf {
    public static void main(String[] args) {
        SpringApplication.run(Day01_3_thymeleaf.class, args); //웹 키는 거
    }



    //타임 리프(thymeleaf)를 이용한 html 접근
        //thymeleaf : resources 폴더 내 templates 폴더 생성하고 그 폴더 내에서 html 반환
            //java 폴더에 백엔드
            //resource 폴더에 프론트엔드 [html, css, js 등등..]
            //앞으로 의 흐름 DTO -> Controller ->thymleaf -> 페이지 열기
    @GetMapping("/")
    public String mainpage(){
        return "Day01/Mainpage"; //html 파일명 경로
    }

}
