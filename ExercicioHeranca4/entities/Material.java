
package entities;

/**
 *
 * @author Emilly
 */
public class Material extends Ferramenta{
 private String material;

    public Material(String material, String tipo, int codigo, String nome, double preco) {
        super(tipo, codigo, nome, preco);
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    } 
    @Override
        public String toString(){
            return "Material: " + material;
        }
    
}
