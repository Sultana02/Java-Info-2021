package LEVEL1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int y = scan.nextInt();
        System.out.println("Ingrese otro número: ");
        int exponente = scan.nextInt();
        int resultado = 1;
        
        for(int i = 1; i <= exponente; i++){
            resultado = resultado * y;
        }
        System.out.println(y + " elevado a " + exponente + " = " + resultado);
        scan.close();
    }
}
