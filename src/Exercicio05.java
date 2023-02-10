public class Exercicio05 {

    public static void main(String[] args) {

//        Implemente no método main um código que instancie um array (numérico) e identifique
//        o maior e menor  valor do mesmo. Imprima no console estes valores ou
//        "Não é possível calcular" qdo não for possível.
//                Teste a função com as seguintes entradas:

        int maior = Integer.MIN_VALUE;  // arr[0];
        int menor = Integer.MAX_VALUE;  // arr[0];

//        int[] arr = {56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47};
//        int[] arr = {1};
//        int[] arr = {1, -1};
//        int[] arr = null;
//        int[] arr = {-2,-2,-2,-2};
        int[] arr = {20,10, 30};

        if (arr == null || arr.length == 0) {
            System.out.println("Arr = " + "Não é possível calcular");
            return;
        }

        for (int valor : arr) {
            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
        }
        System.out.printf("Arr: maior = %d e menor = %d", maior, menor );

    }

}
