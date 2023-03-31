package Ejercicio6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class E4 {

    public static void main(String[] args) {

        ArrayList<Integer> prueba = new ArrayList<Integer>();
        prueba.add(1);
        prueba.add(2);
        prueba.add(3);
        prueba.add(4);
        prueba.add(5);
        prueba.add(6);

        Collections.reverse(prueba);

        System.out.println(prueba);

    }

}
