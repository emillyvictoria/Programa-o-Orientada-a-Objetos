
package exercicio2.listafinal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteVeiculo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Veiculo> veiculos = new ArrayList<>();

        while (true) {
            System.out.println("Digite 1 para inserir uma moto, 2 para inserir um carro ou 'sair' para finalizar:");
            String opcao = scanner.nextLine();

            if (opcao.equalsIgnoreCase("sair")) {
                break;
            }

            if (opcao.equals("1")) {
                Moto moto = new Moto("Moto", 0);
                moto.insertData();
                veiculos.add(moto);
            } else if (opcao.equals("2")) {
                Carro carro = new Carro("Carro", 0);
                carro.insertData();
                veiculos.add(carro);
            } else {
                System.out.println("Opcao invalida. Tente novamente.");
            }
        }

        double totalAntes = 0;
        double totalDepois = 0;

        System.out.println("Relatorio de veiculos cadastrados:");
        for (Veiculo veiculo : veiculos) {
            veiculo.printDados();
            totalAntes += veiculo.getPreco();
            double precoAtual = veiculo.getPreco();
            if (precoAtual != veiculo.getPreco()) {
                System.out.println("Preço reajustado: " + precoAtual);
            }
            totalDepois += precoAtual;
        }

        System.out.println("Total preco reajustado: " + totalDepois);
    }
}
