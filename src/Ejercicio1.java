public class Ejercicio1 {
    public static void main(String[] args) {
        int[] p1 = {1,2,3,4};
        int[] p2 = {6, 4, 1};
        int[] p3 = {2, 4, 5, 6};

        System.out.println(verificar(p1));
        System.out.println(verificar(p2));
        System.out.println(verificar(p3));
    }

    public static boolean verificar(int[] prueba){
        //Verificar si empieza o termina por 6
        int longitud = prueba.length;
        return (prueba[0] == 6 || prueba[longitud - 1] == 6);
    }
}