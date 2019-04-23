/*
 * 
 */
package ec.edu.ups.clases;

import java.util.Objects;

/**
 *
 * @author Byron PC
 * @since 12-April-2019
 * @version IDE 8.2
 * ----------Class Abuelo----------
 */
public class Persona {
////////////////////////////////////////////////////////////////////////////////
    ///////////////////Declaracion de Variables    
    private String nombre;
    private String cedula;
    private int edad;
    private String genero;
    private int codigo;

    public Persona() {

    }
////////////////////////////////////////////////////////////////////////////////
    //Constructor

    public Persona(String nombre, String cedula, int edad, String genero) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.genero = genero;
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCodigo() {
        return codigo;
    }

////////////////////////////////////////////////////////////////////////////////
    //Get and Set    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

/////////////////////////////////////////////////////////////////////////////////
    //Interface
    public String comer() {
        return "La persona " + this.getNombre() + " está comiendo";
    }

    public String descansar() {
        return "La persona " + this.getNombre() + " está descansando";
    }

    public String dormir() {
        return "La persona " + this.getNombre() + " está durmiendo";
    }

/////////////////////////////////////////////////////////////////////////////////
    //To String

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", cedula=" + cedula + ", edad=" + edad + ", genero=" + genero + ", codigo=" + codigo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash=37*hash+this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
    

    
    
    
    
    
}
