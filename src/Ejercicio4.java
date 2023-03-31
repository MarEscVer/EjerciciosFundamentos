import java.util.Arrays;

public class Ejercicio4 {

    public static void main(String[] args) {

        int[] prueba = {1,2,3,4,5,6};
        int[] pruebaInvertida = invertir(prueba);
        System.out.println(Arrays.toString(pruebaInvertida));

    }

    public static int[] invertir(int[] prueba){
        int[] invertido = new int[prueba.length];
        for (int i = 0; i < prueba.length; i++) {
            invertido[i] = prueba[prueba.length - 1 - i];
        }
        return invertido;
    }

}
