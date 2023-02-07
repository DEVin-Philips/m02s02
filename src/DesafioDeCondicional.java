import java.util.Scanner;

public class DesafioDeCondicional {

    // Dado uma idade, calcular se é maior de idade
    // caso idade >= 18 anos;
    //Exemplo:    int idade = 20; …
    public static void main(String[] args) {
        System.out.println("Digite a idade: ");
        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt(); // capturando valor numero inteiro
//        int idadeAsInt = Integer.parseInt(idade); // convertendo a var string para int primitivo
//        Integer idadeAsInteger = Integer.valueOf(idade); // convertendo a var string para Integer (classe)
        if (idade >= 18) {
            System.out.println("Eh maior de idade!");
        } else {
            System.out.println("Eh menor de idade!");
        }
    }
}
