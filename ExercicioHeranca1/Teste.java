
package exercicioheranca1;

import entities.Peixe;
import entities.Animal;
import entities.Cachorro;


public class Teste {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 10.5);
        Peixe peixe = new Peixe("Agua Salgada", 1.0, "Fisher");
        Cachorro cachorro = new Cachorro("Pastor Alemao", 20.0, "Alemao");

        System.out.println(peixe);
        System.out.println(cachorro);
        
    }
    
}
