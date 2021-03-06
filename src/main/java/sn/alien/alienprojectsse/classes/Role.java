package sn.alien.alienprojectsse.classes;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
public class Role implements Serializable {


    @Id
    private String role;

    private String description;


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Role(String role, String description) {
        this.role = role;
        this.description = description;
    }

    public Role() {
    }
}
