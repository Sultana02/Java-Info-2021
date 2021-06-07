package LEVEL2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1L2 {
    public static void main(String[] args) {
        List<String> ciudades;
        ciudades = new ArrayList<>();

        ciudades.add("Bariloche");
        ciudades.add("Trevelin");
        ciudades.add("Resistencia");
        ciudades.add("Esquel");
        int posicion;
        
        for(int i = 0; i < ciudades.size() ; i++){
            posicion = i+1;
            System.out.println("#" + posicion + " " + ciudades.get(i));
        }
    }
}


