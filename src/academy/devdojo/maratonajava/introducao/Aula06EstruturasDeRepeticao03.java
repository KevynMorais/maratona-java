package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    // Imprima os primeiros 25 números de um determinado valor. Por exemplo, 50.
    static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++){
            if (i>25){
                break;
            }
            System.out.println(i);
        }
    }
}
