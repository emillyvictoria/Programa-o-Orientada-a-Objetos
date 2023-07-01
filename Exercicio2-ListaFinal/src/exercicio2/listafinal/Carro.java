
package exercicio2.listafinal;

import java.util.Scanner;
public class Carro extends Veiculo {
    private int km;

    public Carro(String modelo, double preco) {
        super(modelo, preco);
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o modelo do carro:");
        String modelo = scanner.nextLine();
        System.out.println("Digite o preco do carro:");
        double preco = scanner.nextDouble();
        System.out.println("Digite a quilometragem do carro:");
        int km = scanner.nextInt();
        scanner.nextLine();

        setKm(km);
        super.modelo = modelo;
        super.preco = preco;
    }

    public double getPreco() {
        if (km > 100000) {
            return super.getPreco() * 0.92;
        } else {
            return super.getPreco();
        }
    }
}
