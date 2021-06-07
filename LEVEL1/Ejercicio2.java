package LEVEL1;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Ingrese un número: ");
        Scanner scan = new Scanner(System.in); 
        int numero = scan.nextInt();
        System.out.println("Ingrese otro número: ");
        int numero1 = scan.nextInt();

        System.out.println(numero + "+" + numero1 + "=" + (numero+numero1));
        System.out.println(numero + "-" + numero1 + "=" + (numero - numero1));
        System.out.println(numero + "*" + numero1 + "=" + (numero * numero1));
        System.out.println(numero + "/" + numero1 + "=" + (numero / numero1));
        System.out.println(numero + "%" + numero1 + "=" + (numero % numero1));

        scan.close();
    }
}