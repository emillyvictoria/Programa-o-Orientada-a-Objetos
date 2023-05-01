
package exercicioheranca3;

import entities.Operario;

/**
 *
 * @author Emilly
 */
public class TesteOperario {

    public static void main(String[] args) {
        Operario operario = new Operario (280.00, 550.00, 1447, 3600.00, 0.20, "Marcos Paulo", "Avenida 09 de Dezembro", "61996853472");
        System.out.println(operario);
    }
    
}
