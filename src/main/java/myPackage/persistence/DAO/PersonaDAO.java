package myPackage.persistence.DAO;

import com.mongodb.Mongo;
import myPackage.persistence.Document.PersonaDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;


/**
 * Created by thebous on 03/07/17.
 */
public interface PersonaDAO extends MongoRepository<PersonaDocument, Integer> {

    public List<PersonaDocument> findByName(String name);

}
