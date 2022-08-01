package abstracao;

import java.util.Scanner;

public class Abstracao {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Moto m1 = new Moto();
        while (true){
            System.out.print("Digite a marca da moto: ");
            m1.setMarca(teclado.nextLine());
            if (m1.getMarca().isEmpty() || m1.getMarca() == null){
                System.out.println("Campo marca não pode ficar vazio, refaça a operação.");
            } else {
                break;
            }
        }
        while (true){
            System.out.print("Digite o modelo da moto: ");
            m1.setModelo(teclado.nextLine());
            if (m1.getModelo().isEmpty() || m1.getModelo() == null){
                System.out.println("Campo modelo não pode ficar vazio, refaça a operação.");
            } else {
                break;
            }
        }
        while (true){
            System.out.print("Digite a cor da moto: ");
            m1.setCor(teclado.nextLine());
            if (m1.getCor().isEmpty() || m1.getCor() == null){
                System.out.println("Campo cor não pode ficar vazio, refaça a operação.");
            } else {
                break;
            }
        }
        while (true){
            try {
                System.out.print("Digite o ano de fabricação da moto: ");
                m1.setAno(Integer.parseInt(teclado.nextLine()));
                if (m1.getAno() <= 0){
                    System.out.println("");
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
                System.out.print("Digite o valor da moto: ");
                m1.setValor(Double.parseDouble(teclado.nextLine()));
                if (m1.getValor() <= 0){
                    System.out.println("");
                    System.out.println("Campo valor não pode ser menor ou igual a zero, refaça a operação.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Campo deve conter apenas números decimais, refaça a operação.");
            }
        }
        System.out.println("");
        m1.caracteristicas();
        teclado.close();
        
    }
}