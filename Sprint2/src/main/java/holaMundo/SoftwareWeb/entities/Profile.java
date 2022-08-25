package Sprint2.src.main.java.holaMundo.SoftwareWeb.entities;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Data
@Entity
@Table(name= "Profile")
public class Profile {
    @Id
    private long ID;
    private String picture;
    private String phone;

    public Profile(long ID, String picture, String phone) {
        this.ID = ID;
        this.picture = picture;
        this.phone = phone;
    }


}
