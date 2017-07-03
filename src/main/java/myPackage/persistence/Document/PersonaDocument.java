package myPackage.persistence.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;



@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Document
public class PersonaDocument {

    @Id
    @Field
    private Integer _id;

    @Field
    @Indexed(unique = true)
    private String name;

    @Field
    @Indexed(unique = true)
    private String surname;
}



