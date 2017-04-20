/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ALUMNEDAM
 * @param <T>
 * @param <ID>
 */
 public interface GENERICODAO<T,ID extends Serializable> {
     T crear();
     void insertar(T entity);
     void actualizar(T entity);
     T get(ID id);
     void eliminar(ID id);
     ArrayList<T> listarTodos();
}
