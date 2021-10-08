package pkginterface;

public class Interface {

    public static void main(String[] args) {
        Garfanhoto coelho = new Garfanhoto();
        Sapo sapo = new Sapo();
        Aguia aguia = new Aguia();
        
        coelho.Fugir();
        sapo.Fugir();
        sapo.Cacar();
        aguia.Cacar();
        
    }
    
}