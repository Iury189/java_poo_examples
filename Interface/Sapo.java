package pkginterface;

public class Sapo implements Presa, Predador {

    @Override
    public void Fugir() {
        System.out.println("O sapo está fugindo da águia.");
    }

    @Override
    public void Cacar() {
        System.out.println("O sapo está caçando o garfanhoto.");
    }
    
}