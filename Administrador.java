
package entities;

/**
 *
 * @author Emilly
 */
  public class Administrador extends Empregado {
    private double ajudaDeCusto;

    public Administrador(double ajudaDeCusto, int codigoSetor, double salarioBase, double imposto, String nome, String endereco, String telefone) {
        super(codigoSetor, salarioBase, imposto, nome, endereco, telefone);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
      return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
      this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
        public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
      }  
    @Override
        public String toString(){
        return """
                 \nAdministrador
                 Nome: """ + getNome()
                  +"\nEndereco: " + getEndereco ()
                  +"\nTelefone: " + getTelefone ()                
                  +"\nCodigo do Setor: " + getCodigoSetor ()
                  +"\nSalario Base: " + getSalarioBase ()
                  +"\nImposto: " + getImposto ()
                  +"\nAjuda de Custo: " + ajudaDeCusto
                  +"\nSalario Final: " + calcularSalario ();
      }   
    
}
