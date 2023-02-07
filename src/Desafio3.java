import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafio3 {


    public static void main(String[] args) {

        /*
            Com base no que vimos sobre arrays,
            crie uma array de tamanho 5 e tipo “int”.
            Em seguida, adicione os números de 1 a 5 em ordem sequencial.
        */
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        System.out.println( Arrays.toString(arr)  );


        /*
            Agora crie uma lista vazia de números (Integer).
            Adicione números começando do número 5 e indo até o número 10 (6 itens).
        */
        List<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);

        System.out.println(lista);
    }

}
