package LEVEL1;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int entero = scan.nextInt();

        for (int i= 1; i <= entero; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            
            }
            System.out.println("");
        }
        scan.close();
    }
}
