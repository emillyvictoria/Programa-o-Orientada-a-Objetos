
package diagrama;
import java.util.ArrayList;
import java.util.Scanner;
public class Diagrama {


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        Curso curso;
        ArrayList<Curso> cursos;
        
        Aluno aluno = new Aluno();
        ArrayList<Double>notas = new ArrayList<>();
        
        Telefone telefone;
        ArrayList<Telefone> telefones;
        
        Professor novoProf = new Professor();
        Endereco endereco;
        
        System.out.println("---------Cadastro do Professor--------");
        System.out.println("Digite o nome do professor: ");
        novoProf.setNome(sc.nextLine());
        System.out.println("Digite o email do professor: ");
        novoProf.setEmail(sc.nextLine());
        System.out.println("Digite o cpf do professor: ");
        novoProf.setCpf(sc.nextLine());
        
        endereco = new Endereco();
        System.out.println("Digite a Rua:");
        endereco.setRua(sc.nextLine());
        System.out.println("Digite a Cidade:");
        endereco.setRua(sc.nextLine());
        System.out.println("Digite o Estado:");
        endereco.setRua(sc.nextLine());
        
        novoProf.setEndereco(endereco);
        
        telefones = new ArrayList<>();
        System.out.println("Digite os telefones do professor - maximo 2");
        for (int i = 0; i < 2; i++){
            telefone = new Telefone();
            System.out.println("Digite o tipo de telefone: ");
            telefone.setTipo(sc.nextLine());
            System.out.println("Digite o DDD: ");
            telefone.setDdd(sc.nextLine());
            System.out.println("Digite o numero: ");
            telefone.setNumero(sc.nextLine()); 
            
            telefones.add(telefone);
        }
        novoProf.setTelefones(telefones);
        
        System.out.println("Digite a titulacao: ");
        novoProf.setTitulacao(sc.nextLine());
        System.out.println("Digite o salario: ");
        novoProf.setSalario(sc.nextDouble());
        
        sc.nextLine();
        cursos = new ArrayList<>();
        System.out.println("Digite os cursos do professor - maximo 2");
        for (int i = 0; i < 2; i++){
            curso = new Curso();
            System.out.println("Digite o nome dos cursos: ");
            curso.setNome(sc.nextLine());
            cursos.add(curso);
        }
        
         novoProf.setCursos(cursos);
         
         
        System.out.println("---------Cadastro do Aluno--------");
        System.out.println("Digite o nome do Aluno: ");
        novoProf.setNome(sc.nextLine());
        System.out.println("Digite o email do Aluno: ");
        novoProf.setEmail(sc.nextLine());
        System.out.println("Digite o cpf do Aluno: ");
        aluno.setCpf(sc.nextLine());
        
        endereco = new Endereco();
        System.out.println("Digite a Rua:");
        endereco.setRua(sc.nextLine());
        System.out.println("Digite a Cidade:");
        endereco.setRua(sc.nextLine());
        System.out.println("Digite o Estado:");
        endereco.setRua(sc.nextLine());
        
        aluno.setEndereco(endereco);
        
        telefones = new ArrayList<>();
        System.out.println("Digite os telefones do aluno - maximo 2");
        for (int i = 0; i < 2; i++){
            telefone = new Telefone();
            System.out.println("Digite o tipo de telefone: ");
            telefone.setTipo(sc.nextLine());
            System.out.println("Digite o DDD: ");
            telefone.setDdd(sc.nextLine());
            System.out.println("Digite o numero: ");
            telefone.setNumero(sc.nextLine()); 
            
            telefones.add(telefone);
        }
        aluno.setTelefones(telefones);

        curso = new Curso();
        System.out.println("Digite o curso do Aluno");
         curso.setNome(sc.nextLine());
      
        
         aluno.setCurso(curso);    
         
        System.out.println("Digite as notas do Aluno: ");
        for (int i = 0; i < 2; i++){
            notas.add(sc.nextDouble());
        }
        
        aluno.setNotas(notas);
        
        //impressao
        novoProf.imprimir();
        aluno.imprimir();
        
        
        
        
         
    }
    
}
