package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios = new double[3];

    public void imprime() {
        if (salarios == null) {
            return;
        }
        int contador = 0;
        System.out.println("------------------");
        System.out.println("   APRESENTAÇÃO");
        System.out.println("------------------");
        System.out.println("Nome do funcionário: " + this.nome);
        System.out.println("Idade do funcionário: " + this.idade);
        for (double s : salarios) {
            contador += 1;
            System.out.println(contador + "º Salário: R$" + s);
        }
        double resultado = mediaSalarios();
        System.out.println("Média dos salários: R$" + resultado + "\n------------------");
    }

    public double mediaSalarios() {
        if (salarios == null) {
            return 0;
        } else {

            double somaSalarios = 0;

            for (double salario : salarios) {
                somaSalarios += salario;

            }
            return somaSalarios / salarios.length;
        }
    }
}