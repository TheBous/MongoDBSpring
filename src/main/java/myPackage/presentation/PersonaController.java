package myPackage.presentation;

import myPackage.businessLogic.PhoneCounter;
import myPackage.persistence.DAO.PersonaDAO;
import myPackage.persistence.Document.PersonaDocument;
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

    @RequestMapping(value = "/insertPersona", method = RequestMethod.POST)
    @ResponseBody
    public void insertPersona(@RequestBody PersonaDocument personaInsert ){
        personaInsert.set_id(PhoneCounter.incrementCounter());
        persona.save(personaInsert);
    }


    @RequestMapping(value = "/findPersona", method = RequestMethod.GET)
    @ResponseBody
    public List<PersonaDocument> findPersona(@RequestParam String name){
        return this.persona.findByName(name);
    }


}
