package classe;

public class JoJo {
    
    private String nome, stand;
    private boolean status_stand = false;
    
    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getStand() { return stand; }

    public void setStand(String stand) { this.stand = stand; }

    public boolean isStatus_stand() { return status_stand; }

    public void setStatus_stand(boolean status_stand) { this.status_stand = status_stand; } 

    public void AtivarStand(){
        if (this.isStatus_stand()){
           System.out.println(this.getStand() + " já está invocado.");
        } else {
           this.setStatus_stand(true);
           System.out.println(this.getStand() + " foi invocado.");
        } 
    }
    
    public void DesativarStand(){
        if (this.isStatus_stand() == false){
           System.out.println(this.getStand() + " já está oculto.");
        } else {
           this.setStatus_stand(false);
           System.out.println(this.getStand() + " foi ocultado.");
        } 
    }
    
    public void Interacao(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Stand: " + this.getStand());
        System.out.println("Status do stand: " + (this.isStatus_stand() ? "Ativo" : "Inativo"));
        if (this.isStatus_stand() == true){
            AtivarStand();
        } else {
            DesativarStand();
        }
    }
}
