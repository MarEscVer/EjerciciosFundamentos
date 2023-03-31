import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio5 {

    public static void main(String[] args) {

    String[] prueba = {"Hola", "123", "patata", "43", "1", "Ho78"};
    String[] pruebaNumeros = obtenerNumeros(prueba);
    System.out.println(Arrays.toString(pruebaNumeros));

    }

    public static String[] obtenerNumeros(String[] prueba){
        List<String> resultado = new ArrayList<String>();

        for (String caracter : prueba) {
            try{
                Integer.parseInt(caracter);
                resultado.add(caracter);
            } catch (NumberFormatException e){

            }
        }

        return resultado.toArray(new String[0]);
    }
}
