package classe;
import java.util.Scanner;

public class Classe {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        JoJo j1 = new JoJo();
        while(true){
            System.out.print("Digite seu nome: ");
            String j1_nome = teclado.nextLine();
            if (j1_nome.isEmpty()){
                System.out.print("O nome não pode ficar vazio, refaça corretamente a operação.\n");
            } else {
                j1.setNome(teclado.nextLine());
                break;
            }       
        }
        while(true){
            System.out.print("Digite o stand de " + j1.getNome() + ": ");
            String j1_stand = teclado.nextLine();
            if (j1_stand.isEmpty()){
                System.out.print("O stand de " + j1.getNome() + " não pode ficar vazio, refaça corretamente a operação.\n");   
            } else {
                j1.setStand(teclado.nextLine());
                break;
            }  
        }
        j1.Interacao();
    }
}