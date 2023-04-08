package ListaAula;
import java.util.Scanner;
/**
 *
 * @author Emilly
 */
public class Exercicio2 {
 public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        System.out.println("========== MENU =========");
        
        System.out.println("Escolha um prato: ");
        System.out.println("1 - Vegetariano");
        System.out.println("2 - Peixe");
        System.out.println("3 - Frango");
        System.out.println("4 - Carne");
        int prato = sc.nextInt();

        System.out.println("Escolha uma sobremesa: ");
        System.out.println("1 - Abacaxi");
        System.out.println("2 - Sorvete diet");
        System.out.println("3 - Mousse diet");
        System.out.println("4 - Mousse chocolate");
        int sobremesa = sc.nextInt();

        System.out.println("Escolha uma bebida: ");
        System.out.println("1 - Cha");
        System.out.println("2 - Suco de laranja");
        System.out.println("3 - Suco de melao");
        System.out.println("4 - Refrigerante diet");
        int bebida = sc.nextInt();
        
        int countCalorias = 0;
        switch (prato){
            case 1:
                countCalorias += 180;
                break;
            case 2:
                countCalorias += 230;
                break;
            case 3:
                countCalorias += 250;
                break;
            case 4:
                countCalorias += 350;
                break;
            default:
                System.out.println("Opcao de prato invalida.");
        }
        
        switch (sobremesa) {
            case 1:
                countCalorias += 75;
                break;
            case 2:
                countCalorias += 110;
                break;
            case 3:
                countCalorias += 170;
                break;
            case 4:
                countCalorias += 200; 
            default:
                System.out.println("Opcao de sobremesa invalida.");
        }
        
        switch (bebida) {
            case 1:
                countCalorias += 20;
                break;
            case 2:
                countCalorias += 70;
                break;
            case 3:
                countCalorias += 100;
                break;
            case 4:
                countCalorias += 65; 
            default:
                System.out.println("Opcao de bebida invalida.");
        }
        System.out.printf("O menu escolhida possui %d calorias.%n", countCalorias);
               
 }
    
}
