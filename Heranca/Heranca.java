package Heranca;
import java.util.Scanner;

public class Heranca {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Carro carro = new Carro();
        System.out.print("Digite a marca do carro: ");
        carro.setMarca(teclado.nextLine());
        System.out.print("Digite o modelo do carro: ");
        carro.setModelo(teclado.nextLine());
        System.out.print("Digite a cor do carro: ");
        carro.setCor(teclado.nextLine());
        System.out.print("Digite o ano de fabricação do carro: ");
        carro.setAno(teclado.nextInt());
        System.out.print("Digite o valor do carro: ");
        carro.setValor(teclado.nextDouble());
        System.out.println("");
        carro.Interacao();
    }   
}