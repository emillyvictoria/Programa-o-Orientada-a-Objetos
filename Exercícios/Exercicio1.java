package ListaAula;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);  
        
        System.out.println("========== Salario Funcionario ========");
        
        System.out.println("Digite o salario fixo:  ");
        double salarioFixo  = sc.nextDouble();
        
        System.out.println("Digite o numero de carros vendidos no mes: ");
        int carrosVendidos = sc.nextInt();

        System.out.println("Digite a comissao por carro vendido: ");        
        double comissao = sc.nextDouble();

        System.out.println("Digite o valor total de carros vendidos no mes: ");        
        double valorTotal = sc.nextDouble();
        
       double salarioFinal = (valorTotal*0.05) + (carrosVendidos * comissao) + salarioFixo;
       System.out.println("O salario final do funcinario eh R$ "+salarioFinal);        
           
    }
}
