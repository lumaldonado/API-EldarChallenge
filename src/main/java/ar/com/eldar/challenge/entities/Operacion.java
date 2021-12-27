package ar.com.eldar.challenge.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "operacion")
public class Operacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "operacion_id")
    private Integer id;

    @ManyToOne 
    @JoinColumn(name = "holder_id", referencedColumnName = "holder_id")
    private Holder holderId;

    private Integer monto;

    @Column(name = "tasa_operacion")
    private String tasaOperacion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Holder getHolderId() {
        return holderId;
    }

    public void setHolderId(Holder holderId) {
        this.holderId = holderId;
        this.holderId.agregarHolder(this);
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    public String getTasaOperacion() {
        return tasaOperacion;
    }

    public void setTasaOperacion(String tasaOperacion) {
        this.tasaOperacion = tasaOperacion;
    }

    


}
