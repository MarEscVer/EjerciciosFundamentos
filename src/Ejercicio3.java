import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio3 {

    public static void main(String[] args) {

        int[] p = {1,6,4,2,9,10};

        try {
            System.out.println(Arrays.toString(valoresCentrales(p)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static int[] valoresCentrales(int[] prueba) throws Exception{

        if(prueba.length % 2 != 0){
            throw new Exception("Longitud no par del array");
        }

        int[] centrales = new int[2];
        int indiceM = prueba.length / 2;
        centrales[0] = prueba[indiceM - 1];
        centrales[1] = prueba[indiceM];

        return centrales;
    }

}

