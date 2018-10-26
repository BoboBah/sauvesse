package sn.alien.alienprojectsse.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.alien.alienprojectsse.classes.Accident;

public interface AccidentRepository extends JpaRepository<Accident, Long> {
}
