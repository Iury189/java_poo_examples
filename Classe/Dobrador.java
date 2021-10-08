package classe;
import javax.swing.JOptionPane;

public class Dobrador {
    
    private String nome, elemento;

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getElemento() { return elemento; }

    public void setElemento(String elemento) { this.elemento = elemento; }
    
    public void Interacao(){
        JOptionPane.showMessageDialog(null, "Meu nome é " + this.getNome() + " e o elemento que domino é " + this.getElemento(), "Mensagem", JOptionPane.INFORMATION_MESSAGE);
    }
}