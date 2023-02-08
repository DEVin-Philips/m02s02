import java.util.List;

public class AulaRepeticoes {

    public static void main(String[] args) {

        String[] cores = {"vermelho", "branco", "preto"};
        List<Integer> numeros = List.of(1,2,3);

        for(int i=0; i < cores.length; i++) {
            System.out.println( cores[i] );
        }
        for(int i=0; i < numeros.size(); i++) {
            System.out.println( numeros.get(i) );
        }

        for(String cor : cores) {
            System.out.println( cor );
        }
        for (Integer nro : numeros) {
            System.out.println( nro );
        }

//        numeros.forEach(nro -> System.out.println(nro));
    }

}
