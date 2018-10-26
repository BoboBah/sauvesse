package sn.alien.alienprojectsse.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.alien.alienprojectsse.classes.Assurance;

public interface AssuranceRepository extends JpaRepository<Assurance, Long> {


    public Assurance findByIdAssurance(Long id);
}
