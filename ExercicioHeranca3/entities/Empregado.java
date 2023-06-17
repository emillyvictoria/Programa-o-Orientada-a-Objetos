
package entities;

/**
 *
 * @author Emilly
 */
public class Empregado extends Pessoa {
    private int codigoSetor;
    protected double salarioBase;
    private double imposto;

    public Empregado(int codigoSetor, double salarioBase, double imposto, String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
    public double calcularSalario() {
     return salarioBase - (salarioBase * (imposto / 100));
  }
    
    @Override
    public String toString(){
        return """
               \nFornecedor
               Nome: """ + getNome()
                +"\nEndereco: " + getEndereco ()
                +"\nTelefone: " + getTelefone ()                
                +"\nCodigo do Setor: " + codigoSetor
                +"\nSalario Base: " + salarioBase
                +"\nImposto: " + imposto                
                +"\nSalario Final: " + calcularSalario ();
    }    
          
}    

