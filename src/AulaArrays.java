public class AulaArrays {

    public static void main(String[] args) {

        int[] notas = { 10, 9, 8 };

        String[] nomes = { "tiago", "pedro", "rodolfo" };

        int tamanhoDoArray = nomes.length;

        System.out.println( tamanhoDoArray );

        String[][] turmas = {
                { "james", "scott", "spock"},  // 0
                { "luke", "obi-wan", "han" },  // 1
                { "john", "tyrion", "cersey"}  // 2
        };

        String hanSolo = turmas[1][2];

        System.out.println(hanSolo);

        String[] frutas = new String[4];

        frutas[0] = "maçã";
        frutas[1] = "banana";
        frutas[3] = "uva";

        System.out.println(frutas[0]); // maça
        System.out.println(frutas[2]); // null

    }

}
