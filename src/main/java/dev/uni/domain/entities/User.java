package dev.uni.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "users")
public class User {

    @Id
    private int id;
    private String name;
    private String lastName;
    private String username;
    private String email;
    private String password;

}
