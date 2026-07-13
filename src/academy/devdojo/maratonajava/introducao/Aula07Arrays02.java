package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    static void main(String[] args) {
        // byte, short, int, long, float, double = 0
        // char '\u0000' ' '
        // boolean false
        // String null

        String [] nomes = new String[4];
        nomes[0] = "João";
        nomes[1] = "Maria";
        nomes[2] = "Lúcio";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
        nomes = new String[5];

    }
}
