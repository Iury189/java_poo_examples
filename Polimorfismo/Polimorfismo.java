package polimorfismo;
import java.util.Scanner;

public class Polimorfismo {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Dante dante = new Dante();
        Nero nero = new Nero();
        while (true){
            System.out.print("Qual a espada de Dante? ");
            dante.sword = teclado.nextLine();
            if (dante.sword.isEmpty() || dante.sword == null){
                System.out.println("A espada de Dante precisa de um nome, refaça a operação.");
            } else {
                break;
            }
        }
        while (true){
            System.out.print("Qual as armas de Dante? ");
            dante.guns = teclado.nextLine();
            if (dante.guns.isEmpty() || dante.guns == null){
                System.out.println("A armas de Dante precisam de um nome, refaça a operação.");
            } else {
                break;
            }
        }
        while (true){
            System.out.print("Qual a espada de Nero? ");
            nero.sword = teclado.nextLine();
            if (nero.sword.isEmpty() || nero.sword == null){
                System.out.println("A espada de Nero precisa de um nome, refaça a operação.");
            } else {
                break;
            }
        }
        while (true){
            System.out.print("Qual a arma de Nero? ");
            nero.guns = teclado.nextLine();
            if (nero.guns.isEmpty() || nero.guns == null){
                System.out.println("A arma de Nero precisa de um nome, refaça a operação.");
            } else {
                break;
            }
        }
        System.out.println("");
        System.out.println("A espada de Dante é " + dante.sword + " e as armas são " + dante.guns);
        dante.falar();
        System.out.println("A espada de Nero é " + nero.sword + " e a arma é " + nero.guns);
        nero.falar();
       
    } 
}
