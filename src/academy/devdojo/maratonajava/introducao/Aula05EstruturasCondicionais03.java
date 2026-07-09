package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    static void main(String[] args) {
        // Doar se salário > 5000
        double salario = 3000;
        // (condicao) ? verdadeiro : falso

        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" :"Ainda não tenho condições, mas vou ter!";

        System.out.println(resultado);
    }
}
