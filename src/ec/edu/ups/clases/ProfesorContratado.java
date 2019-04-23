/*
 *
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Interface;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Byron PC
 * @since 12-April-2019
 * @version IDE 8.2
 * ----------Class Hija 3 de Profesor----------
 */

public final class ProfesorContratado extends Profesor implements Interface {
////////////////////////////////////////////////////////////////////////////////
    ///////////////////Declaracion de Variables     

    private Date fechaContratacion;
    private int horasContratado;
    private Date evaluaciones;
    private int cursoACargo;
    
////////////////////////////////////////////////////////////////////////////////
    //Constructor
     public ProfesorContratado() {
    }

    public ProfesorContratado(Date fechaContratacion, int horasContratado, Date evaluaciones, int cursoACargo, String materia, String colegio, String turno) {
        super(materia, colegio, turno);
        this.fechaContratacion = fechaContratacion;
        this.horasContratado = horasContratado;
        this.evaluaciones = evaluaciones;
        this.cursoACargo = cursoACargo;
    }

    

 
////////////////////////////////////////////////////////////////////////////////
    //Get and Set   

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public int getHorasContratado() {
        return horasContratado;
    }

    public void setHorasContratado(int horasContratado) {
        this.horasContratado = horasContratado;
    }

    public Date getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones(Date evaluaciones) {
        this.evaluaciones = evaluaciones;
    }

    public int getCursoACargo() {
        return cursoACargo;
    }

    public void setCursoACargo(int cursoACargo) {
        this.cursoACargo = cursoACargo;
    }

/////////////////////////////////////////////////////////////////////////////////
    //Interface

    @Override
    public String comer() {
        return "\tEl profesor " + this.getNombre() + " está comiendo";
    }

    @Override
    public String descansar() {
        return "\tEl profesor" + this.getNombre() + " está descansando";
    }

    @Override
    public String dormir() {
        return "\tEl profesor " + this.getNombre() + " está durmiendo";
    }

    public String exponer() {
        return "\tEl profesor " + super.getNombre() + " está exponiendo";
    }

    public String vestirse() {
        return "\tEl profesor " + super.getNombre() + " está vistiendose";
    }

    public String caminar() {
        return "\tEl profesor " + super.getNombre() + " está caminando";
    }
 
/////////////////////////////////////////////////////////////////////////////////
    //To String

    @Override
    public String toString() {
        return "ProfesorContratado{" + "fechaContratacion=" + fechaContratacion + ", horasContratado=" + horasContratado + ", evaluaciones=" + evaluaciones + ", cursoACargo=" + cursoACargo + '}';
    }

     

    @Override
    public String responderMensajes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
