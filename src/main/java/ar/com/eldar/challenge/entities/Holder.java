package ar.com.eldar.challenge.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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

    @OneToMany(mappedBy = "operacion", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Operacion> operaciones = new ArrayList<>();
    
    @OneToMany(mappedBy = "tarjeta", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Tarjeta> tarjetas = new ArrayList<>();


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void agregarHolder(Operacion operacion) {
        this.operaciones.add(operacion);
    }

    public void agregarTarjeta(Tarjeta tarjeta){
        this. tarjetas.add(tarjeta);
    }

    


}
