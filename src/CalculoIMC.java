public class CalculoIMC {

    public static void main(String[] args) {

        float altura = 1.83f;
        float peso = 80.5f;
        float imc = peso / (altura * altura);
//        float alturaQuadr = (float)Math.pow(altura, 2);// casting
//        float imc2 = peso / alturaQuadr;
        System.out.println("O IMC calculado eh: " + imc);

        String classificacao;
        if (imc < 18.5f) {
            classificacao = "magreza";
        } else if (imc < 25f) {
            classificacao = "normal";
        } else if (imc < 30) {
            classificacao = "sobrepeso";
        } else if (imc < 40) {
            classificacao = "obesidade";
        } else {
            classificacao = "obesidade grave";
        }

        System.out.println("Classificacao = " + classificacao);
    }

}
