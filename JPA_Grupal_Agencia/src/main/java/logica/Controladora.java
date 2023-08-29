/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
import java.util.ArrayList;
import java.util.List;
import persistencia.ControladoraPersistencia;
/**
 *
 * @author EUNICE-ASUS
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
//    public void crearAgencia(String descripcion, String direccion, String telefono, String horainicio, String horafin, String foto){
//        Agencia age = new Agencia(descripcion, direccion, telefono, horainicio,horafin, foto);
//        controlPersis.crearAgencia(age);
//    }
//    
    
//        public void crearAgencia(int id,String descripcion, String direccion, String telefono, String horainicio, String horafin, String foto){
//        
//        Agencia age = new Agencia(descripcion);
//        age.setId(id);
//        age.setDescripcion(descripcion);
//        age.setDireccion(direccion);
//        age.setTelefono(telefono);
//        age.setHorainicio(horainicio);
//        age.setHorafin(horainicio);
//        age.setFoto(foto);
//    }
    
            public void crearAgencia(String descripcion,String direccion, String telefono,String horainicio,String horafin, String foto){
        
        Agencia age = new Agencia();
   
        age.setDescripcion(descripcion);
        age.setDireccion(direccion);
        age.setTelefono(telefono);
        age.setHorainicio(horainicio);
        age.setHorafin(horainicio);
        age.setFoto(foto);
        controlPersis.crearAgencia(age);
    }

    public List<Agencia> getAgencias() {
       return controlPersis.getAgencias();
    }

    public void borrarAgencia(int id) {
       controlPersis.borrarAgencia(id);
    }

    public Agencia traerAgencia(int id) {
         return controlPersis.traerAgencia(id);
    }

    public void editarAgencia(Agencia age) {
         controlPersis.editarAgencia(age);
    }

    public void detalleAgencia(Agencia age) {
        controlPersis.detalleAgencia(age);
    }

 
    
    
}
