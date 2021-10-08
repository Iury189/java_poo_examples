package classe;
import javax.swing.JOptionPane;

public class Classe {
    public static void main(String[] args) {
        String nome1, nome2, dobr1, drob2;
        // Matriz de objetos da classe Dobrador
        Dobrador[] dobradores = new Dobrador[2];
        // Instância dos objetos da classe Dobrador
        Dobrador d1 = new Dobrador();
        Dobrador d2 = new Dobrador();
        // Preenchimento de campos
        nome1 = JOptionPane.showInputDialog("Digite o nome do 1° dobrador: ");
        d1.setNome(nome1);
        dobr1 = JOptionPane.showInputDialog("Digite o respectivo elemento do 1° dobrador: ");
        d1.setElemento(dobr1);
        nome2 = JOptionPane.showInputDialog("Digite o nome do 2° dobrador: ");
        d2.setNome(nome2);
        drob2 = JOptionPane.showInputDialog("Digite o respectivo elemento do 2° dobrador: ");
        d2.setElemento(drob2);
        // Atribuir os objetos as posições do ArrayList
        dobradores[0] = d1;
        dobradores[1] = d2;
        // Impressão das informações dos elementos
        dobradores[0].Interacao();
        dobradores[1].Interacao();
    }
}