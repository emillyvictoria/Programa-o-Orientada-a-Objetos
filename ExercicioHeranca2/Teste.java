
package exercicioheranca2;

import entities.Cliente;
import entities.Empregado;
import entities.Gerente;
import entities.Pessoa;
import entities.Vendedor;

/**
 *
 * @author Emilly
 */
public class Teste {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25, "Masculino");

        Cliente cliente = new Cliente("Mario Jose", 1978, "Masculino", 1000.0, 45);
        System.out.println(cliente);

        Gerente gerente = new Gerente("Ana", 35, "Feminino", 3000.0, "5678", "Vendas");
        System.out.println(gerente);
        
        Vendedor vendedor = new Vendedor("Carlos", 28, "Masculino", 1500.0, "9876", (int)28, 68500.00);
        System.out.println(vendedor);
    }
    
}
