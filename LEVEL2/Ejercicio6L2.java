package LEVEL2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicio6L2 {
    public static void main(String[] args) {
        System.out.println("Información de Empleados: ");
        Set<Empleado> empleados = new HashSet<Empleado>();
        empleados.add(new Empleado("Pedro Hernandez",10688563, 10 , 1000));
        empleados.add(new Empleado("Laura Sanchez", 15555333, 8, 500));
        empleados.add(new Empleado("Samuel Rodriguez", 14665973, 6 , 400));
        Map <Integer, Integer> sueldos = new HashMap<>();
       for (Empleado empleado : empleados) {
           sueldos.put(empleado.getDni(), empleado.getSueldo());
       }
       sueldos.forEach((k,v) -> System.out.println("dni: " + k + ": sueldo: " + v));
    }
}
class Empleado{
    String nombreApellido;
    int dni;
    int horasTrabajadas;
    int valor;
 
    public Empleado(String nombreApellido, int dni, int horasTrabajadas, int valor){
        this.nombreApellido = nombreApellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valor = valor;
    }
    public int getDni(){ //devuelve el valor
        return this.dni;
    }
    public int getSueldo(){
        int resultado = this.horasTrabajadas * this.valor;
        return resultado;
    }
 }
