package LEVEL2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4L2 {
    public static void main(String[] args) {
        ArrayList<String> estudiantes  = new ArrayList<>();

        estudiantes.add("Agostina Sanchez");
        estudiantes.add("Bruno Valdez");
        estudiantes.add("Celina Johnson");
        estudiantes.add("Dario Lopez");
        estudiantes.add("Ester Meza");
        estudiantes.add("Facundo Soto");
        estudiantes.add("Gastón Hernandez");
        estudiantes.add("Hillary Vallejos");
        estudiantes.add("José Spinola");
        estudiantes.add("Laura Marano");
        estudiantes.add("Mario Sunz");
        estudiantes.add("Nataly Thompson");
     
        List<String> curso1 = estudiantes.subList(0,5);
        List<String> curso2 = estudiantes.subList(5,8);
        List<String> curso3 = estudiantes.subList(8, estudiantes.size());

        System.out.println("Primer curso con Letra inicial A a E: ");
        for(String alumnos : curso1){
            System.out.println(alumnos);
        }
        System.out.println("Segundo curso con Letra inicial F a H: ");
            for(String alumnos : curso2){
                System.out.println(alumnos);
            }
            System.out.println("Tercer curso con Letra inicial J a Z: ");
            for (String alumnos : curso3){
                System.out.println(alumnos);
            }              
    }
}
