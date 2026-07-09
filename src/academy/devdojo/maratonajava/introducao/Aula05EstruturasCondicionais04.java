package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraFaixa = 0.097;
        double segundaFaixa = 0.3735;
        double terceiraFaixa = 0.495;
        double taxa;
        if (salarioAnual <= 34_712){
            taxa = salarioAnual * primeiraFaixa;
        }else if (salarioAnual > 34_712 && salarioAnual <= 68_507){
            taxa = salarioAnual * segundaFaixa;
        }else {
            taxa = salarioAnual * terceiraFaixa;
        }
        System.out.println("Ganhando o salario de "+salarioAnual+" euros, você pagará uma taxa de "+taxa+" euros.");
    }
}
