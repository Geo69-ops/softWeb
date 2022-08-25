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
@Table(name = "Enterprises")
public class Enterprises {
    @Id
    private long ID;
    private String name;
    private String nit;
    private int phone;
    private String address;
    private ArrayList<Employees> Employees_Enterprises;
    private ArrayList<Transaction> transactions_Enterprises;

    public Enterprises(long ID, String name, String nit, int phone, String address, ArrayList<Employees> employees_Enterprises, ArrayList<Transaction> transactions_Enterprises) {
        this.ID = ID;
        this.name = name;
        this.nit = nit;
        this.phone = phone;
        this.address = address;
        Employees_Enterprises = employees_Enterprises;
        this.transactions_Enterprises = transactions_Enterprises;
    }

}
