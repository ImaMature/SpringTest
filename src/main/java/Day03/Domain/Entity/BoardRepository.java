package Day03.Domain.Entity;

import Day03.Domain.Entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
                                                    //연결할 Entity명, 해당 Entity의 기본키(pk)의 자료형
public interface BoardRepository extends JpaRepository<BoardEntity,Integer> {
}
