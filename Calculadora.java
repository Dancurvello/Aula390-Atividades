public class Calculadora {
    private final String mensagem;

    // Primeiro construtor com mensagem padrão
    public Calculadora() {
        this.mensagem = "Bem-vindo à calculadora!";
        System.out.println(mensagem);
    }

    // Segundo construtor que realiza o cálculo e exibe o resultado
    public Calculadora(int n1, int n2) {
        this.mensagem = "Calculando a soma de " + n1 + " e " + n2;
        System.out.println(mensagem);
        int resultado = n1 + n2;
        System.out.println("Resultado: " + resultado);
    }
}
