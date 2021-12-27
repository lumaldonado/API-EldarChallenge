package ar.com.eldar.challenge.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cardholder")
public class Holder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "holder_id")
    private Integer id;

    private String nombre;
    private String dni;
}
