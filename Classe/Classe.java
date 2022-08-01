package classe;
import java.util.Scanner;

public class Classe {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        JoJo j1 = new JoJo();
        while (true){
            System.out.print("Digite seu nome: ");
            j1.setNome(teclado.nextLine());
            if (j1.getNome().isEmpty() || j1.getNome() == null){
                System.out.println("Campo nome não pode ficar vazio, refaça a operação.");
            } else {
                break;
            }
        }
        while (true){
            System.out.print("Digite o stand de " + j1.getNome() + ": ");
            j1.setStand(teclado.nextLine());
            if (j1.getStand().isEmpty() || j1.getStand() == null){
                System.out.println("Campo stand não pode ficar vazio, refaça a operação.");
            } else {
                break;
            }
        }
        j1.interacao(); 
    }
    
}