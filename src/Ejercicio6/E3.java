package Ejercicio6;

import java.util.ArrayList;
import java.util.Arrays;

public class E3 {

    public static void main(String[] args) {

        ArrayList<Integer> prueba = new ArrayList<Integer>();
        prueba.add(1);
        prueba.add(2);
        prueba.add(3);
        prueba.add(4);
        prueba.add(5);
        prueba.add(6);

        try {
            System.out.println(valoresCentrales(prueba));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static ArrayList<Integer> valoresCentrales(ArrayList<Integer> prueba) throws Exception{
        ArrayList<Integer> resultado = new ArrayList<Integer>();
        int tamanio = prueba.size();

        if (tamanio % 2 == 0){
            resultado.add(prueba.get(tamanio/2) - 1);
            resultado.add(prueba.get(tamanio/2));
        }else{
            throw new Exception("Longitud del ArrayList no par.");
        }

        return resultado;
    }

}
