
package entities;

/**
 *
 * @author Emilly
 */
public class Cliente extends Pessoa{
    private double valorDivida;
    private int anoNascim;

    public Cliente(String nome, int anoNascim, String sexo, double valorDivida, int idade) {
        super(nome, idade, sexo);
        this.valorDivida = valorDivida;
        this.anoNascim = anoNascim;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public int getAnoNascim() {
        return anoNascim;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public void setAnoNascim(int anoNascim) {
        this.anoNascim = anoNascim;
    }
    
    @Override
    public String toString(){
        return """
               \nCliente
               Nome: """ + getNome()
                +"\nIdade: " + getIdade ()
                +"\nSexo: " + getSexo ()
                +"\nAno de Nascimento: " + anoNascim
                +"\nValor da Divida: " + valorDivida;
    }
    
    
}
