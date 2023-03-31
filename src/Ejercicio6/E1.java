package Ejercicio6;

import java.util.ArrayList;

public class E1 {

    public static void main(String[] args) {

        ArrayList<Integer> prueba = new ArrayList<Integer>();
        prueba.add(1);
        prueba.add(4);
        prueba.add(1);

        System.out.println(verificar(prueba));

    }

    public static boolean verificar(ArrayList<Integer> prueba){

        if(prueba.get(0) == 6 || prueba.get(prueba.size()-1) == 6){
            return true;
        }
        return false;
    }

}
