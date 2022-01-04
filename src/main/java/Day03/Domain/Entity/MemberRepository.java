package Day03.Domain.Entity;

import org.springframework.data.jpa.repository.JpaRepository;

//DAO역할을 한다.
public interface MemberRepository extends JpaRepository<MemberEntity, Integer> {

}
