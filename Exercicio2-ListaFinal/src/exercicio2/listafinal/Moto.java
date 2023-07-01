
package exercicio2.listafinal;
import java.util.Scanner;

public class Moto extends Veiculo {
    private int ano;

    public Moto(String modelo, double preco) {
        super(modelo, preco);
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o modelo da moto:");
        String modelo = scanner.nextLine();
        System.out.println("Digite o preço da moto:");
        double preco = scanner.nextDouble();
        System.out.println("Digite o ano da moto:");
        int ano = scanner.nextInt();
        scanner.nextLine(); 

        setAno(ano);
        super.modelo = modelo;
        super.preco = preco;
    }

    public double getPreco() {
        if (ano >= 2008) {
            return super.getPreco() * 1.10;
        } else {
            return super.getPreco();
        }
    }
}
