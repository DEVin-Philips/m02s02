import java.util.Scanner;

public class DesafioDeCondicional2 {

    public static void main(String[] args) {
        // Calcular média de notas e imprimir se aprovado (média >= 7);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.printf("Notas informadas %.2f e %.2f \n", nota1, nota2);
        double media = (nota1 + nota2) / 2;
        System.out.printf("A média é %.2f \n", media);
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

}
