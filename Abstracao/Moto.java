package abstracao;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Moto extends Veiculo {
    
    @Override
    public void caracteristicas() {
        String formato_real = NumberFormat.getCurrencyInstance().format(this.getValor());
        DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        ZoneId zona = ZoneId.systemDefault(); 
        System.out.println("Olá, sou uma moba.");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ano de fabricação: " + this.getAno());
        System.out.println("Valor: " + formato_real);
        System.out.println("Data da compilação: " + data.format(LocalDateTime.now()));
        System.out.println("Local da compilação: " + zona);
    }
    
}