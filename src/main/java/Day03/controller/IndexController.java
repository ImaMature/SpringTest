package Day03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    //메인 페이지 연결
    @GetMapping("/") //http주소값 정하기 (최상위 경로임)
    public String main(){
        return "Day03/main";
    }
}
