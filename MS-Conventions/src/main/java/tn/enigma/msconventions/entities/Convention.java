package tn.enigma.msconventions.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Data
@Entity
public class Convention {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String etat;
    private String project_name;
    private Date startDate;
    private Date endDate;
    private float paymentAmount;
    private boolean isDeleted;
    private String pdf;
}
