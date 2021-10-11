package classe;
import java.util.Scanner;

public class Classe {
    public static void main(String[] args) {
        // Habilitar captura de teclado do usuário
        Scanner teclado = new Scanner(System.in);
        // Matriz de objetos da classe Dobrador
        Dobrador[] dobrador = new Dobrador[2];
        // Laço que vai coletar os elementos
        for (int i = 0; i < dobrador.length; i++) {
            dobrador[i] = new Dobrador();
            System.out.print("Digite o nome do " + (i + 1) + "° dobrador: ");
            dobrador[i].setNome(teclado.nextLine());
            System.out.print("Digite o elemento do " + (i + 1) + "° dobrador: ");
            dobrador[i].setElemento(teclado.nextLine());
            System.out.println("");         
        }
        // Laço para exibir os resultados
        for (int i = 0; i < dobrador.length; i++) {
            dobrador[i].Interacao();
        }
    }
}
