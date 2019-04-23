/*
 * 
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Interface;

/**
 * 
 * @author Byron PC
 * @since 12-April-2019
 * @version IDE 8.2
 * ----------Class Hija 4 de Profesor----------
 */
public final class ProfesorSustituto extends Profesor implements Interface {
////////////////////////////////////////////////////////////////////////////////
    ///////////////////Declaracion de Variables    
    private int horasSustituto;
    private String experiencia;
    private int cursoSustituto;
    private double sueldo;
  
////////////////////////////////////////////////////////////////////////////////
    //Constructor
    public ProfesorSustituto(){
        
    }

    public ProfesorSustituto(int horasSustituto, String experiencia, int cursoSustituto, double sueldo, String materia, String colegio, String turno) {
        super(materia, colegio, turno);
        this.horasSustituto = horasSustituto;
        this.experiencia = experiencia;
        this.cursoSustituto = cursoSustituto;
        this.sueldo = sueldo;
    }
    

////////////////////////////////////////////////////////////////////////////////
    //Get and Set
    public int getHorasSustituto() {
        return horasSustituto;
    }

    public void setHorasSustituto(int horasSustituto) {
        this.horasSustituto = horasSustituto;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

 
    public int getCursoSustituto() {
        return cursoSustituto;
    }

    public void setCursoSustituto(int cursoSustituto) {
        this.cursoSustituto = cursoSustituto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
/////////////////////////////////////////////////////////////////////////////////
    //Interface
    @Override
    public String comer() {
       return "\tLa maestra sustituta " + this.getNombre() + " está comiendo";
    }

    @Override
    public String descansar() {
        return "\tLa maestra sustituta " + this.getNombre() + " está descansando";
    }

    @Override
    public String dormir() {
        return "\tLa maestra sustituta " + this.getNombre() + " está durmiendo";
    }
     public String trabajar() {
        return "\tLa maestra sustituta " + this.getNombre() + " está trabajando";
    }
      public String moverse(){
        return "\tLa maestra sustituta " + this.getNombre() + " está moviéndose";
    }
      public String divertirse(){
        return "\tLa maestra sustituta " + super.getNombre() + " está escribiendo algo.";
    }
        
/////////////////////////////////////////////////////////////////////////////////
    //To String

    @Override
    public String toString() {
        return super.toString() + "\nProfesorSustituto:\n[" + "horasSustituto=" + horasSustituto + ", experiencia=" + experiencia + ", cursoSustituto=" + cursoSustituto + ", sueldo=" + sueldo + '}';
    }
////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public String responderMensajes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  

    
}


