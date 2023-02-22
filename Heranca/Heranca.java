package heranca;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Heranca {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Carro c1 = new Carro();
        while (true){
            System.out.print("Digite a marca do carro: ");
            c1.setMarca(teclado.nextLine());
            if (c1.getMarca().isEmpty() || c1.getMarca() == null){
                System.out.println("Campo marca não pode ficar vazio, refaça a operação.");
            } else {
                break;
            }
        }
        while (true){
            System.out.print("Digite o modelo do carro: ");
            c1.setModelo(teclado.nextLine());
            if (c1.getModelo().isEmpty() || c1.getModelo() == null){
                System.out.println("Campo modelo não pode ficar vazio, refaça a operação.");
            } else {
                break;
            }
        }
        while (true){
            System.out.print("Digite a cor do carro: ");
            c1.setCor(teclado.nextLine());
            if (c1.getCor().isEmpty() || c1.getCor() == null){
                System.out.println("Campo cor não pode ficar vazio, refaça a operação.");
            } else {
                break;
            }
        }
        while (true){
            try {
                System.out.print("Digite o ano de fabricação do carro: ");
                c1.setAno(Integer.parseInt(teclado.nextLine()));
                if (c1.getAno() <= 0){
                    System.out.println("Campo ano não pode ser menor ou igual a zero, refaça a operação.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Campo deve conter apenas números inteiros, refaça a operação.");
            }
        }
        while (true){
            try {
                System.out.print("Digite o valor do carro: ");
                c1.setValor(Double.parseDouble(teclado.nextLine()));
                if (c1.getValor() <= 0){
                    System.out.println("Campo valor não pode ser menor ou igual a zero, refaça a operação.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Campo deve conter apenas números decimais, refaça a operação.");
            }
        }
        System.out.println("");
        c1.caracteristicas();
        teclado.close();
        
    }
}