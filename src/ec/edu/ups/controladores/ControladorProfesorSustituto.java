package ec.edu.ups.controladores;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ec.edu.ups.clases.ProfesorSustituto;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
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
    
    public void delete(int codigo){
        for (ProfesorSustituto obj : lista) {            
            if(obj.getCodigo() == codigo){
                lista.remove(obj);
                break;
            }            
        }      
    }
    
    public ProfesorSustituto imprimir(){
        System.out.println("\t Lista Ordenada");
        for (ProfesorSustituto profesorSustituto : lista) {
            System.out.println(profesorSustituto.getNombre());            
        }            
        return null;        
    }
    
    

}
