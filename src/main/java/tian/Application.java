package tian;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2016/12/9.
 */
@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String greeting(){
        return "hello";
    }

    public static void main(String[] args) {
        System.out.println("tds");

        SpringApplication.run(Application.class,args);
    }
}
