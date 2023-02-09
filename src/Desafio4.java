import java.util.ArrayList;
import java.util.List;

public class Desafio4 {

    public static void main(String[] args) {

//        Implemente um código que localize os elementos que aparece somente uma vez no array
//        abaixo, enquanto os demais aparecem repetidos.
//        Imprima ao final os elementos que não se repetem.

        int[] arr = {3, 5, 1, 4, 7, 6, 5, 2, 3, 4, 2, 3, 1, 0, 6};
        List<Integer> unicos = new ArrayList<>();

        for(int i=0; i < arr.length; i++) {
            int nro = arr[i];
            boolean repetido = false;

            for(int j=0; j < arr.length; j++) {
                if (j == i)
                    continue;
                if (nro == arr[j]) { // repetiu
                    repetido = true;
                    break;
                }
            }

            if (!repetido)  // false
                unicos.add(nro);
        }

        for(Integer n : unicos) {
            System.out.println(n);
        }

    }

}
