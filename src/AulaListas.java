import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AulaListas {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>(); // criado lista vazia

        nomes.add("tiago");  // adicionar este elemento na lista
        nomes.add("lucas");  // adiciona mais um elemento na lista ...

        // nomes.set(0, "osnei"); // substituir o elemento desse indice pelo novo elemento indicad

        nomes.add(0, "osnei"); // adiciona o elemento no indice indicado e "empurra" os demais para os espaços subsequentes

        nomes.remove("tiago"); // apaga o elemento da lista

        System.out.println( nomes );

        // criando lista inicializada com elementos :
            // jeito 1 (java 8)
        List<String> nomes2 = Arrays.asList("Kirk", "Spock", "McCoy", "Scott");
            // jeito 2 (java 11)
        List<String> nomes3 = List.of("Kirk", "Spock", "McCoy", "Scott");

        System.out.println(nomes2);
        System.out.println(nomes3);

        String nomeEscolhido = nomes2.get(2); // McCoy
        System.out.println(nomeEscolhido);

        nomes2.size();  // tamanho da lista (igual ao length de array)
        System.out.println("Tamanho da lista = " + nomes2.size());

        List<String> outrosNomes = List.of("jaime", "pedro", "adler");

        List<String> nomes4 = new ArrayList<>();
        nomes4.add("walter white");
        nomes4.add("jesse pinkman");
        System.out.println(nomes4);

        nomes4.addAll(outrosNomes);
        // que eh a mesma coisa que esses varios add
//        nomes4.add("jaime");
//        nomes4.add("pedro");
//        nomes4.add("adler");

        System.out.println(nomes4);

        List<String> listaCopia = new ArrayList(nomes2);
        System.out.println(listaCopia);
        listaCopia.add("Uhura");
        System.out.println(listaCopia);

    }

}
