package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Kevyn");
        funcionario.setIdade(18);
        funcionario.setSalarios(new double[]{10000, 20000, 30000});
        funcionario.imprime();
        System.out.println("Média salarial: R$"+funcionario.getMedia());
    }
}
