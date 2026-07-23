package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class SeminarioTest01 {
    static void main(String[] args) {
        Aluno aluno1 = new Aluno("Kevyn", 18);
        Aluno aluno2 = new Aluno("José", 22);
        Aluno aluno3 = new Aluno("Nuno", 20);
        Aluno[] alunos = {aluno1, aluno2, aluno3};
        Local local = new Local("Rua dos Caras, Nº 183, Centro, Matão do Norte");
        Seminario seminario1 = new Seminario("Matemática", alunos, local);
        Seminario[] seminarios = {seminario1};
        Professor professor = new Professor("Mariano", "Matemática", seminarios);

        aluno1.setSeminario(seminario1);
        aluno2.setSeminario(seminario1);
        aluno3.setSeminario(seminario1);

        professor.setSeminarios(seminarios);

        seminario1.setAlunos(alunos);

        seminario1.setLocal(local);

        aluno1.imprime();
        aluno2.imprime();
        aluno3.imprime();
        professor.imprimeProfessor();
        local.imprimeEndereco();
        seminario1.imprime();
        System.out.println("----------------");
    }
}
