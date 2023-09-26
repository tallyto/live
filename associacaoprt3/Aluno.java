package associacaoprt3;

public class Aluno {
    private String nome;
    private int idade;

    public Aluno(){}

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
