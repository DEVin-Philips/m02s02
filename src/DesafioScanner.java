import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioScanner {

    public static void main(String[] args) {

        // criando uma lista de números de 1 a 4
//        List<Integer> codigoOpcoes = List.of(1,2,3,4);
        List<Integer> codigoOpcoes = new ArrayList<>();
        codigoOpcoes.add(1);
        codigoOpcoes.add(2);
        codigoOpcoes.add(3);
        codigoOpcoes.add(4);

//        Imprima quatro frases na tela, correspondente a cada item da lista:
//        1 - Primeira Opção
//        2 - Segunda Opção
//        3 - Terceira Opção
//        4 - Quarta Opção
        System.out.println("== Menu == ");
        System.out.println("1 - Primeira Opção");
        System.out.println("2 - Segunda Opção");
        System.out.println("3 - Terceira Opção");
        System.out.println("4 - Quarta Opção");

        //  exiba a frase no console “Digite a opção desejada: “
        System.out.println();  // imprime uma linha em branco
        System.out.println("Digite a opção desejada: ");

        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();  // captura nro inteiro digitado pelo usuario

        boolean valido = codigoOpcoes.contains(opcao); // verifica se a opcao digitada pelo usuario está contida na lista

        System.out.println("Opcao é válida = " + valido);
    }

}
