package spring.SpringJWT.repo;

import spring.SpringJWT.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
    User findByUsername (String username);
}
