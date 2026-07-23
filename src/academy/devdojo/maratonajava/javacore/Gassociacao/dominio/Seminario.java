package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public void imprime(){
        System.out.println("----------------");
        System.out.println("Bem vindos ao seminário de "+titulo+"!");
        System.out.print("\nSegue a lista dos alunos participantes do seminário: ");
        if (alunos == null) return;
        for(Aluno aluno: alunos){
            System.out.print(aluno.getNome()+" ");
        }
        System.out.print("\nSegue o local de realização do seminário: ");
        if (local != null){
            System.out.print(local.getEndereco()+"\n");
        }
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
