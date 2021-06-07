package LEVEL2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio3L2 {
    public static void main(String[] args) {
        System.out.println("Cartas de una baraja: ");
        List<Integer> cartas;
        cartas = new ArrayList<>();
        int i;
        for(i = 1; i < 14; i++){
            cartas.add(i);
            System.out.println(i);
        }
        System.out.println("Cartas en Orden Inverso: ");
        Collections.reverse(cartas);
        for(i = 0; i < cartas.size(); i++){
            System.out.println(cartas.get(i));
        }
        System.out.println("Cartas Mezcladas: ");
        Collections.shuffle(cartas);
        for(i = 0; i < cartas.size(); i++){
            System.out.println(cartas.get(i));
        }
    }    
}
