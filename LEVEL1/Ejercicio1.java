package LEVEL1;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("USUARIO: ");
        Scanner scan = new Scanner(System.in);
        String nombre = scan.nextLine();
        System.out.println("HOLA" + " " + nombre);
    scan.close();
    }
}
