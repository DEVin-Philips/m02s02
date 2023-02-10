public class Exercicio10 {

    public static void main(String[] args) {

        String palavra = "osso";
        int metade = palavra.length() / 2;
        boolean isPalandrome = true;

        for (int i=0; i< metade; i++) {
            if (palavra.charAt(i) != palavra.charAt( palavra.length()-1 - i )) {
                isPalandrome = false;
                break;
            }
        }

        System.out.println("Eh palindrome = " + isPalandrome);

        // versao usando a classe StringBuilder
//        StringBuilder builder = new StringBuilder(palavra);
//        String reverso = builder.reverse().toString();
//        if (palavra.equals( reverso ))
//            System.out.println("Eh palindrome!");
//        else
//            System.out.println("Nao eh palindrome!");
    }

}
