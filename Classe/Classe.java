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
                System.out.println("Campo stand de " + j1.getNome() + " não pode ficar vazio, refaça a operação.");
            } else {
                break;
            }
        }

        while (true){
            try {
                if (j1.isStatus_stand() == false){
                    System.out.println("O stand " + j1.getStand() + " está desativado.");
                    System.out.print("Deseja ativar? (0 - Não | 1 - Sim): ");
                    int resposta_status = teclado.nextInt();
                    if (resposta_status == 1){
                        j1.setStatus_stand(true);
                        System.out.println("O Stand " + j1.getStand() + " foi ativado.");
                        break;
                    } else if (resposta_status == 0){
                        System.out.println("O Stand " + j1.getStand() + " continuará inativo.");
                        break;
                    } else {
                        System.out.println("Opção inválida, digite uma das respectivas opções.");
                    }
                } else {
                    System.out.println("O stand " + j1.getStand() + " está ativado.");
                    System.out.print("Deseja desativar? (0 - Não | 1 - Sim): ");
                    int resposta_status = teclado.nextInt();
                    if (resposta_status == 1){
                        j1.setStatus_stand(false);
                        System.out.println("O Stand " + j1.getStand() + " foi desativado.");
                        break;
                    } else if (resposta_status == 0){
                        System.out.println("O Stand " + j1.getStand() + " continuará ativo.");
                        break;
                    } else {
                        System.out.println("Opção inválida, digite uma das respectivas opções.");
                    }
                }
            } catch (Exception e) {
                System.out.println("Campo deve conter apenas números inteiros, refaça a operação.");
                teclado.nextLine();
            }
        }
        
        System.out.println("");
        teclado.close();
        j1.interacao(); 
    }
    
}