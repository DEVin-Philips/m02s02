public class DesafioLoop1 {

    public static void main(String[] args) {

        // Dado o array abaixo, escreva um código para calcular
        // quantos números positivos, negativos e zeros existem.
        int[] numeros = {5, 7, -7, -4, 3, -9, 0, 12, -34, 0, 3, 6, 9};

        int zeros = 0;
        int positivos = 0;
        int negativos = 0;

        for(int nro : numeros) {
            if (nro > 0)
                positivos++;
            else if (nro < 0)
                negativos++;
            else
                zeros++;
        }

        System.out.printf("Positivos: %d, Negativos: %d, Zeros: %d", positivos, negativos, zeros);

    }
}
