/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;


import ec.edu.ups.clases.Taxista;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Byron PC
 */
public class ControladorTaxista {
    
   private HashSet<Taxista> lista;
   private int codigo;
       
    public ControladorTaxista(){
        lista = new HashSet<>();
        codigo=0;
    }
    
    public void create(Taxista obj){
        codigo++;
        obj.setCodigo(codigo);
        lista.add(obj);
    }
    
    public Taxista read (int codigo){
        for (Taxista taxista : lista) {
            if(taxista.getCodigo()== codigo){
                return taxista;
            }
        }
       return null;         
        }
    
    public Taxista update(Taxista obj){
        if(lista.contains(obj)){
            lista.remove(obj);
            lista.add(obj);
        } 
       return null;        
    }
    
    public void delete(int codigo){
        for (Taxista taxi : lista) {            
            if(taxi.getCodigo() == codigo){
                lista.remove(taxi);
                break;
            }
            
        }
    }
    
    public void imprimir(){
        for(Taxista taxi: lista){
            System.out.println(taxi.getNombre());
        }
    }
}

    
    
