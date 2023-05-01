
package entities;

/**
 *
 * @author Emilly
 */
public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    public Vendedor(double valorVendas, int codigoSetor, double salarioBase, double imposto, double comissao, String nome, String endereco, String telefone) {
        super(codigoSetor, salarioBase, imposto, nome, endereco, telefone);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override    
    public double calcularSalario () {
        return salarioBase + comissao;
    }
    
    @Override
    public String toString(){
        return """
               \nVendedor
               Nome: """ + getNome()
                +"\nEndereco: " + getEndereco ()
                +"\nTelefone: " + getTelefone ()                
                +"\nCodigo do Setor: " + getCodigoSetor ()
                +"\nSalario Base: " + getSalarioBase ()
                +"\nImposto: " + getImposto ()
                +"\nValor das Vendas: " + valorVendas
                +"\nComissao: " + comissao
                +"\nSalario Final: " + calcularSalario ();
    } 
}
