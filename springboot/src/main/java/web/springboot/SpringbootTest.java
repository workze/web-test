package web.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangguize
 * date 2019-09-28
 */
@RestController
@SpringBootApplication
public class SpringbootTest {

    @RequestMapping("/")
    public Integer get() {
        return 1;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTest.class, args);
    }
}
