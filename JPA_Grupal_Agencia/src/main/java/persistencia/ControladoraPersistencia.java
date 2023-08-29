/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;
 
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Agencia;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author EUNICE-ASUS
 */
public class ControladoraPersistencia {
    AgenciaJpaController agenciaJPA = new AgenciaJpaController();
 

        public void crearAgencia(Agencia age){
            agenciaJPA.create(age);
        }

    public List<Agencia> getAgencias() {
      
        return agenciaJPA.findAgenciaEntities();
        
    }

    public void borrarAgencia(int id) {
        
        try {
            agenciaJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Agencia traerAgencia(int id) {
         return agenciaJPA.findAgencia(id);
    }

    public void editarAgencia(Agencia age) {
        try {
            agenciaJPA.edit(age);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void detalleAgencia(Agencia age) {
        try {
            agenciaJPA.edit(age);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
