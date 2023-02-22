package pkginterface;

public class Interface {

    public static void main(String[] args) {
        
        Garfanhoto garfanhoto = new Garfanhoto();
        Sapo sapo = new Sapo();
        Aguia aguia = new Aguia();
        
        garfanhoto.fugir();
        sapo.fugir();
        sapo.cacar();
        aguia.cacar();
        
    }
    
}
