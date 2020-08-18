package gt.com.antiguaburger.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"gt.com.antiguaburger.controller", "gt.com.antiguaburger.model"})
public class AntiguaBurgerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AntiguaBurgerApplication.class, args);
    }

}
