public class Ejercicio2 {

    public static void main(String[] args) {

        int[] p1 = {1,2,3,4};
        int[] p2 = {1,4,8};
        int[] p3 = {1,6,4,2};

        System.out.println(noContine(p1));
        System.out.println(noContine(p2));
        System.out.println(noContine(p3));

    }

    public static boolean noContine(int[] prueba){
        for (int i = 0; i < prueba.length; i++) {
            if (prueba[i] == 2 || prueba[i] == 3) {
                return false;
            }
        }
        return true;
    }

}
