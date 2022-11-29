package scheduling.soccer.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import scheduling.soccer.service.DBService;

import java.text.ParseException;

@Configuration
@Profile("dev")
public class DevTest {

    @Autowired
    private DBService dbService;
    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String strategy; // save value

    @Bean
    public boolean instantiateDataBase() throws ParseException {
        if (!"create".equals(strategy)){
            return false;
        }
        dbService.instantiateTestDataBase();
        return true;
    }
}
