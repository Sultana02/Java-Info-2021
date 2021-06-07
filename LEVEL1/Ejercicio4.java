package LEVEL1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int n = scan.nextInt();
        int resultado = 1;

        for(int i = 1; i <= n; i++){
            resultado *= i; 
        }
        System.out.println("El factorial de " + n +" es: " + resultado);

        scan.close();
    }
}
