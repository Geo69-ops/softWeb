package Sprint2.src.main.java.holaMundo.SoftwareWeb.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Entity
@Table ( name = "Transactions")
public class Transaction {
    @Id
    private long ID;
    private Double amount;
    private String description;
    Employees employee;
    private Date dateCreated;

    public Transaction(long ID, Double amount, String description, Employees employee, Date dateCreated) {
        this.ID = ID;
        this.amount = amount;
        this.description = description;
        this.employee = employee;
        this.dateCreated = dateCreated;
    }
}
