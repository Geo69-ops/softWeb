package Sprint2.src.main.java.holaMundo.SoftwareWeb.entities;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.ArrayList;

@Getter
@Setter
@Data
@Entity
@Table(name="Employees")
public class Employees {
    @Id
    private long ID;
    Profile profile;
    Enterprises enterprises_employee;
    private ArrayList<Transaction> transactions_Enterprises;

    public Employees(long ID, String name, String email, Profile profile, Enterprises enterprises_employee, ArrayList<Transaction> transactions_Enterprises) {
        this.ID = ID;
        this.profile = profile;
        this.enterprises_employee = enterprises_employee;
        this.transactions_Enterprises = transactions_Enterprises;
    }
}
