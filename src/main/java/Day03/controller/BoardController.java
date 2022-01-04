package Day03.controller;

import Day03.Domain.Dto.BoardDto;
import Day03.Service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    //http url 연결
    //게시판 첫 테이블 페이지
    @GetMapping("board/boardlist")
    public String boardlist(){
        return "Day03/board/boardlist"; //타임리프를 통한 html 반환
    }

    //게시판 쓰기 페이지 연결
    @GetMapping("board/boardwrite")
    public String boardwrite(){
        return "Day03/board/boardwrite";
    }

    @Autowired
    BoardService boardService; //서비스 메소드 호출용 객체

    //게시판 글쓰기 페이지 연결
    @PostMapping("board/boardwritecontroller")
    public String boardwritecontroller(BoardDto boardDto){
        System.out.println(boardDto.toString());
        boardService.boardwrite(boardDto);
        return "redirect:/board/boardlist"; //글쓰기 성공시 게시판 목록 이동
    }
}
