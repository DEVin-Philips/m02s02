import java.util.Arrays;
import java.util.List;

public class Exercicio08 {

    public static void main(String[] args) {

//        Localize na lista abaixo e imprima no console a
//        primeira ocorrência de número maior que 50.
        List<Integer> numeros = Arrays.asList(0,2,88,56,33,42,67,3,9,0,2);

        for(Integer valor : numeros) {
            if (valor > 50) {
                System.out.println(valor);
                break; // interrompe o laço de repeticao para melhorar performance
            }
        }

    }

}
