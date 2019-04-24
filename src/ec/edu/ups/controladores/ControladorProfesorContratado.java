/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.ProfesorContratado;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Byron PC
 */
public class ControladorProfesorContratado {
    private Map<Integer, ProfesorContratado>lista;
    private int codigo;
    
    public ControladorProfesorContratado(){
        lista= new TreeMap<>();
        codigo=0;
    }
    
    public void create(ProfesorContratado objeto){
        codigo++;
        objeto.setCodigo(codigo);
        lista.put(codigo, objeto);
    }
    
    public ProfesorContratado read(int codigo){
        if(lista.get(codigo)!= null){
            return lista.get(codigo);
        }
        return null;
    }
    
    public void update (ProfesorContratado objeto){
        lista.put(objeto.getCodigo(), objeto);
    }
    
    public void delete(int codigo){
        lista.remove(codigo);
    }
    
    public void imprimir(){
       for (Map.Entry<Integer, ProfesorContratado> elemento : lista.entrySet()) {
            int key = elemento.getKey();
            String nomBallena = elemento.getValue().getNombre();
            System.out.println("Key: " + key + " Nombre Profesor Contratado: " + nomBallena);
        }
    }
    
}
