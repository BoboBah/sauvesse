package sn.alien.alienprojectsse.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.alien.alienprojectsse.classes.User;

public interface UserRepository extends JpaRepository<User, String> {
}
