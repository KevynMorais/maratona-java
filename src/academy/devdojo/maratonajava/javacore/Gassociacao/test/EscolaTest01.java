package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    static void main(String[] args) {
        Professor professor1 = new Professor("Geraldo");
        Professor professor2 = new Professor("Kaká");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("A Nova Geração", professores);
        escola.imprime();
    }
}
