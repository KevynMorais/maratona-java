package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    static void main(String[] args) {
        int idade = 13;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcoólica!");
        }

        if (!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebida alcoólica!");
        }
        boolean c = false;
        if(c = true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        System.out.println("Fora do if");
    }
}
