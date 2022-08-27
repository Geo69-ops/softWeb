package Sprint2.src.main.java.holaMundo.SoftwareWeb.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
@Data
@Entity
@Table(name = "Enterprises")
public class Enterprises {
    @Id
    private long ID;
    private String name;
    private String nit;
    private int phone;
    private String address;
    private ArrayList<Employees> employees_Enterprises;
    private Date created_Date;

    public Enterprises(long ID, String name, String nit, int phone, String address, ArrayList<Employees> employees_Enterprises, Date created_Date) {
        this.ID = ID;
        this.name = name;
        this.nit = nit;
        this.phone = phone;
        this.address = address;
        this.employees_Enterprises = employees_Enterprises;
        this.created_Date = created_Date;
    }
}
