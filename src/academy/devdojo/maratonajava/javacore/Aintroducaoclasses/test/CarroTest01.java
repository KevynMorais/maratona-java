package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Toyota";
        carro01.modelo = "Hilux";
        carro01.ano = 2018;

        carro02.nome = "Fiat";
        carro02.modelo = "Uno";
        carro02.ano = 2005;

        System.out.println("Carro 01");
        System.out.println("Nome: " + carro01.nome + " | Modelo: " + carro01.modelo + " | Ano: " + carro01.ano+"\n");
        System.out.println("---------------");
        System.out.println("\nCarro 02");
        System.out.println("Nome: " + carro02.nome + " | Modelo: " + carro02.modelo + " | Ano: " + carro02.ano);
    }
}
