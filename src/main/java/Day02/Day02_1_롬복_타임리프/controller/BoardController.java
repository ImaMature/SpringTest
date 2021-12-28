package Day02.Day02_1_롬복_타임리프.controller;

import Day02.Day02_1_롬복_타임리프.Dto.BoardDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

@Controller  //MVC 중 현재 클래스를 컨트롤러로 지정
public class BoardController {

    ArrayList<BoardDto> boardDtos = new ArrayList<>();

    @GetMapping("/") //컨트롤러 내의 최상위 경로와 연결(매핑) ("/") : 최상위 경로 //get방식 : GetMapping post방식 : PostMapping
    public String boardlist(Model model){ //Model : UI통신 인터페이스 이를 통해 html로 보내기 (Controller-> View)
////////////////////////////////////// 예제1 : dto보내기 ///////////////////////////////////////////////////////////////

       ///boardDto의 내용 설정
        BoardDto boardDto = new BoardDto("안녕하세요", "타임리프트 데이터 보내기", new Date());
        model.addAttribute("boardDto",boardDto);
        //model.addAttribute ("모델명", 모델값) //session값 받아서 프론트로 보낼 때 씀

////////////////////////////////////// 예제2 : 리스트 보내기 /////////////////////////////////////////////////////////////

        model.addAttribute("boardDtos",boardDtos);
            //model.addAttribute ("모델명", 리스트값) //session값 받아서 프론트로 보낼 때 씀

        return "Day02/boardlist"; //타임리프 설치했을 경우 html 반환
    }


    //post방식은 @PostMapping
    //("/액션명")
    @GetMapping("/boardwrite")  //boardlist.html(view)에서 <form action="boardwrite" method="get"> 이렇게 보낸걸 받아옴
    public String boardwrite(BoardDto boardDto){
                                    //form 내 name과 dto내 필드명이 같을 경우 dto 자동 저장 / request 할 필요 X
        boardDto.setB_date(new Date());
        boardDtos.add(boardDto);
        //return "Day02/boardlist";   //해당 html(View)로 값 반환
        return "redirect:/";          // 경로 이동 (redirect : 경로명)
    }

////////////////////////////////////// 예제3 : ajax 이용 /////////////////////////////////////////////////////////////
    @GetMapping("/boardwrite2")
    public String boardwrite2(BoardDto boardDto){
        boardDto.setB_date(new Date());
        boardDtos.add(boardDto);
        //System.out.println(boardDto);
        return "redirect:/";          // 경로 이동 (redirect : 경로명)
    }

    ////////////////////////////////////// 예제4 : json 이용 /////////////////////////////////////////////////////////////
   /* @PostMapping("/boardwrite3")
    public String boardwrite3(@RequestBody BoardDto boardDto){
                                //ajax와 통신시 json담을 때는 @RequestBody(전체를 다 담겠다)를 사용
        boardDto.setB_date(new Date());
        boardDtos.add(boardDto);
        //System.out.println(boardDto);
        return "redirect:/";          // 경로 이동 (redirect : 경로명)
    }*/

    @PostMapping("/boardwrite3")
    public String boardwrite3(@RequestBody Map<String, String> json){
        //ajax와 통신시 json담을 때는 @RequestBody(전체를 다 담겠다)를 사용
        BoardDto boardDto = new BoardDto(json.get("b_title"), json.get("b_contents"), new Date());
        boardDtos.add(boardDto);
        //System.out.println(boardDto);
        return "redirect:/";          // 경로 이동 (redirect : 경로명)
    }
}
