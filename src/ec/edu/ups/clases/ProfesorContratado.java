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

    private int horasTrabajadas;
    private int horasContratado;
    private int diascontratados;
    private int cursoACargo;
    
////////////////////////////////////////////////////////////////////////////////
    //Constructor
     public ProfesorContratado() {
    }

    public ProfesorContratado(int horasTrabajadas, int horasContratado, int diascontratados, int cursoACargo, String materia, String colegio, String turno) {
        super(materia, colegio, turno);
        this.horasTrabajadas = horasTrabajadas;
        this.horasContratado = horasContratado;
        this.diascontratados = diascontratados;
        this.cursoACargo = cursoACargo;
    }

    public int getHorasTrabajadas() {   
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {    
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasContratado() {
        return horasContratado;
    }

    public void setHorasContratado(int horasContratado) {    
        this.horasContratado = horasContratado;
    }

    public int getDiascontratados() {
        return diascontratados;
    }

    public void setDiascontratados(int diascontratados) {
        this.diascontratados = diascontratados;
    }

    public int getCursoACargo() {
        return cursoACargo;
    }

////////////////////////////////////////////////////////////////////////////////
    //Get and Set
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
        return super.toString()+"\nProfesorContratado{\n" + "horasTrabajadas=" + horasTrabajadas + ", horasContratado=" + horasContratado + ", diascontratados=" + diascontratados + ", cursoACargo=" + cursoACargo + '}';
    }


     

    @Override
    public String responderMensajes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
