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

    public MarcaEnum getMarcaId() {
        return MarcaEnum.parse(this.marcaId);
    }

    public void setMarcaId(MarcaEnum marcaId) {
        this.marcaId = marcaId.getValue();
    }

    public Holder getHolder() {
        return holder;
    }

    public void setHolderId(Holder holder) {
        this.holder = holder;
        this.holder.agregarTarjeta(this);
    }

    public enum MarcaEnum {
        VISA(1), NARA(2), AMEX(3); 

        private final int value;

        // NOTE: Enum constructor tiene que estar en privado
        private MarcaEnum(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static MarcaEnum parse(int id) {
            MarcaEnum status = null; // Default
            for (MarcaEnum item : MarcaEnum.values()) {
                if (item.getValue() == id) {
                    status = item;
                    break;
                }
            }
            return status;
        }
    }

    
    
}
