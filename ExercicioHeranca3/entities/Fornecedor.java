
package entities;

/**
 *
 * @author Emilly
 */
public class Fornecedor extends Pessoa{
      private double valorCredito;
      private double valorDivida;

    public Fornecedor(double valorCredito, double valorDivida, String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
      
    public double obterSaldo (){
        return valorCredito - valorDivida;
    }
    
    @Override
    public String toString(){
        return """
               \nFornecedor
               Nome: """ + getNome()
                +"\nEndereco: " + getEndereco ()
                +"\nTelefone: " + getTelefone ()                
                +"\nValor do Credito: " + valorCredito
                +"\nValor da divida: " + valorDivida
                +"\nSaldo Final: " + obterSaldo ();
    }    
      
}
