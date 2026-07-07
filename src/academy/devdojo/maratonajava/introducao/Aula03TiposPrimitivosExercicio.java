package academy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicio {
    static void main(String[] args) {
        String nome = "Kevyn";
        String endereco = "Rua Brasileira, Nº 1999";
        double salario = 2000.00;
        String dataRecebimentoSalario = "25/05/2025";
        String relatorio = "Eu "+nome+", morando no endereço "
                +endereco+", confirmo que recebi o salário de R$"+salario+
                ", na data "+dataRecebimentoSalario;

        System.out.println(relatorio);
    }
}
