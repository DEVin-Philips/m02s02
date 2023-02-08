public class DesafioLoop2 {

    public static void main(String[] args) {

        // Jack tinha um valor inicial de 1200 reais.
        // Escreva um codigo para calcular quantos anos levaria para ele
        // atingir um montante de mais de 5000 reais,
        // se ele investir num fundo que rende 10% ao ano.

        float valor = 1200f;
        int anos = 0;

        while (valor < 5000) {
            anos++;
            valor *= 1.10;   // valor = valor * 1.10
        }

        System.out.printf("Levará %d anos para atingir o valor de 5000", anos);

    }

}
