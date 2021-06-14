package Ejercicio5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Lista de Empleados");
        System.out.print("Ingrese una letra: ");
        Scanner scan = new Scanner(System.in);
        String letra = scan.nextLine();
        scan.close();
       
        String nombreArchivo = "D:\\INFORMATORIO\\Java - Repositorio\\Java-Info-2021\\Ejercicio5\\Empleado.txt";
        List<Empleado> empleados = Empleado.getEmpleados(nombreArchivo);
        List<Empleado> empleados2 = Empleado.empleadosInicianCon(empleados, letra);
        System.out.println("Empleados comienzan con la letra: " + letra);
        for(Empleado empleado : empleados2){
            System.out.println(empleado.getNombreCompleto());
        }
        System.out.println("Empleado Joven: ");
        Empleado empleadoJoven = Empleado.getEmpleadoJoven(empleados);
        System.out.println(empleadoJoven.getNombreCompleto());
        System.out.println("Empleado Viejo: ");
        Empleado empleadoViejo = Empleado.getEmpleadoViejo(empleados);
        System.out.println(empleadoViejo.getNombreCompleto());
        System.out.println("Empleado con más ganancia: ");
        Empleado empleadoMayorSueldo = Empleado.getEmpleadoMayorSueldo(empleados);
        System.out.println(empleadoMayorSueldo.getNombreCompleto() + " gana: " + empleadoMayorSueldo.getSueldo());
        System.out.println("Empleado con menor ganancia: ");
        Empleado empleadoMenorSueldo = Empleado.getEmpleadoMenorSueldo(empleados);
        System.out.println(empleadoMenorSueldo.getNombreCompleto() + " gana: " + empleadoMenorSueldo.getSueldo());
    }
}

//Leer Archivo Txt
class Reader{
    Path filePath;
    private Reader(String nombreArchivo){
        this.filePath = Paths.get(nombreArchivo);
    }
    private Stream<String> getStream() throws IOException{
        return Files.lines(filePath);
    }
    public static Stream<String> getStream(String nombreArchivo) throws IOException{
        Reader reader = new Reader(nombreArchivo);
        return reader.getStream();
    }
}

//clase empleado
class Empleado{
    String nombre;
    String apellido;
    LocalDate fechaNacimiento;
    double sueldo;

    //constructor
    public Empleado(String nombre, String apellido, String fechaNacimiento, String sueldo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
        this.sueldo = Double.parseDouble(sueldo);
    } 
    //getter
    public String getNombre(){
        return nombre;
    }
    //setter
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
     //getter
     public String getApellido(){
        return apellido;
    }
    //setter
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    //get FechaNacimiento
    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }
    //set FechaNacimiento
    public void setFechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    //get Sueldo
    public double getSueldo(){
        return sueldo;
    } 
    //set Sueldo
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    //lista empleados
    public static List<Empleado> getEmpleados(String nombreArchivo){
        List<Empleado> empleados = new ArrayList<>();
        try {
            Reader.getStream(nombreArchivo).forEach((e) -> {
                String[] lista = e.split(",");
                String nombre = lista[0];
                String apellido = lista[1];
                String fechaNacimiento = lista[2];
                String sueldo = lista[3];
                Empleado empleado = new Empleado(nombre, apellido, fechaNacimiento, sueldo);
                empleados.add(empleado);
            });
        } catch (IOException e) {
            System.out.println("Ocurrió un error.!!" + e.getMessage());
        }
        return empleados;
    } 
    //devuelve todos los empleados que comienzan con una letra dada en el apellido
    public static List<Empleado> empleadosInicianCon(List<Empleado>empleados, String letra){
        List<Empleado> empleados2 = new ArrayList<>();
        for(Empleado empleado : empleados){
            if(empleado.getApellido().startsWith(letra)){ //genera lista con una letra
                empleados2.add(empleado);
            }
        }
        return empleados2; 
    }
    //devuelve el apellido y nombre
    public String getNombreCompleto(){
        return apellido + ", " + nombre;
    }

    //Método que devuelva el empleado más joven
    public static Empleado getEmpleadoJoven(List<Empleado> empleados){
        Empleado empleadoJoven = null; //se guarda el empleado joven
        LocalDate empleadoFechaNacimiento;
        LocalDate empleadoJovenFechaNacimiento = null;
        for(Empleado empleado : empleados){ //itera cada empleado de la lista
            if(empleadoJoven == null){ 
                empleadoJoven = empleado;
                empleadoJovenFechaNacimiento = empleadoJoven.getFechaNacimiento();
                continue; //saltamos
            }
            empleadoFechaNacimiento = empleado.getFechaNacimiento();
            if(empleadoFechaNacimiento.isAfter(empleadoJovenFechaNacimiento)){//compara fecha nac. con empleado joven
                empleadoJoven = empleado;
                empleadoJovenFechaNacimiento = empleadoJoven.getFechaNacimiento();
            }
        }
        return empleadoJoven;
    }

    //Método que devuelva el empleado más Viejo
    public static Empleado getEmpleadoViejo(List<Empleado> empleados){
        Empleado empleadoViejo = null; //se guarda el empleado viejo
        LocalDate empleadoFechaNacimiento;
        LocalDate empleadoViejoFechaNacimiento = null;
        for(Empleado empleado : empleados){ //itera cada empleado de la lista
            if(empleadoViejo == null){ 
                empleadoViejo = empleado;
                empleadoViejoFechaNacimiento = empleadoViejo.getFechaNacimiento();
                continue; //saltamos
            }
            empleadoFechaNacimiento = empleado.getFechaNacimiento();
            if(empleadoFechaNacimiento.isBefore(empleadoViejoFechaNacimiento)){//compara fecha nac. con empleado viejo
                empleadoViejo = empleado;
                empleadoViejoFechaNacimiento = empleadoViejo.getFechaNacimiento();
            }
        }
        return empleadoViejo;
    }

    //Método para empleado con mayor sueldo
    public static Empleado getEmpleadoMayorSueldo(List<Empleado> empleados){
        Empleado empleadoMayorSueldo = null; //se guarda el empleado con mayor sueldo
        double sueldo;
        double sueldoMayor = 0;
        for(Empleado empleado : empleados){ //itera cada empleado de la lista
            if(empleadoMayorSueldo == null){ 
                empleadoMayorSueldo = empleado;
                sueldoMayor = empleadoMayorSueldo.getSueldo();
                continue; //saltamos
            }
            sueldo = empleado.getSueldo();
            if(sueldo > sueldoMayor ){
                sueldoMayor = sueldo;
                empleadoMayorSueldo = empleado;
            }
        }
        return empleadoMayorSueldo;
    }
    //Método para empleado con menor Sueldo
    public static Empleado getEmpleadoMenorSueldo(List<Empleado> empleados){
        Empleado empleadoMenorSueldo = null; //se guarda el empleado con menor sueldo
        double sueldo;
        double sueldoMenor = 0;
        for(Empleado empleado : empleados){ //itera cada empleado de la lista
            if(empleadoMenorSueldo == null){ 
                empleadoMenorSueldo = empleado;
                sueldoMenor = empleadoMenorSueldo.getSueldo();
                continue; //saltamos
            }
            sueldo = empleado.getSueldo();
            if(sueldo < sueldoMenor ){
                sueldoMenor = sueldo;
                empleadoMenorSueldo = empleado;
            }
        }
        return empleadoMenorSueldo;
    }
}