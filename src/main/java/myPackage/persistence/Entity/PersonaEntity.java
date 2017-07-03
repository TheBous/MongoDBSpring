package myPackage.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;



@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Document(collection = "persona")
public class PersonaEntity {

    @Id
    @Field
    private ObjectId _id;

    @Field
    @Indexed(unique = true)
    private String name;

    @Field
    @Indexed(unique = true)
    private String surname;
}



