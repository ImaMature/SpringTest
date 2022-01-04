package Day03.Service;

import Day03.Domain.Dto.MemberDto;
import Day03.Domain.Entity.MemberEntity;
import Day03.Domain.Entity.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    //회원 등록 메소드
    public boolean membersignup(MemberDto memberDto){
        System.out.println(memberDto.toString());
        //Service 에서 Repository로 갈때 Dto에서 Entity로 변환해서 가야됨
        memberRepository.save(memberDto.toentity()); // Entity를 DB에 저장
                        //save (entity) : insert/update
        return true;
    }

}
