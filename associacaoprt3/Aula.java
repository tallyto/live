package associacaoprt3;


public class Aula {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Tally");
        aluno1.setIdade(20);

        Aluno[] alunos = {aluno1};

        Professor professor1 = new Professor();
        professor1.setNome("Tally");

        Local local = new Local();
        local.setNome("Sala 1");
        local.setEndereco("Rua 1");

        Seminario seminario1 = new Seminario();
        seminario1.setNome("Aprendendo a aprender");
        seminario1.setAlunos(alunos);
        seminario1.setLocal(local);
        seminario1.setProfessor(professor1);

        seminario1.imprime();


    }
}