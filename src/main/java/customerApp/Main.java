package customerApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
@ComponentScan
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
