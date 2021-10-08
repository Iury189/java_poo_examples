package abstracao;
import java.util.Scanner;

public class Abstracao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Moto m1 = new Moto();
        System.out.print("Digite a marca da moto: ");
        m1.setMarca(teclado.nextLine());
        System.out.print("Digite o modelo da moto: ");
        m1.setModelo(teclado.nextLine());
        System.out.print("Digite a cor da moto: ");
        m1.setCor(teclado.nextLine());
        System.out.print("Digite o ano de fabricação da moto: ");
        m1.setAno(teclado.nextInt());
        System.out.print("Digite o valor da moto: ");
        m1.setValor(teclado.nextDouble());
        System.out.println("");
        m1.Caracteristicas();
        teclado.close();
    }   
}