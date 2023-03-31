package Ejercicio6;

import java.util.ArrayList;

public class E2 {

    public static void main(String[] args) {
        ArrayList<Integer> prueba = new ArrayList<Integer>();
        prueba.add(1);
        prueba.add(4);
        prueba.add(1);
        prueba.add(2);

        System.out.println(noContine(prueba));
    }

    public static boolean noContine(ArrayList<Integer> prueba){
        for (int i = 0; i < prueba.size(); i++) {
            if(prueba.get(i) == 2 || prueba.get(i) == 3){
                return false;
            }
        }
        return true;
    }

}
