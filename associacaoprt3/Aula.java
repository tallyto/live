package associacaoprt3;

public class Aula {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Tállyto", 27);

        Aluno[] alunos = { aluno1 };

        Aluno aluno2 = new Aluno();
        aluno2.setNome("MrNit");
        aluno2.setIdade(35);

        Professor professor1 = new Professor("Tállyto");

        Local local = new Local();
        local.setNome("Sala 1");
        local.setEndereco("Rua 1");

        Local local2 = new Local();
        local2.setNome("Sala 2");
        local2.setEndereco("Rua 2");

        Seminario seminario1 = new Seminario("Aprendendo a aprender");
        seminario1.setAlunos(alunos);
        seminario1.setLocal(local);
        seminario1.setProfessor(professor1);
        seminario1.imprime();

        Seminario seminario2 = new Seminario("Orientação a Objetos em Java");
        seminario2.setAlunos(new Aluno[] { aluno2 });
        seminario2.setLocal(local2);
        seminario2.setProfessor(professor1);
        seminario2.imprime();

    }

}