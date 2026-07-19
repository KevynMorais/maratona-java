package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    public String nome;
    public int[] episodios;
    // 1 - Alocado espaço em memória para o objeto
    // 2 - Cada atributo da classe é criado e inicializado com valores default ou o que for passado
    // 3 - O bloco de inicialização é executado
    // 4 - Construtor é executado
    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }
}
