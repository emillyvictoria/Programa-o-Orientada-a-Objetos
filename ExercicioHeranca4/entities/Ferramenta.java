
package entities;

/**
 *
 * @author Emilly
 */
public class Ferramenta extends Produto {
    private String tipo;

    public Ferramenta(String tipo, int codigo, String nome, double preco) {
        super(codigo, nome, preco);
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
        public String toString(){
            return "Tipo: " + tipo;
        }
}
