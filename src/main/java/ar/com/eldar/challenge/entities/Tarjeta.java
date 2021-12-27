package ar.com.eldar.challenge.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tarjeta")
public class Tarjeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tarjeta_id")
    private Integer id;

    @Column(name = "numero")
    private String numeroTarjeta;

    @Column(name = "fecha_vencimiento")
    private Date fechaVencimiento;

    @Column(name = "marca_id")
    private Integer marcaId;

    @Column(name = "holder_id")
    private Holder holderId;
    
}
