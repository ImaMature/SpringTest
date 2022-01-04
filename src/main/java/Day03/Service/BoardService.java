package Day03.Service;


import Day03.Domain.Dto.BoardDto;
import Day03.Domain.Entity.BoardEntity;
import Day03.Domain.Entity.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service //필수!!
public class BoardService {

    @Autowired
    BoardRepository boardRepository;

    public void boardwrite(BoardDto boardDto){
        //System.out.println(boardDto.toString());
        boardRepository.save(boardDto.toentity()); //toentity 변환시켜 집어넣는다. 메소드라서 이름 아무렇게나 가능

    }

    //엔티티 -> dto 변환
    public ArrayList<BoardDto> boardlist() {
        List<BoardEntity> boardEntities = boardRepository.findAll(); //모든 Entity 호출
        ArrayList<BoardDto> boardDtos = new ArrayList<>();           //모든 dto 담을 리스트
        for (BoardEntity boardEntity : boardEntities) { //모든 엔티티를 반복하면서 하나씩 꺼내오기
            BoardDto boardDto = new BoardDto(
                    //엔티티 -> dto
                    boardEntity.getB_num(),
                    boardEntity.getB_title(),
                    boardEntity.getB_contents(),
                    boardEntity.getB_writer(),
                    boardEntity.getCreatedDate(),
                    boardEntity.getB_count());
            //System.out.println(boardEntity.getB_num());
            boardDtos.add(boardDto); //리스트에 저장
        }
        System.out.println(boardDtos);
        return boardDtos;

    }
}
