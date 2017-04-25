/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class GENERICODAOImpl<T, ID extends Serializable> implements GENERICODAO<T, ID> {
    
    //SessionFactory sessionFactory;
    EntityManager entityManager = getEntityManager();
    EntityTransaction transaction = entityManager.getTransaction();
  
        private final static Logger LOGGER = Logger.getLogger(GENERICODAOImpl.class.getName());

    @Override
    public T crear() {
        try{
             entityManager = getEntityManager();
             transaction = entityManager.getTransaction();
//            transaction.
           }catch(Exception e) {
               System.out.println("Error al obtener el EntityManager");
           }
    }

    @Override
    public void insertar(T entity) {
        transaction.begin();
        
    }
    
     public EntityManager getEntityManager() {
        //Crear el gestor de persistencia EM
        //EntityManagerFactory emf = Persistence.createEntityManagerFactory("EXTERNA");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("INTERNA");
        EntityManager em = emf.createEntityManager();
        return em;
    }

    @Override
    public void actualizar(T entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T get(ID id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(ID id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<T> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
