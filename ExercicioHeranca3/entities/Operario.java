
package entities;

/**
 *
 * @author Emilly
 */
public class Operario extends Empregado {
      private double valorProducao;
      private double comissao;

    public Operario(double valorProducao, double comissao, int codigoSetor, double salarioBase, double imposto, String nome, String endereco, String telefone) {
        super(codigoSetor, salarioBase, imposto, nome, endereco, telefone);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
  @Override
    public double calcularSalario() {
        return super.calcularSalario() + comissao;
  }

    @Override
        public String toString(){
        return """
                 \nOperario
                 Nome: """ + getNome()
                  +"\nEndereco: " + getEndereco ()
                  +"\nTelefone: " + getTelefone ()                
                  +"\nCodigo do Setor: " + getCodigoSetor ()
                  +"\nSalario Base: " + getSalarioBase ()
                  +"\nImposto: " + getImposto ()
                  +"\nValor da Producao: " + valorProducao
                  +"\nComissao: " + comissao                
                  +"\nSalario Final: " + calcularSalario ();
      } 
}
