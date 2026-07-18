package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios = new double[3];
    private double media;

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
            for (double salario : salarios) {
                media += salario;
            }
            media /= salarios.length;
            return media;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}