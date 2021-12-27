package ar.com.eldar.challenge.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

    @ManyToOne
    @JoinColumn(name = "holder_id", referencedColumnName = "holder_id")
    @Column(name = "holder_id")
    private Holder holder;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Integer getMarcaId() {
        return marcaId;
    }

    public void setMarcaId(Integer marcaId) {
        this.marcaId = marcaId;
    }

    public Holder getHolder() {
        return holder;
    }

    public void setHolderId(Holder holder) {
        this.holder = holder;
        this.holder.agregarTarjeta(this);
    }

    
    
}
