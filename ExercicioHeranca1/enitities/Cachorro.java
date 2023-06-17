package entities;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String raca, double peso, String nome) {
        super(nome, peso);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    @Override
    public String toString() {
        return "Cachorro: " +
                "nome= " + getNome() + 
                ", peso= " + getPeso() +  "kg" +
                ", raca= " + raca;
    }
}    
  
