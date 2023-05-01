package entities;

/**
 *
 * @author Emilly
 */
public class Peixe extends Animal {
    private String tipoHabitat;


    public Peixe(String tipoHabitat, double peso, String nome) {
        super(nome, peso);
        this.tipoHabitat = tipoHabitat;
    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    @Override
    public String toString() {
        return "Peixe: " +
                "nome= " + getNome() + 
                ", peso= " + getPeso() + "kg" +
                ", Habitat= " + tipoHabitat ;
    }
}    
