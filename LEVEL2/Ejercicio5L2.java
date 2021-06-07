package LEVEL2;

import java.util.ArrayList;

public class Ejercicio5L2 {
    public static void main(String[] args) {
        ArrayList<Integer> horasTrabajadas = new ArrayList<>();
        ArrayList<Integer> sueldo = new ArrayList<>();

        horasTrabajadas.add(6);
        horasTrabajadas.add(7);
        horasTrabajadas.add(8);
        horasTrabajadas.add(4);
        horasTrabajadas.add(5);
        
        sueldo.add(350);
        sueldo.add(345);
        sueldo.add(550);
        sueldo.add(600);
        sueldo.add(320);

        int resultado = 0;

        for (int i = 0; i < horasTrabajadas.size(); i++) {
            resultado += horasTrabajadas.get(i) * sueldo.get(i);
            System.out.print(horasTrabajadas.get(i) * sueldo.get(i) + ", ");
        }
        System.out.println("\nTotal Final: $" + resultado);
    }
}
