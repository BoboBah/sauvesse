package sn.alien.alienprojectsse.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.alien.alienprojectsse.classes.Maladie;

public interface MaladieRepository extends JpaRepository<Maladie, Long> {
}
