package sn.alien.alienprojectsse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.alien.alienprojectsse.classes.Medecin;
import sn.alien.alienprojectsse.metier.ImetierMedecin;


import java.util.List;

@RestController
public class MedecinController {


    @Autowired
    private ImetierMedecin metier;




    @RequestMapping(value = "/medecins", method = RequestMethod.GET)
    public List<Medecin> getAllMedecins()


    {
        return metier.getAllMedecins();
    }




}
