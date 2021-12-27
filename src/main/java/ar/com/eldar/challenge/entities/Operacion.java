package ar.com.eldar.challenge.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "operacion")
public class Operacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "operacion_id")
    private Integer id;

    @Column(name = "holder_id")
    private Holder holderId;

    private Integer monto;
    
    @Column(name = "tasa_operacion")
    private String tasaOperacion;


}
