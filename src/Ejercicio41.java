public class Ejercicio41 {
    public static boolean buscar(int e, int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == e) {
                return true;
            }
        }
        return false;
    }
    public static boolean buscar1(int e, int[] array){
        for (int i = array.length; i <0; i--) {
            if (array[i] == e) {
                return true;
            }
        }
        return false;
    }
    public static boolean buscar2(int e, int[] array){
        int i=array.length/2;
        while (i<array.length && i>=0) {
            if (array[i] == e) {
                return true;
            }
            if (array[i] < e) {
                i++;
            }else{
                i--;
            }

        }
        return false;
    }
}
