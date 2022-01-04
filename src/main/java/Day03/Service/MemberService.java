package Day03.Service;

import Day03.Domain.Dto.MemberDto;
import Day03.Domain.Entity.MemberEntity;
import Day03.Domain.Entity.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    //회원 등록 메소드
    public boolean membersignup(MemberDto memberDto){
        System.out.println(memberDto.toString());
        //Service 에서 Repository로 갈때 Dto에서 Entity로 변환해서 가야됨
        memberRepository.save(memberDto.memberentity());
                        // Entity를 DB에 저장
                        //save (entity) : insert/update
        return true;
    }

    //회원 검사 메소드
    public MemberDto login(MemberDto memberDto){
        List<MemberEntity> memberEntityList =  memberRepository.findAll();
        for(MemberEntity memberEntity: memberEntityList){
            //System.out.println( memberEntity.toString());
            if(memberEntity.getM_id().equals(memberDto.getM_id()) &&
            memberEntity.getM_password().equals(memberDto.getM_password())){
                return MemberDto.builder()
                        .m_id(memberEntity.getM_id())
                        .m_num(memberEntity.getM_num()).build();

            }
        }
        return null;
    }

}
