package Day03.Domain.Entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@EntityListeners(AuditingEntityListener.class) //
@MappedSuperclass
public class BaseTimeEntity {
    //다른 곳에서도 생성 시간, 수정 시간을 쓰니까 밖으로 클래스로 빼놓아서 엔티티에서 extends해서 쓰는거임
    //엔티티 생성날짜 / 수정날짜 자동 주입하기

    @CreatedDate    //스프링에서 지원하는 현재 날짜와 시간 주입하는 어노테이션
    private LocalDateTime createdDate; //객체

    @LastModifiedDate   //스프링에서 지원하는 마지막으로 변경된 날짜와 시간 주입하는 어노테이션
    private LocalDateTime modifiedDate;
}
