package sn.alien.alienprojectsse.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.alien.alienprojectsse.classes.Medecin;
import sn.alien.alienprojectsse.dao.MedecinRepository;
import sn.alien.alienprojectsse.errors.MedecinNotFoundException;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MedecinImpl implements ImetierMedecin {


    @Autowired
    private MedecinRepository medecinRepository;

    @Override
    public Medecin ajouterMedecin(Medecin medecin) {

        return medecinRepository.save(medecin);
    }

    @Override
    public List<Medecin> getAllMedecins() {

        return medecinRepository.findAll();
    }

    @Override
    public Medecin getByIdMedecin(Long idMedecin)  {

        if (idMedecin == null) {

            throw new MedecinNotFoundException("Medecin avec "+idMedecin+ "est introuvable");

        }

        Medecin medecin = medecinRepository.getOne(idMedecin);

        if (medecin == null) {
            throw new MedecinNotFoundException("Medecin avec "+idMedecin+ "est introuvable");
        }

        return medecin;
    }

    @Override
    public List<Medecin> getBySpecialite(String specialite) {

        if (specialite == null) {

            throw new MedecinNotFoundException("Les medecins de cette specialite sont introuvables");

        }

        List<Medecin> medecins = medecinRepository.findBySpecialite(specialite);

        if (medecins == null) {
            throw new MedecinNotFoundException("Les medecins de cette specialite sont introuvables");
        }

        return medecins;
    }

    @Override
    public Medecin getMedecinByMatricule(String matricule) {

        if (matricule == null) {
            throw new MedecinNotFoundException("aucun medecin avec ce "+matricule+ " matricule");
        }

        Medecin medecin = medecinRepository.findByMatricule(matricule);

        if (medecin == null) {

            throw new MedecinNotFoundException("aucun medecin avec ce "+matricule+ " matricule");

        }


        return medecinRepository.findByMatricule(matricule);
    }
}
