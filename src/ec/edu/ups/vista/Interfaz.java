package ec.edu.ups.vista;

import ec.edu.ups.clases.EmpleadoAsalariado;
import ec.edu.ups.clases.ProfesorContratado;
import ec.edu.ups.clases.ProfesorSustituto;

import ec.edu.ups.clases.Taxista;
import ec.edu.ups.controladores.ControladorEmpleadoAsalariado;
import ec.edu.ups.controladores.ControladorProfesorContratado;
import ec.edu.ups.controladores.ControladorProfesorSustituto;


import ec.edu.ups.controladores.ControladorTaxista;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Byron PC
 */
public class Interfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ControladorEmpleadoAsalariado controladorEmpleadoAsalariado = new ControladorEmpleadoAsalariado();
        ControladorTaxista controladorTaxista = new ControladorTaxista();
        ControladorProfesorContratado controladorProfesorContratado = new ControladorProfesorContratado();
        ControladorProfesorSustituto controladorProfesorSustituto = new ControladorProfesorSustituto();
        
        Scanner n = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {
            System.out.println("\tMENÚ:");
            System.out.println("1.- CRUD  de Empleado Asalariado ---> ArrayList");
            System.out.println("2.- CRUD  de Taxista ---> HashSet");
            System.out.println("3.- CRUD  de Profesor Contratado ---> Map");
            System.out.println("4.- CRUD  de Profesor Sustituto ---> SortedSet");
            System.out.println("5.- Salir");
            System.out.println("Eliga una opcion:");
            opcion = n.nextInt();
            Scanner n3 = new Scanner(System.in);
            
            switch (opcion) {
                
                case 1:
                    System.out.println("Ha elegido CRUD de Empleado Asalariado");
                    Scanner n1 = new Scanner(System.in);
                    
                    boolean salir1 = false;
                    
                    int opcion1;
                    while (!salir1) {
                        System.out.println("\t CRUD EmpleadoAsalariado" + "\nElija una opcion");
                        System.out.println("1.- C: Create");
                        System.out.println("2.- R: Read");
                        System.out.println("3.- U: Update");
                        System.out.println("4.- D: Delete");
                        System.out.println("5.- Listar los elementos");
                        System.out.println("6.- -- Regresar --");
                        System.out.println("Eliga una opcion:");
                        opcion1 = n1.nextInt();
                        switch (opcion1) {
                            case 1:
                                EmpleadoAsalariado objeto = new EmpleadoAsalariado();
                                System.out.println("\t Create");
                                System.out.println("Ingrese su nombre");
                                String nombre = n3.next();
                                objeto.setNombre(nombre);
                                System.out.println("Ingrese su cedula");
                                String cedula = n3.next();
                                objeto.setCedula(cedula);
                                System.out.println("Ingrese su edad");
                                int edad = n3.nextInt();
                                objeto.setEdad(edad);
                                System.out.println("Ingrese la empresa");
                                String empresa = n3.next();
                                objeto.setEmpresa(empresa);
                                System.out.println("Ingrese horas de trabajo");
                                int hor = n3.nextInt();
                                objeto.setHorasTrabajo(hor);
                                System.out.println("Ingrese el sueldo extra");
                                double extra = n3.nextDouble();
                                objeto.setSueldoExtra(extra);
                                System.out.println("Ingrese su genero");
                                String gene = n3.next();
                                objeto.setGenero(gene);
                                System.out.println("Ingrese el salario");
                                double salario = n3.nextDouble();
                                objeto.setSalario(salario);
                                System.out.println("Ingresar su fecha de Contratacion");
                                Scanner sc = new Scanner(System.in);
                                String fecha = sc.nextLine();
                                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                                Date testDate = null;
                                String date = fecha;
                                try {
                                    testDate = df.parse(date);
                                    System.out.println("Usted fue contratado el: " + fecha);
                                } catch (Exception e) {
                                    System.out.println("invalid format");
                                }
                                objeto.setFechaContratacion(testDate);
                                
                                System.out.println("Ingrese la fecha de sus vacaciones");
                                Scanner sc2 = new Scanner(System.in);
                                String fech2a = sc2.nextLine();
                                SimpleDateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
                                Date testDate2 = null;
                                String date2 = fecha;
                                try {
                                    testDate2 = df.parse(date2);
                                    System.out.println("Usted tiene vacaciones el: " + fecha);
                                } catch (Exception e) {
                                    System.out.println("invalid format");
                                }
                                objeto.setVacaciones(testDate2);
                                
                                controladorEmpleadoAsalariado.create(objeto);
                                break;
                            case 2:
                                System.out.println("\t Read");
                                System.out.println("Ingrese el codigo a leer");
                                int codigoempleado = n3.nextInt();
                                System.out.println(controladorEmpleadoAsalariado.read(codigoempleado));
                                break;
                            case 3:
                                System.out.println("\t Update");
                                System.out.println("Ingrese el codigo a actualizar");
                                codigoempleado = n3.nextInt();
                                if (controladorEmpleadoAsalariado.read(codigoempleado) != null) {
                                    System.out.println("Ingrese su nombre");
                                    nombre = n3.next();
                                    
                                    System.out.println("Ingrese su cedula");
                                    cedula = n3.next();
                                    
                                    System.out.println("Ingrese su edad");
                                    edad = n3.nextInt();
                                    
                                    System.out.println("Ingrese la empresa");
                                    empresa = n3.next();
                                    
                                    System.out.println("Ingrese horas de trabajo");
                                    hor = n3.nextInt();
                                    
                                    System.out.println("Ingrese el sueldo extra");
                                    extra = n3.nextDouble();
                                    
                                    System.out.println("Ingrese su genero");
                                    gene = n3.next();
                                    
                                    System.out.println("Ingrese el salario");
                                    salario = n3.nextDouble();
                                    
                                    System.out.println("Ingresar su fecha de Contratacion");
                                    Scanner sc3 = new Scanner(System.in);
                                    String fecha3 = sc3.nextLine();
                                    SimpleDateFormat df3 = new SimpleDateFormat("dd/MM/yyyy");
                                    Date testDate3 = null;
                                    String date3 = fecha3;
                                    try {
                                        testDate = df3.parse(date3);
                                        System.out.println("Usted fue contratado el: " + fecha3);
                                    } catch (Exception e) {
                                        System.out.println("invalid format");
                                    }
                                    
                                    System.out.println("Ingrese la fecha de sus vacaciones");
                                    Scanner sc4 = new Scanner(System.in);
                                    String fecha4 = sc4.nextLine();
                                    SimpleDateFormat df4 = new SimpleDateFormat("dd/MM/yyyy");
                                    Date testDate4 = null;
                                    String date4 = fecha4;
                                    try {
                                        testDate2 = df4.parse(date4);
                                        System.out.println("Usted tiene vacaciones el: " + fecha4);
                                    } catch (Exception e) {
                                        System.out.println("invalid format");
                                    }
                                    objeto = new EmpleadoAsalariado();
                                    objeto.setCodigo(codigoempleado);
                                    controladorEmpleadoAsalariado.update(objeto);
                                } else {
                                    System.out.println("El Empleado no existe");
                                }
                                
                                break;
                            case 4:
                                System.out.println("\t Delete");
                                System.out.println("Ingrese el usuario a eliminar");
                                codigoempleado = n3.nextInt();
                                controladorEmpleadoAsalariado.delete(codigoempleado);
                                break;
                            case 5:
                                controladorEmpleadoAsalariado.imprimir();
                                break;
                            case 6:
                                salir1 = true;
                        }
                        
                    }
            }
            Scanner nuevo = new Scanner(System.in);
            switch (opcion) {
                case 2:
                    System.out.println("Ha elegido CRUD de Taxista");
                    Scanner n2 = new Scanner(System.in);
                    
                    int opcion1;
                    boolean salir1 = false;
                    while (!salir1) {
                        
                        System.out.println("\t CRUD Taxista" + "\nElija una opcion");
                        System.out.println("1.- C: Create");
                        System.out.println("2.- R: Read");
                        System.out.println("3.- U: Update");
                        System.out.println("4.- D: Delete");
                        System.out.println("5.- Listar los elementos");
                        System.out.println("6.- -- Regresar --");
                        System.out.println("Eliga una opcion:");
                        opcion1 = n2.nextInt();
                        switch (opcion1) {
                            case 1:
                                Taxista objeto = new Taxista();
                                
                                System.out.println("\t Create");
                                System.out.println("Ingrese su nombre");
                                String nombre = nuevo.next();
                                objeto.setNombre(nombre);
                                
                                System.out.println("Ingrese su cedula");
                                String cedula = nuevo.next();
                                objeto.setCedula(cedula);
                                System.out.println("Ingrese su edad");
                                int edad = nuevo.nextInt();
                                objeto.setEdad(edad);
                                System.out.println("Ingrese la empresa");
                                String empresa = nuevo.next();
                                objeto.setEmpresa(empresa);
                                System.out.println("Ingrese el sueldo extra");
                                double extra = nuevo.nextDouble();
                                objeto.setSueldoExtra(extra);
                                System.out.println("Ingrese su genero");
                                String gene = nuevo.next();
                                objeto.setGenero(gene);
                                System.out.println("Ingresar su fecha de Contratacion");
                                Scanner sc = new Scanner(System.in);
                                String fecha = sc.nextLine();
                                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                                Date testDate = null;
                                String date = fecha;
                                try {
                                    testDate = df.parse(date);
                                    System.out.println("Usted fue contratado el: " + fecha);
                                } catch (Exception e) {
                                    System.out.println("invalid format");
                                }
                                objeto.setFechaContratacion(testDate);
                                System.out.println("Ingrese la fecha de sus vacaciones");
                                Scanner sc2 = new Scanner(System.in);
                                String fech2a = sc2.nextLine();
                                SimpleDateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
                                Date testDate2 = null;
                                String date2 = fecha;
                                try {
                                    testDate2 = df.parse(date2);
                                    System.out.println("Usted tiene vacaciones el: " + fecha);
                                } catch (Exception e) {
                                    System.out.println("invalid format");
                                }
                                objeto.setVacaciones(testDate2);
                                System.out.println("Ingrese número de auto");
                                int num = n3.nextInt();
                                objeto.setNumeroAuto(num);
                                System.out.println("Ingrese el turno a recorrer");
                                String tur = n3.next();
                                objeto.setTurno(tur);
                                System.out.println("Ingrese el telefono");
                                String tel = n3.next();
                                objeto.setTelefono(tel);
                                controladorTaxista.create(objeto);
                                break;
                            case 2:
                                System.out.println("\t Read");
                                System.out.println("Ingrese el codigo a leer");
                                int codigota = n3.nextInt();
                                System.out.println(controladorTaxista.read(codigota));
                                break;
                            case 3:
                                System.out.println("\t Update");
                                System.out.println("Ingrese el codigo a actualizar");
                                int codigotax = n3.nextInt();
                                if (controladorTaxista.read(codigotax) != null) {
                                    objeto = new Taxista();
                                    System.out.println("Ingrese su nombre");
                                    String nombre2 = nuevo.next();
                                    objeto.setNombre(nombre2);
                                    
                                    System.out.println("Ingrese su cedula");
                                    String cedula2 = nuevo.next();
                                    objeto.setCedula(cedula2);
                                    System.out.println("Ingrese su edad");
                                    int edad2 = nuevo.nextInt();
                                    objeto.setEdad(edad2);
                                    System.out.println("Ingrese la empresa");
                                    String empresa2 = nuevo.next();
                                    objeto.setEmpresa(empresa2);
                                    System.out.println("Ingrese el sueldo extra");
                                    double extra2 = nuevo.nextDouble();
                                    objeto.setSueldoExtra(extra2);
                                    System.out.println("Ingrese su genero");
                                    String gene2 = nuevo.next();
                                    objeto.setGenero(gene2);
                                    System.out.println("Ingresar su fecha de Contratacion");
                                    Scanner sc8 = new Scanner(System.in);
                                    String fecha8 = sc8.nextLine();
                                    SimpleDateFormat df8 = new SimpleDateFormat("dd/MM/yyyy");
                                    Date testDate8 = null;
                                    String date8 = fecha8;
                                    try {
                                        testDate = df8.parse(date8);
                                        System.out.println("Usted fue contratado el: " + fecha8);
                                    } catch (Exception e) {
                                        System.out.println("invalid format");
                                    }
                                    objeto.setFechaContratacion(testDate8);
                                    System.out.println("Ingrese la fecha de sus vacaciones");
                                    Scanner sc9 = new Scanner(System.in);
                                    String fecha9 = sc9.nextLine();
                                    SimpleDateFormat df9 = new SimpleDateFormat("dd/MM/yyyy");
                                    Date testDate9 = null;
                                    String date9 = fecha9;
                                    try {
                                        testDate2 = df9.parse(date9);
                                        System.out.println("Usted tiene vacaciones el: " + fecha9);
                                    } catch (Exception e) {
                                        System.out.println("invalid format");
                                    }
                                    objeto.setVacaciones(testDate9);
                                    System.out.println("Ingrese número de auto");
                                    int num2 = n3.nextInt();
                                    objeto.setNumeroAuto(num2);
                                    System.out.println("Ingrese el turno a recorrer");
                                    String tur2 = n3.next();
                                    objeto.setTurno(tur2);
                                    System.out.println("Ingrese el telefono");
                                    String tel2 = n3.next();
                                    objeto.setTelefono(tel2);
                                    controladorTaxista.update(objeto);
                                } else {
                                    System.out.println("El Taxista no existe");
                                }
                                
                                break;
                            case 4:
                                System.out.println("\t Delete");
                                System.out.println("Ingrese el usuario a eliminar");
                                int codigonu = nuevo.nextInt();
                                controladorTaxista.delete(codigonu);
                                break;
                            case 5:
                                controladorTaxista.imprimir();
                                break;
                            case 6:
                                salir1 = true;

/////////////////////////////////////////////////////////////////////////////////////    
                        }
                        
                    }

/////////////////////////////////////////////////////////////////////////////////////    
            }
            Scanner nuevo2 = new Scanner(System.in);
            switch (opcion) {
                case 3:
                    System.out.println("Ha elegido CRUD de Profesor Contratado");
                    Scanner n2 = new Scanner(System.in);
                    
                    int opcion1;
                    boolean salir1 = false;
                    while (!salir1) {
                        
                        System.out.println("\t CRUD Profesor Contratado" + "\nElija una opcion");
                        System.out.println("1.- C: Create");
                        System.out.println("2.- R: Read");
                        System.out.println("3.- U: Update");
                        System.out.println("4.- D: Delete");
                        System.out.println("5.- Listar los elementos");
                        System.out.println("6.- -- Regresar --");
                        System.out.println("Eliga una opcion:");
                        opcion1 = n2.nextInt();
                        switch (opcion1) {
                            case 1:
                                ProfesorContratado objeto = new ProfesorContratado();
                                
                                System.out.println("\t Create");
                                System.out.println("Ingrese su nombre");
                                String nombre = nuevo2.next();
                                objeto.setNombre(nombre);
                                System.out.println("Ingrese su cedula");
                                String cedula = nuevo2.next();
                                objeto.setCedula(cedula);
                                System.out.println("Ingrese su edad");
                                int edad = nuevo2.nextInt();
                                objeto.setEdad(edad);
                                System.out.println("Ingrese su genero");
                                String gene = nuevo2.next();
                                objeto.setGenero(gene);
                                System.out.println("Ingresar su dias de Contratacion");
                                int contr = nuevo2.nextInt();
                                objeto.setDiascontratados(contr);
                                System.out.println("Ingrese horas contratadas");
                                int contra9 = nuevo2.nextInt();
                                objeto.setHorasTrabajadas(contra9);
                                System.out.println("Ingrese la Materia");
                                String mater = nuevo2.next();
                                objeto.setMateria(mater);
                                System.out.println("Ingrese el Colegio");
                                String coleg = nuevo2.next();
                                objeto.setColegio(coleg);
                                System.out.println("Ingrese el Turno");
                                String turno = nuevo2.next();
                                objeto.setTurno(turno);
                                controladorProfesorContratado.create(objeto);
                                break;
                            case 2:
                                System.out.println("\t Read");
                                System.out.println("Ingrese el codigo a leer");
                                int codigoprofe = nuevo.nextInt();
                                System.out.println(controladorProfesorContratado.read(codigoprofe));
                                break;
                            case 3:
                                System.out.println("\t Update");
                                System.out.println("Ingrese el codigo a actualizar");
                                int codigoprofenu = n3.nextInt();
                                if (controladorProfesorContratado.read(codigoprofenu) != null) {
                                    objeto = new ProfesorContratado();
                                    
                                    System.out.println("\t Create");
                                    System.out.println("Ingrese su nombre");
                                    String nombre2 = nuevo2.next();
                                    objeto.setNombre(nombre2);
                                    System.out.println("Ingrese su cedula");
                                    String cedula2 = nuevo2.next();
                                    objeto.setCedula(cedula2);
                                    System.out.println("Ingrese su edad");
                                    int edad2 = nuevo2.nextInt();
                                    objeto.setEdad(edad2);
                                    System.out.println("Ingrese su genero");
                                    String gene2 = nuevo2.next();
                                    objeto.setGenero(gene2);
                                    System.out.println("Ingresar su dias de Contratacion");
                                    int contr2 = nuevo2.nextInt();
                                    objeto.setDiascontratados(contr2);
                                    System.out.println("Ingrese horas contratadas");
                                    int contra10 = nuevo2.nextInt();
                                    objeto.setHorasTrabajadas(contra10);
                                    System.out.println("Ingrese la Materia");
                                    String mater2 = nuevo2.next();
                                    objeto.setMateria(mater2);
                                    System.out.println("Ingrese el Colegio");
                                    String coleg2 = nuevo2.next();
                                    objeto.setColegio(coleg2);
                                    System.out.println("Ingrese el Turno");
                                    String turno2 = nuevo2.next();
                                    objeto.setTurno(turno2);
                                    controladorProfesorContratado.update(objeto);
                                    
                                } else {
                                    System.out.println("El Profesor Contratado no existe");
                                }
                                break;
                            
                            case 4:
                                System.out.println("\t Delete");
                                System.out.println("Ingrese el usuario a eliminar");
                                int profecon = nuevo.nextInt();
                                controladorProfesorContratado.delete(profecon);
                                break;
                            case 5:
                                controladorProfesorContratado.imprimir();
                                break;
                            
                            case 6:
                                salir1 = true;

/////////////////////////////////////////////////////////////////////////////////////    
                        }
                        
                    }
                
            }
            Scanner nuevo3 = new Scanner(System.in);
            switch (opcion) {
                case 4:
                    System.out.println("Ha elegido CRUD de Profesor Sustituto");
                    Scanner n2 = new Scanner(System.in);
                    
                    int opcion1;
                    boolean salir1 = false;
                    while (!salir1) {
                        
                        System.out.println("\t CRUD Profesor Sustituto" + "\nElija una opcion");
                        System.out.println("1.- C: Create");
                        System.out.println("2.- R: Read");
                        System.out.println("3.- U: Update");
                        System.out.println("4.- D: Delete");
                        System.out.println("5.- Listar los elementos");
                        System.out.println("6.- -- Regresar --");
                        System.out.println("Eliga una opcion:");
                        opcion1 = n2.nextInt();
                        switch (opcion1) {
                            case 1:
                                ProfesorSustituto objeto = new ProfesorSustituto();
                                System.out.println("\t Create");
                                System.out.println("Ingrese su nombre");
                                String nombre = n3.next();
                                objeto.setNombre(nombre);
                                System.out.println("Ingrese su cedula");
                                String cedula = n3.next();
                                objeto.setCedula(cedula);
                                System.out.println("Ingrese su edad");
                                int edad = n3.nextInt();
                                objeto.setEdad(edad);
                                System.out.println("Tiene Experiencia ¿si o no?");
                                String ex = n3.next();
                                objeto.setExperiencia(ex);
                                System.out.println("Ingrese su genero");
                                String gene = n3.next();
                                objeto.setGenero(gene);
                                
                                System.out.println("Ingrese Horas Sustituto");
                                int sus = n3.nextInt();
                                objeto.setHorasSustituto(sus);
                                System.out.println("Curso a cargo");
                                int carg = n3.nextInt();
                                objeto.setCursoSustituto(carg);
                                System.out.println("Ingrese sueldo");
                                double suel = n3.nextDouble();
                                objeto.setSueldo(suel);
                                System.out.println("Ingrese materia");
                                String mat = n3.next();
                                objeto.setMateria(mat);
                                System.out.println("Ingrese colegio");
                                String cole = n3.next();
                                objeto.setColegio(cole);
                                System.out.println("Ingrese turno");
                                String tur = n3.next();                                
                                objeto.setTurno(tur);
                                controladorProfesorSustituto.create(objeto);
                                break;
                            case 2:
                                System.out.println("\t Read");
                                System.out.println("Ingrese el codigo a leer");
                                int profesu = nuevo.nextInt();
                                System.out.println(controladorProfesorSustituto.read(profesu));
                                break;
                            case 3:
                                System.out.println("\t Update");
                                System.out.println("Ingrese el codigo a actualizar");
                                int profesus = n3.nextInt();
                                if (controladorProfesorSustituto.read(profesus) != null) {
                                    objeto = new ProfesorSustituto();
                                    
                                System.out.println("\t Create");
                                System.out.println("Ingrese su nombre");
                                String nombre2 = n3.next();
                                objeto.setNombre(nombre2);
                                System.out.println("Ingrese su cedula");
                                String cedula2 = n3.next();
                                objeto.setCedula(cedula2);
                                System.out.println("Ingrese su edad");
                                int edad2 = n3.nextInt();
                                objeto.setEdad(edad2);
                                System.out.println("Tiene Experiencia ¿si o no?");
                                String ex2 = n3.next();
                                objeto.setExperiencia(ex2);
                                System.out.println("Ingrese su genero");
                                String gene2 = n3.next();
                                objeto.setGenero(gene2);
                                
                                System.out.println("Ingrese Horas Sustituto");
                                int sus2 = n3.nextInt();
                                objeto.setHorasSustituto(sus2);
                                System.out.println("Curso a cargo");
                                int carg2 = n3.nextInt();
                                objeto.setCursoSustituto(carg2);
                                System.out.println("Ingrese sueldo");
                                double suel2 = n3.nextDouble();
                                objeto.setSueldo(suel2);
                                System.out.println("Ingrese materia");
                                String mat2 = n3.next();
                                objeto.setMateria(mat2);
                                System.out.println("Ingrese colegio");
                                String cole2 = n3.next();
                                objeto.setColegio(cole2);
                                System.out.println("Ingrese turno");
                                String tur2 = n3.next();
                                
                                objeto.setTurno(tur2);
                             
                                controladorProfesorSustituto.update(objeto);
                                } else {
                                    System.out.println("El Profesor Sustituto no existe");
                                }
                                
                                break;
                            case 4:
                                System.out.println("\t Delete");
                                System.out.println("Ingrese el usuario a eliminar");
                                profesus = nuevo2.nextInt();
                                controladorProfesorSustituto.delete(profesus);
                                break;
                            case 5:
                                controladorProfesorSustituto.imprimir();
                                break;
                            case 6:
                                salir1 = true;
                        }
                        
                    }
                    break;
                case 5:
                    salir = true;
                    System.out.println("*****  Haz elegido salir  *****");
                    System.out.println("*****  GRACIAS  *****");
            }
        }
        
    }
}
