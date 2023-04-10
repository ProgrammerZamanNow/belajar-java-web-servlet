package programmerzamannow.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class BelajarServletApp {

    public static void main(String[] args) {
        SpringApplication.run(BelajarServletApp.class);
    }
}
