package scheduling.soccer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import scheduling.soccer.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
