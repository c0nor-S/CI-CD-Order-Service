package ie.atu.CICDorderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CiCdOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CiCdOrderServiceApplication.class, args);
    }

}
