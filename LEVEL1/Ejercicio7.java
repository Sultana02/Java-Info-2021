package LEVEL1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un texto: ");
        String nombre = scan.nextLine();
        char letra;

        for(int i = 0; i < nombre.length(); i++ ){
            letra = nombre.charAt(i);
            if (letra <= 122 && letra >= 97){
                letra = (char)(letra - 32); //castea tipos primitivos
                System.out.print(letra);
            }else{
                System.out.print(letra);
            }
        } 
        scan.close();
    }
}
