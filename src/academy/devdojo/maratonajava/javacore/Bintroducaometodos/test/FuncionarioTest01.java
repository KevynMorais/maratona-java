package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Kevyn";
        funcionario.idade = 18;
        funcionario.salarios = new double[]{10000, 20000, 30000};

        funcionario.imprime();
    }
}
