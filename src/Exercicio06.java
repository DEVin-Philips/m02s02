import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Exercicio06 {

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 2, 3, 4);

        List<Integer> triplos1 = new ArrayList<>();
        for (int valor : lista) {
            triplos1.add(valor * 3);
        }
        System.out.println(triplos1);

        List<Integer> triplos2 = new ArrayList<>();
        lista.forEach(valor -> triplos2.add(valor * 3));
        System.out.println(triplos2);

        List<Integer> triplos3 = lista.stream().map(valor -> valor * 3).collect(toList());
        System.out.println(triplos3);

        List<Integer> triplos4 = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            triplos4.add(lista.get(i) * 3);
        }
        System.out.println(triplos4);

    }

}
