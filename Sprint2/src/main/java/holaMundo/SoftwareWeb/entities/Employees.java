package Sprint2.src.main.java.holaMundo.SoftwareWeb.entities;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
@Getter
@Setter
@Data
@Entity
@Table(name="Employees")
public class Employees {
    @Id
    private long ID;
    private String name;
    private String email;
    Profile profile;
    Enum_role role;
    Enterprises enterprises_employee;

    public Employees(long ID, String name, String email, Profile profile, Enum_role role, Enterprises enterprises_employee) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.profile = profile;
        this.role = role;
        this.enterprises_employee = enterprises_employee;
    }

}
