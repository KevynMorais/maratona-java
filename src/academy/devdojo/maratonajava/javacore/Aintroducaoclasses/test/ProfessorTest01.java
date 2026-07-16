package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Geraldo";
        professor.idade = 49;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " Idade: " + professor.idade + " Sexo: " + professor.sexo);
    }
}
