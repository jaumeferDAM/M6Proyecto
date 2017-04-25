
package Controlador;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class Alumne_Controlador extends GENERICODAOImpl<Object, Serializable>{

     EM_Controller oem = new EM_Controller();
        EntityManager em;
        EntityTransaction etx = em.getTransaction();
    public Alumne_Controlador() {
        em = (EntityManager) crear();
    }

    @Override
    public Object crear() {
        return super.crear(); //To change body of generated methods, choose Tools | Templates.
    }


    
    @Override
    public void insertar(Object entity) {
        System.out.println("begin");
        em.begin();

        System.out.println("merge");
        em.merge(c);

        System.out.println("commit");
        //em.getTransaction().commit();
        etx.commit();

        System.out.println("close");
        em.close();
    }

    @Override
    public void actualizar(Object entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object get(Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Object> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
