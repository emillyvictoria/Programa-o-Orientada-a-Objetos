
package exercicioheranca4;
 
import entities.Ferramenta;
import entities.Material;
import entities.Produto;

/**
 *
 * @author Emilly
 */
public class Teste {
    public static void main(String[] args) {
        Produto produto = new Produto (8897,"Martelo Tramontina",79.90);
        Ferramenta ferramenta =  new Ferramenta ("Martelo", 8897, "Tramontina", 79.90);
        Material material =  new Material ("Aco Madeirado", "Martelo", 8897,"Martelo Tramontina",79.90);
        
        System.out.println(produto);    
        System.out.println(ferramenta); 
        System.out.println(material);     
         
    }
    
}
