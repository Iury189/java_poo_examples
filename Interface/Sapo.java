package pkginterface;

public class Sapo implements IPresa, IPredador {

    @Override
    public void fugir() {
        System.out.println("O sapo está fugindo da águia.");
    }

    @Override
    public void cacar() {
        System.out.println("O sapo está caçando o garfanhoto.");
    }
    
}
