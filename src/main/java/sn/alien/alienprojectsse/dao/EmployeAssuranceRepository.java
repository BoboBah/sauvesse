package sn.alien.alienprojectsse.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.alien.alienprojectsse.classes.EmployeAssurance;

public interface EmployeAssuranceRepository extends JpaRepository<EmployeAssurance, Long> {

    public EmployeAssurance  findByIdEmploye(Long id);
}
