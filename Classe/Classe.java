package classe;
import java.util.Scanner;

public class Classe {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Matriz de objetos da classe Dobrador
        Dobrador[] dobradores = new Dobrador[2];
        // Instância dos objetos da classe Dobrador
        Dobrador d1 = new Dobrador();
        Dobrador d2 = new Dobrador();
        // Preenchimento de campos
        System.out.print("Digite o nome do 1° dobrador: ");
        d1.setNome(teclado.nextLine());
        System.out.print("Digite o respectivo elemento do 1° dobrador: ");
        d1.setElemento(teclado.nextLine());
        System.out.println("");
        System.out.print("Digite o nome do 2° dobrador: ");
        d2.setNome(teclado.nextLine());
        System.out.print("Digite o respectivo elemento do 2° dobrador: ");
        d2.setElemento(teclado.nextLine());
        System.out.println("");
        // Atribuir os objetos as posições do ArrayList
        dobradores[0] = d1;
        dobradores[1] = d2;
        // Impressão das informações dos elementos
        dobradores[0].Interacao();
        dobradores[1].Interacao();
    }
}