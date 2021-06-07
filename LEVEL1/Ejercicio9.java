package LEVEL1;
import java.util.Arrays; //transforma un Split() a List
import java.util.Collections; //saca la cantidad que una letra aparece 
import java.util.List;
import java.util.Scanner;

public class Ejercicio9 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Tomamos el texto desde la consola
        System.out.println("Introduce un texto: ");
        String texto = scan.nextLine();
        System.out.println("Ingrese una letra: ");
        String letra = scan.nextLine();
        int cantidadRepetida = 0;

        //Transformamos la frase a una lista, 
        //así podremos buscar las letras duplicadas con Collections
        List<String> textoList = Arrays.asList(texto.split(""));

        //Recorremos y contamos todo
        for(int i = 0; i < texto.length(); i++){
            //pasamos como primer parámetro la lista
            // y como segundo la letra que queremos contar
             cantidadRepetida = Collections.frequency(textoList, letra);
        }
        //imprimimos la letra que más se repite
        System.out.println("La letra " + letra + " se repite  " + cantidadRepetida + "veces");
        scan.close();
    }
    
}