
package exercicio2.listafinal;


public class Veiculo {
    protected String modelo;
    protected double preco;

    public Veiculo(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void printDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preco: " + preco);
    }
}
