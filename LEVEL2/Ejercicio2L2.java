package LEVEL2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2L2{
    public static void main(String[] args) {
        List<Integer> numeros;
        numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(20);
        numeros.add(35);
        numeros.add(40);
        numeros.add(500);
        int i; 
        for(i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
        System.out.println("Tamaño de la lista: " + numeros.size());
        numeros.add(0,10); //agrega al inicio de la lista
        numeros.add(15); //agrega al final
        for(i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
        System.out.println("Tamaño de la lista: " + numeros.size());
    }
}
