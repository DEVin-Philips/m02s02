public class Exercicio03 {

    public static void main(String[] args) {

//        Implemente um código copiando o array abaixo, e depois imprima no console o que se pede:

        int[] extrato = { 100, -35, -15, -5, 55, -20 };

//        a) Percorra o array (operador 'for') e imprima cada elemento do array na ordem;
        for(int i=0; i<extrato.length; i++) {
            System.out.println(extrato[i]);
        }
        for(int nro : extrato) {
            System.out.println(nro);
        }
        System.out.println();
//        b) Percorra o array (operador 'for') e imprima os elementos de trás pra frente (do último para o primeiro);
        for(int i=extrato.length-1; i>=0; i--) {
            System.out.println(extrato[i]);
        }

        System.out.println();
        // c) Percorra o array (operador 'for') e calcule o saldo final da conta (valor inicial era zero),
//        imprima o resultado no console. (Dica: crie uma variável saldo inicializada com zero e vá atualizando seu valor);
        int soma = 0;
        for(int valor : extrato) {
            soma += valor;
        }
        System.out.println("Soma = " + soma);

        System.out.println();
//        d) Imprima no console a mensagem 'saldo positivo' ou 'saldo negativo', dependendo do resultado do saldo final calculado.
        if (soma >= 0)
            System.out.println("saldo positivo");
        else
            System.out.println("saldo negativo");

        String msg = soma >= 0 ? "saldo positivo" : "saldo negativo";
        System.out.println(msg);
    }

}
