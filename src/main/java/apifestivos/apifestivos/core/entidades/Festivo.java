package apifestivos.apifestivos.core.entidades;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="festivo")
public class Festivo {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_tipo")
    @GenericGenerator(name = "secuencia_tipo", strategy = "increment")
    private int id;

    @Column(name="nombre", length = 100, unique = true) 
    private String nombre;

    @Column(name="dia")
    private int dia;

    @Column(name="mes")
    private int mes;
    
    @Column(name="diapascua")
    private int diapascua;
    
    @Column(name="idtipo")
    private int idtipo;

    public Festivo() {
    }

    public Festivo(int id, String nombre, int dia, int mes, int diapascua, int idtipo) {
        this.id = id;
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.diapascua = diapascua;
        this.idtipo = idtipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDiapascua() {
        return diapascua;
    }

    public void setDiapascua(int diapascua) {
        this.diapascua = diapascua;
    }

    public int getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(int idtipo) {
        this.idtipo = idtipo;
    }
}
