/*
 * 
 */
package ec.edu.ups.clases;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Byron PC
 * @since 12-April-2019
 * @version IDE 8.2 
 * ----------Class Padre * 1----------
 */
public abstract class Empleados extends Persona {
////////////////////////////////////////////////////////////////////////////////
    ///////////////////Declaracion de Variables    

    private String empresa;
    private double sueldoExtra;
    private Date fechaContratacion;
    private Date vacaciones;

    public Empleados() {

    }
////////////////////////////////////////////////////////////////////////////////
    //Constructor

    public Empleados(String empresa, double sueldoExtra, Date fechaContratacion, Date vacaciones, String nombre, String cedula, int edad, String genero) {
        super(nombre, cedula, edad, genero);
        this.empresa = empresa;
        this.sueldoExtra = sueldoExtra;
        this.fechaContratacion = fechaContratacion;
        this.vacaciones = vacaciones;
    }

////////////////////////////////////////////////////////////////////////////////
    //Get and Set   
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public double getSueldoExtra() {
        return sueldoExtra;
    }

    public void setSueldoExtra(double sueldoExtra) {
        this.sueldoExtra = sueldoExtra;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public Date getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(Date vacaciones) {
        this.vacaciones = vacaciones;
    }
/////////////////////////////////////////////////////////////////////////////////
    //Interface

    public String Descanso() {
        return "Los Empleados " + super.getNombre() + " tienen descanso";
    }

    public String Almuerzo() {
        return "Los Empleados " + super.getNombre() + " estan en el almuerzo";
    }

    public String Turno() {
        return "Los Empleados " + super.getNombre() + " estan cambiando de turno";
    }

    @Override
    public String comer() {
        return "La persona " + this.getNombre() + " está comiendo";
    }

    @Override
    public String descansar() {
        return "La persona " + this.getNombre() + " está descansando";
    }

    @Override
    public String dormir() {
        return "La persona " + this.getNombre() + " está durmiendo";
    }
/////////////////////////////////////////////////////////////////////////////////    
    /**
     * verTelevision metodo abstracto
     * @return texto
     */
    public abstract String verTelevision();
/////////////////////////////////////////////////////////////////////////////////
    //To String

    @Override
    public String toString() {
        SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return super.toString() + "\nEmpleados:\n{" + "empresa=" + empresa + ", sueldo=" + sueldoExtra + ", fechaContratacion= " + formato.format(fechaContratacion.getTime()) + ", vacaciones= " + formato2.format(vacaciones.getTime()) + '}';
    }
}
