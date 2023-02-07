public class DesafioArrays1 {

    public static void main(String[] args) {

        String[] cores = {"vermelho", "preto", "branco", "roxo", "azul", "amarelo"};

        System.out.println( cores.length );  // 6
        System.out.println( cores[2] );  // branco
        System.out.println( cores[0] );  // vermelho
        System.out.println( cores[5] ); // amarelo

        int indiceUltElem = cores.length - 1;
        System.out.println( cores[indiceUltElem]  ); // amarelo

    }

}
