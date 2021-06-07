package LEVEL1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int y = scan.nextInt();
        System.out.println("Ingrese otro número: ");
        int x = scan.nextInt();
        int z = 0;
        
        for(int i = 1; i <= y; i++){
            z = z + x;
        }
        System.out.println(y + "x" + x + "=" + z);
        scan.close();
    }
}
