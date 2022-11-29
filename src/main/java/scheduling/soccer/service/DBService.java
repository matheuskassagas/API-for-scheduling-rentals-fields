package scheduling.soccer.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scheduling.soccer.entities.User;
import scheduling.soccer.repository.UserRepository;

import java.text.ParseException;

@Service
public class DBService {

//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserRepository userRepository;

    public void instantiateTestDataBase() throws ParseException {

        User user1 = new User(null, "Matheus G. Kassagas", "mgk@hotmail.com", "000.000.000-00", "bCryptPasswordEncoder.encode");
        userRepository.save(user1);
    }

}
