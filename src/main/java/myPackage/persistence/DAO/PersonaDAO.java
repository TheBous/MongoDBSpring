package myPackage.persistence.DAO;

import myPackage.persistence.Entity.PersonaEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by thebous on 03/07/17.
 */
@Repository
public interface PersonaDAO extends MongoRepository<PersonaEntity, ObjectId>{

}
