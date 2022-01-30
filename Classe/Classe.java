package classe;
import java.util.Scanner;

public class Classe {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        JoJo j1 = new JoJo();
        System.out.print("Digite seu nome: ");
        j1.setNome(teclado.nextLine());
        System.out.print("Digite o stand de " + j1.getNome() + ": ");
        j1.setStand(teclado.nextLine());
        j1.Interacao();
    }
}
