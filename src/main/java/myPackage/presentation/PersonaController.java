package myPackage.presentation;

import myPackage.persistence.DAO.PersonaDAO;
import myPackage.persistence.Entity.PersonaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by thebous on 03/07/17.
 */
@RestController
public class PersonaController {


    private final PersonaDAO persona;

    @Autowired
    public PersonaController(PersonaDAO persona){
        this.persona = persona;
    }


    @RequestMapping(value = "/persona", method = RequestMethod.POST)
    @ResponseBody
    public void insertPersona(@RequestBody PersonaEntity personaInsert ){
        persona.save(personaInsert);
    }

}
