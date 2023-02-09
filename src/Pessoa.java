/**
 * Esta classe representa uma pessoa dentro do sistema espacial,
 * blablab alba blaba .
 *
 * @author tiagoamp
 * @since 09/02/2022
 */
public class Pessoa {

    String nome;

    Integer idade;

    String endereco;

    /**
     * Expressa a acao de uma pessoa andar.
     * @return void Nao tem retorno
     */
    public void andar() {
        System.out.println("Estou andando");
    }

    /**
     * Metodo que retorna a idade da pessoa.
     * @return Integer Representa a idade da pessoa
     */
    public Integer falarIdade() {
        return idade;
    }

    private boolean ehVerdade() {
        return true;
    }

    /**
     * Metodo usado para mandar a pessoa para o espaco.
     *
     * @param foguete Representa o nome do foguete utilizado
     * @param velocidade Indicar a velocidade final pretendida pelo viajante
     * @return Boolean Indicando se a pessoa foi para o espaço ou nao
     * @throws IllegalArgumentException Excecao lançada quando nao se conegue interpretar os argumentos
     */
    public Boolean vouParaEspaco(String foguete, Float velocidade) throws IllegalArgumentException {
        return true;
    }

}
