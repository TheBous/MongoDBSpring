package myPackage.persistence.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class UserEntity {

    @Id
    private Integer id;

    @Indexed(unique = true)
    private String domain;

    private boolean displayAds;

}



