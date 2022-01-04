package Day03.Service;


import Day03.Domain.Dto.BoardDto;
import Day03.Domain.Entity.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //필수!!
public class BoardService {

    @Autowired
    BoardRepository boardRepository;

    public boolean boardwrite(BoardDto boardDto){
        //System.out.println(boardDto.toString());
        boardRepository.save(boardDto.toentity()).getB_num(); //toentity 변환시켜 집어넣는다. 메소드라서 이름 아무렇게나 가능
        return true;
    }



}
