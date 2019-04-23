


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.ProfesorSustituto;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Byron PC
 */
public class ControladorProfesorSustituto {
    
    private SortedSet<ProfesorSustituto> lista;
    private int codigo;
    
    public ControladorProfesorSustituto(){
        lista= new TreeSet<>(); 
        codigo=1;
    }
    
    public void create(ProfesorSustituto obj){
        codigo++;
        obj.setCodigo(codigo);
        lista.add(obj);
    }
    
    public  ProfesorSustituto read (int codigo){
        for (ProfesorSustituto profesorSustituto : lista) {
            if(profesorSustituto.getCodigo()== codigo){
                return profesorSustituto;
            }
        }
       return null;         
        }
    
    public void update(ProfesorSustituto obj){
        if(lista.contains(obj)){
            lista.remove(obj);
            lista.add(obj);
        } 
    }
    
    public void delete(ProfesorSustituto obj){
        for (ProfesorSustituto profesorSustituto : lista) {            
            if(obj.getCodigo() == codigo){
                lista.remove(obj);
                break;
            }            
        }      
    }
    
    public ProfesorSustituto imprimir(ProfesorSustituto obj){
        System.out.println("\t Lista Ordenada");
        for (ProfesorSustituto profesorSustituto : lista) {
            System.out.println(profesorSustituto);            
        }            
        return null;        
    }
    
    

}
