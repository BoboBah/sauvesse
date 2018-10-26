package sn.alien.alienprojectsse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sn.alien.alienprojectsse.classes.*;
import sn.alien.alienprojectsse.dao.*;
import sn.alien.alienprojectsse.metier.ImetierMedecin;

import javax.jws.soap.SOAPBinding;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class AlienprojectsseApplication implements CommandLineRunner {


    @Autowired
    private MedecinRepository medecinRepository;


    @Autowired
    private UserRepository userRepository;



    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private AssuranceRepository assuranceRepository;

    @Autowired
    private EmployeAssuranceRepository employeAssuranceRepository;

    @Autowired
    private AssureRepository assureRepository;

    @Autowired
    private BeneficiaireRepository beneficiaireRepository;

    @Autowired
    private AssistantRepository assistantRepository;

    @Autowired
    private PharmacieRepository pharmacieRepository;

    @Autowired
    private PharmacienRepository pharmacienRepository;
    @Autowired
    private TraitementRepository traitementRepository;
    @Autowired
    private MaladieRepository maladieRepository;

    @Autowired
    private ActeMedicalRepository acteMedicalRepository;


    @Autowired
    private AccidentRepository accidentRepository;


    @Autowired
    private ImetierMedecin metier;


    public static void main(String[] args) {
        SpringApplication.run(AlienprojectsseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {






    }
}
