/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author EUNICE-ASUS
 */

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Agencia implements Serializable {
    
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;
    private String descripcion;
    private String direccion;
    private String telefono;
    private String horainicio; 
    private String horafin;
    private String foto;

    public Agencia() {
    }

    public Agencia(int id, String descripcion, String direccion, String telefono, String horainicio, String horafin, String foto) {
     
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.horainicio = horainicio;
        this.horafin = horafin;
        this.foto = foto;
    }

    public int getId() {
       return id;
    }
 
     public void setId(int id) {
         this.id = id;
   }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(String horainicio) {
        this.horainicio = horainicio;
    }

    public String getHorafin() {
        return horafin;
    }

    public void setHorafin(String horafin) {
        this.horafin = horafin;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    
     
}
