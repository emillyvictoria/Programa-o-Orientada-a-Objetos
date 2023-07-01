
package exercicio1.listafinal;

import java.util.Scanner;

public class CD extends Midia {
    private int nMusicas;

    public CD() {
        super();
        nMusicas = 0;
    }

    public CD(int codigo, double preco, String name, int nMusicas) {
        super(codigo, preco, name);
        this.nMusicas = (nMusicas > 0) ? nMusicas : 0;
    }

    @Override
    public String getTipo() {
        return "CD: ";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + "Numero de musicas: " + nMusicas + "\n";
    }

    public void setMusica(int nMusicas) {
        this.nMusicas = (nMusicas > 0) ? nMusicas : 0;
    }

    @Override
    public void inserirDados() {
        super.inserirDados();
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o numero de musicas: ");
        int nMusicas = in.nextInt();
        setMusica(nMusicas);
    }
}
