/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;


import ec.edu.ups.clases.EmpleadoAsalariado;
import ec.edu.ups.clases.ProfesorContratado;
import ec.edu.ups.clases.ProfesorSustituto;
import ec.edu.ups.clases.Taxista;
import ec.edu.ups.controladores.ControladorEmpleadoAsalariado;
import ec.edu.ups.controladores.ControladorProfesorSustituto;
import ec.edu.ups.controladores.ControladorTaxista;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

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
            System.out.println("1.- CRUD  de Empleado Asalariado");
            System.out.println("2.- CRUD  de Taxista");
            System.out.println("3.- CRUD  de Profesor Contratado");
            System.out.println("4.- CRUD  de Profesor Sustituto");
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
                        System.out.println("5.- -- Regresar --");
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
                                System.out.println("Ingrese el codigo");
                                int codigo = n3.nextInt();
                                objeto.setCodigo(codigo);
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
                                System.out.println("Ingrese el codigo del usuario a leer");
                                int codigoempleado = n3.nextInt();
                                System.out.println(controladorEmpleadoAsalariado.read(codigoempleado));
                                break;
                            case 3:
                                System.out.println("\t Update");
                                System.out.println("Ingrese el codigo a actualizar");
                                codigoempleado=n3.nextInt();
                                if(controladorEmpleadoAsalariado.read(codigoempleado) != null){
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
                                }else{
                                    System.out.println("El profesional no existe");
                                }
                                
                                break;
                            case 4:
                                System.out.println("\t Delete");
                                System.out.println("Ingrese el codigo del usuario a eliminar");
                                codigoempleado = n3.nextInt();
                                controladorEmpleadoAsalariado.delete(codigoempleado);
                                break;
                            case 5:
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
                    while (!salir) {

                        System.out.println("\t CRUD Taxista" + "\nElija una opcion");
                        System.out.println("1.- C: Create");
                        System.out.println("2.- R: Read");
                        System.out.println("3.- U: Update");
                        System.out.println("4.- D: Delete");
                        System.out.println("5.- -- Regresar --");
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
                                System.out.println("Ingrese el codigo");
                                int codigo = nuevo.nextInt();
                                objeto.setCodigo(codigo);
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
                                controladorTaxista.create(objeto);
                                break;
                            case 2:
                                System.out.println("\t Read");
                                System.out.println("Ingrese el usuario a leer");
                                nombre = nuevo.next();
                                System.out.println(controladorTaxista.read(nombre));
                                break;
                            case 3:
                                System.out.println("\t Update");
                                objeto = new Taxista();
                                System.out.println("Ingrese su nombre");
                                nombre = nuevo.next();
                                objeto.setNombre(nombre);
                                System.out.println("Ingrese su cedula");
                                cedula = nuevo.next();
                                objeto.setCedula(cedula);
                                System.out.println("Ingrese su edad");
                                edad = nuevo.nextInt();
                                objeto.setEdad(edad);
                                System.out.println("Ingrese la empresa");
                                empresa = nuevo.next();
                                objeto.setEmpresa(empresa);
                                System.out.println("Ingrese el codigo");
                                codigo = nuevo.nextInt();
                                objeto.setCodigo(codigo);

                                System.out.println("Ingrese el sueldo extra");
                                extra = nuevo.nextDouble();
                                objeto.setSueldoExtra(extra);
                                System.out.println("Ingrese su genero");
                                gene = nuevo.next();
                                objeto.setGenero(gene);

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
                                objeto.setFechaContratacion(testDate3);

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
                                objeto.setVacaciones(testDate4);
                                controladorTaxista.update(objeto);
                                break;
                            case 4:
                                System.out.println("\t Delete");
                                System.out.println("Ingrese el usuario a eliminar");
                                nombre = nuevo.next();
                                controladorTaxista.delete(nombre);
                                break;
                            case 5:
                                salir = true;
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
                    while (!salir) {

                        System.out.println("\t CRUD Profesor Contratado" + "\nElija una opcion");
                        System.out.println("1.- C: Create");
                        System.out.println("2.- R: Read");
                        System.out.println("3.- U: Update");
                        System.out.println("4.- D: Delete");
                        System.out.println("5.- -- Regresar --");
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
                                System.out.println("Ingrese el codigo");
                                int codigo = nuevo2.nextInt();
                                objeto.setCodigo(codigo);

                                System.out.println("Ingrese su genero");
                                String gene = nuevo2.next();
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
                                System.out.println("Ingrese fecha de evaluaciones");
                                Scanner sc2 = new Scanner(System.in);
                                String fecha2 = sc2.nextLine();
                                SimpleDateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
                                Date testDate2 = null;
                                String date2 = fecha;
                                try {
                                    testDate2 = df.parse(date2);
                                    System.out.println("Sus Evaluaciones seran el: " + fecha2);
                                } catch (Exception e) {
                                    System.out.println("invalid format");
                                }
                                objeto.setEvaluaciones(testDate);
                                controladorProfesorContratado.create(objeto);
                                break;
                            case 2:
                                System.out.println("\t Read");
                                System.out.println("Ingrese el usuario a leer");
                                nombre = nuevo.next();
                                System.out.println(controladorProfesorContratado.read(nombre));
                                break;
                            case 3:
                                System.out.println("\t Update");
                                objeto = new ProfesorContratado();
                                System.out.println("Ingrese su nombre");
                                nombre = nuevo2.next();
                                objeto.setNombre(nombre);
                                System.out.println("Ingrese su cedula");
                                cedula = nuevo2.next();
                                objeto.setCedula(cedula);
                                System.out.println("Ingrese su edad");
                                edad = nuevo2.nextInt();
                                objeto.setEdad(edad);
                                System.out.println("Ingrese el codigo");
                                codigo = nuevo2.nextInt();
                                objeto.setCodigo(codigo);

                                System.out.println("Ingrese su genero");
                                gene = nuevo2.next();
                                objeto.setGenero(gene);

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
                                objeto.setFechaContratacion(testDate3);

                                controladorProfesorContratado.update(objeto);
                                break;
                            case 4:
                                System.out.println("\t Delete");
                                System.out.println("Ingrese el usuario a eliminar");
                                nombre = nuevo.next();
                                controladorProfesorContratado.delete(nombre);
                                break;
                            case 5:
                                salir = true;

/////////////////////////////////////////////////////////////////////////////////////    
                        }

                    }

            }
            Scanner nuevo3 = new Scanner(System.in);
            switch (opcion) {
                case 3:
                    System.out.println("Ha elegido CRUD de Profesor Sustituto");
                    Scanner n2 = new Scanner(System.in);

                    int opcion1;
                    while (!salir) {

                        System.out.println("\t CRUD Profesor Sustituto" + "\nElija una opcion");
                        System.out.println("1.- C: Create");
                        System.out.println("2.- R: Read");
                        System.out.println("3.- U: Update");
                        System.out.println("4.- D: Delete");
                        System.out.println("5.- -- Regresar --");
                        System.out.println("Eliga una opcion:");
                        opcion1 = n2.nextInt();
                        switch (opcion1) {
                            case 1:
                                ProfesorSustituto objeto = new ProfesorSustituto();
                                System.out.println("\t Create");
                                System.out.println("Ingrese su nombre");
                                String nombre = nuevo3.next();
                                objeto.setNombre(nombre);
                                System.out.println("Ingrese su cedula");
                                String cedula = nuevo3.next();
                                objeto.setCedula(cedula);
                                System.out.println("Ingrese su edad");
                                int edad = nuevo3.nextInt();
                                objeto.setEdad(edad);
                                System.out.println("Ingrese el codigo");
                                int codigo = nuevo3.nextInt();
                                objeto.setCodigo(codigo);

                                System.out.println("Ingrese su genero");
                                String gene = nuevo3.next();
                                objeto.setGenero(gene);

                                controladorProfesorSustituto.create(objeto);
                                break;
                            case 2:
                                System.out.println("\t Read");
                                System.out.println("Ingrese el usuario a leer");
                                nombre = nuevo.next();
                                System.out.println(controladorProfesorContratado.read(nombre));
                                break;
                            case 3:
                                System.out.println("\t Update");
                                objeto = new ProfesorSustituto();
                                System.out.println("Ingrese su nombre");
                                nombre = nuevo3.next();
                                objeto.setNombre(nombre);
                                System.out.println("Ingrese su cedula");
                                cedula = nuevo3.next();
                                objeto.setCedula(cedula);
                                System.out.println("Ingrese su edad");
                                edad = nuevo3.nextInt();
                                objeto.setEdad(edad);
                                System.out.println("Ingrese el codigo");
                                codigo = nuevo3.nextInt();
                                objeto.setCodigo(codigo);

                                System.out.println("Ingrese su genero");
                                gene = nuevo3.next();
                                objeto.setGenero(gene);

                                controladorProfesorSustituto.update(objeto);
                                break;
                            case 4:
                                System.out.println("\t Delete");
                                System.out.println("Ingrese el usuario a eliminar");
                                nombre = nuevo.next();
                                controladorProfesorSustituto.delete(nombre);
                                break;
                            case 5:
                                salir = true;
                        }

                    }
                case 5:
                    salir = true;
                    System.out.println("*****  Haz elegido salir  *****");
                    System.out.println("*****  GRACIAS  *****");
            }
        }

    }
}
