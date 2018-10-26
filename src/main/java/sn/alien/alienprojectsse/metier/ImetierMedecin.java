package sn.alien.alienprojectsse.metier;

import org.hibernate.type.descriptor.java.TimeZoneTypeDescriptor;
import sn.alien.alienprojectsse.classes.Medecin;
import sn.alien.alienprojectsse.errors.MedecinNotFoundException;

import java.util.List;

public interface ImetierMedecin {

    public Medecin ajouterMedecin(Medecin medecin);



    public List<Medecin> getAllMedecins();


    public Medecin getByIdMedecin(Long idMedecin);


    public List<Medecin> getBySpecialite(String specialite);


    public Medecin getMedecinByMatricule(String matricule);







}
