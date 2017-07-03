package myPackage.persistence.DAO;

import myPackage.persistence.Entity.PersonaEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by thebous on 03/07/17.
 */
public interface PersonaDAO extends MongoRepository<PersonaEntity, Integer> {

}
