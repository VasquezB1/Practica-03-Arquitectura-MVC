


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.ProfesorSustituto;
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
        codigo=0;
    }
    
    public void create(ProfesorSustituto objeto){
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
    
    public  ProfesorSustituto read (int codigo){
        for (ProfesorSustituto profesorSustituto : lista) {
            if(profesorSustituto.getCodigo()== codigo){
                return profesorSustituto;
            }
        }
       return null;         
        }
    
    public void update(ProfesorSustituto objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        } 
    }
    
    public void delete(int codigo){
        for (ProfesorSustituto objeto : lista) {            
            if(objeto.getCodigo() == codigo){
                lista.remove(objeto);
                break;
            }            
        }      
    }
    
    public void imprimir(){
        System.out.println("\t Lista Ordenada");
        for (ProfesorSustituto profesorSustituto : lista) {
            System.out.println(profesorSustituto.getNombre());            
        }            
    }
    
    

}
