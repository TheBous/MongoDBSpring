package myPackage.persistence.DAO;

import myPackage.persistence.Entity.UserEntity;

/**
 * Created by thebous on 03/07/17.
 */
public interface UserDAO extends MongoRepository<UserEntity, long>{

}
