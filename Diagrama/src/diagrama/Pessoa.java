
package diagrama;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    //atributos da lista de objetos telefone
    private ArrayList<Telefone> telefones;
    //atributo endereco do tipo Endereco;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(ArrayList<Telefone> telefones) {
        this.telefones = telefones;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public void imprimir(){
    //imprimir informações
        System.out.println("Nome: "+getNome());
        System.out.println("CPF: "+getCpf());
        System.out.println("E-mail: "+getEmail());
        //imprimir informaçoes de endereco
        getEndereco().imprimirEndereco();
        for(int i= 0; i<getTelefones().size(); i++){
            getTelefones().get(i).imprimirTelefone();
        }
        
    }
    
    
}
