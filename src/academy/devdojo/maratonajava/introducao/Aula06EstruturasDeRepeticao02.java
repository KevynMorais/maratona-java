package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    static void main(String[] args) {
        int count = 0;
        while (count <= 1000000){
            System.out.println(count);
            count += 2;
        }

        count = 0;

        do{
            System.out.println(count);
            count += 2;
        }while (count <= 1000000);

        // Imprima todos os números pares de 0 até 1000000
        for(int i=0; i <= 1000000; i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
