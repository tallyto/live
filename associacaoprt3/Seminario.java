package associacaoprt3;

public class Seminario {
    private String nome;
    private Aluno[] alunos;
    private Local local;
    private Professor professor;

    public Seminario() {
    }

    public Seminario(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(String.format("Nome: %s", nome));
        System.out.println(String.format("Professor: %s", professor.getNome()));
        System.out.println(String.format("Local: %s Endereço: %s", local.getNome(), local.getEndereco()));
        for(Aluno aluno : alunos) {
            System.out.println(String.format("Aluno: %s", aluno.getNome()));
        }
    
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public Local getLocal() {
        return local;
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

}
