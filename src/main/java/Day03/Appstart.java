package Day03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing //jpa에 auditing가능하게 하는 거
@SpringBootApplication // 스프링부트 사용 주입
public class Appstart {
    public static void main(String[] args) {
        SpringApplication.run(Appstart.class,args);
    }
}
