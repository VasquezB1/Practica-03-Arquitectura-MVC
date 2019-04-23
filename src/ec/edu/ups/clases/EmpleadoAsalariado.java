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
 * ----------Class Hija 2 de Empleados----------
 * 
 */
public final class EmpleadoAsalariado extends Empleados implements Interface {
////////////////////////////////////////////////////////////////////////////////
    ///////////////////Declaracion de Variables

    private int horasTrabajo;
    private int codigo;
    private double salario;
    private String telefono;
///////////////////////////////////
  
///////////////////////////////////////////
   
    public EmpleadoAsalariado() {
      
    }

////////////////////////////////////////////////////////////////////////////////
    //Constructor
    
    public EmpleadoAsalariado(String empresa, double sueldoExtra, Date fechaContratacion, Date vacaciones, String nombre, String cedula, int edad, String genero) {
        super(empresa, sueldoExtra, fechaContratacion, vacaciones, nombre, cedula, edad, genero);
    }

    public EmpleadoAsalariado(int horasTrabajo, int codigo, double salario, String empresa, double sueldoExtra, Date fechaContratacion, Date vacaciones, String nombre, String cedula, int edad, String genero) {
        super(empresa, sueldoExtra, fechaContratacion, vacaciones, nombre, cedula, edad, genero);
        this.horasTrabajo = horasTrabajo;
        this.codigo = codigo;
        this.salario = salario;
    }

    public EmpleadoAsalariado(int horasTrabajo, int codigo, double salario) {
        this.horasTrabajo = horasTrabajo;
        this.codigo = codigo;
        this.salario = salario;

    }

////////////////////////////////////////////////////////////////////////////////
    //Get and Set       
    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

/////////////////////////////////////////////////////////////////////////////////
    //Interface
    @Override
    public String comer() {
        return "\tEmpleado " + this.getNombre() + " está comiendo";
    }

    @Override
    public String descansar() {
        return "\tEmpleado " + this.getNombre() + " está descansando";
    }

    @Override
    public String dormir() {
        return "\tEmpleado " + this.getNombre() + " está durmiendo";
    }

    public String verTelevision() {
        return "\tEmpleado " + super.getNombre() + " está respondiendo mensajes";
    }

    public String verCelular() {
        return "\tEmpleado " + super.getNombre() + " está viendo su celular.";
    }

    public String viajar() {
        return "\tEmpleado " + super.getNombre() + " esta viajando";
    }
    
/////////////////////////////////////////////////////////////////////////////////
    //To String

    @Override
    public String toString() {
        return super.toString() + "\nEmpleadoAsalariado:\n{" + "horasTrabajo=" + horasTrabajo + ", codigo=" + codigo + ", salario=" + salario + '}';
    }    
    
}
