public class PessoaEncapsulada {
    private String nome;
    private int idade;

    // Construtor
    public PessoaEncapsulada(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static class MensagemOlaMundo {
        // Construtor que exibe a mensagem "Olá Mundo"
        public MensagemOlaMundo() {
            System.out.println("Olá Mundo");
        }
    }

}
