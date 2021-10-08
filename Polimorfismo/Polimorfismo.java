package polimorfismo;
import java.util.Scanner;

public class Polimorfismo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Dante dante = new Dante();
        Nero nero = new Nero();
        System.out.print("Qual a espada de Dante? ");
        dante.sword = teclado.nextLine();
        System.out.print("Qual as armas de Dante? ");
        dante.guns = teclado.nextLine();
        System.out.print("Qual a espada de Nero? ");
        nero.sword = teclado.nextLine();
        System.out.print("Qual a arma de Nero? ");
        nero.guns = teclado.nextLine();
        System.out.println("");
        System.out.println("A espada de Dante é " + dante.sword + " e as armas são " + dante.guns);
        dante.Falar();
        System.out.println("A espada de Nero é " + nero.sword + " e as armas são " + nero.guns);
        nero.Falar();
    }  
}