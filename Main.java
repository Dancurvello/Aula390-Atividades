public class Main {
    public static void main(String[] args) {
        // Exemplo da classe com atributos encapsulados
        PessoaEncapsulada pessoa = new PessoaEncapsulada("João", 25);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        System.out.println();

        // Exemplo da classe com construtor de mensagem
        PessoaEncapsulada.MensagemOlaMundo mensagemOlaMundo = new PessoaEncapsulada.MensagemOlaMundo();

        System.out.println();

        // Exemplo da classe com dois construtores
        Calculadora calculadora1 = new Calculadora(); // Chama o primeiro construtor
        Calculadora calculadora2 = new Calculadora(10, 5); // Chama o segundo construtor
    }
}
