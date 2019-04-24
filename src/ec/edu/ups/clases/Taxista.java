/*
 * 
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Interface;

import java.util.Date;


/**
 *
 * @author Byron PC
 * @since 12-April-2019
 * @version IDE 8.2 
 * ----------Class Hija 1 de Empleados----------
 */

public final class Taxista extends Empleados implements Interface {
////////////////////////////////////////////////////////////////////////////////
    ///////////////////Declaracion de Variables    
   
    private int numeroAuto;
       private String turno;
    private String telefono;
    public Taxista() {
    }
////////////////////////////////////////////////////////////////////////////////
    //Constructor

    public Taxista(int numeroAuto, String turno, String telefono, String empresa, double sueldoExtra, Date fechaContratacion, Date vacaciones, String nombre, String cedula, int edad, String genero) {
        super(empresa, sueldoExtra, fechaContratacion, vacaciones, nombre, cedula, edad, genero);
        this.numeroAuto = numeroAuto;
        this.turno = turno;
        this.telefono = telefono;
    }
    
////////////////////////////////////////////////////////////////////////////////
    //Get and Set   
    public int getNumeroAuto() {
        return numeroAuto;
    }

    public void setNumeroAuto(int numeroAuto) {
        this.numeroAuto = numeroAuto;
    }

  

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
/////////////////////////////////////////////////////////////////////////////////
    //Interface

    @Override
    public String comer() {
        return "\tEl taxista " + this.getNombre() + " está comiendo";
    }

    @Override
    public String descansar() {
        return "\tEl taxista " + this.getNombre() + " está descansando";
    }

    @Override
    public String dormir() {
        return "\tEl taxista " + this.getNombre() + " está durmiendo";
    }

    public String trabajar() {
        return "\tEl taxista " + this.getNombre() + " está trabajando";
    }

    public String contestar() {
        return "\tEl taxista " + this.getNombre() + " está contestando llamadas";
    }

    public String verWhatsapp() {
        return "\tEl taxista " + this.getNombre() + " está conversando por Whatsapp";
    }
/////////////////////////////////////////////////////////////////////////////////
    //To String

    @Override
    public String toString() {
        return super.toString()+"Taxista{" + "numeroAuto=" + numeroAuto + ", turno=" + turno + ", telefono=" + telefono + '}';
    }

    

    @Override
    public String verTelevision() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
