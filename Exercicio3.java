
package ListaAula;

import java.util.Scanner;

/**
 *
 * @author Emilly
 */

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        char olhos, cabelos, sexo;
        double salario;
        int countParticipantes = 0;
        int caracteristicas = 0;

        System.out.println("========== Pesquisa Populacional ========");

        System.out.println("Informe a Idade entre 10 e 100 anos (-1 para sair):");
        idade = sc.nextInt();
        while (idade != -1) {
            if (idade < 10 || idade > 100) {
                System.out.println("Idade inválida! Digite novamente.");
                System.out.println("Informe a Idade entre 10 e 100 anos (-1 para sair):");
                idade = sc.nextInt();
                continue;
            }
            sc.nextLine(); // Consome a quebra de linha pendente
            System.out.println("Informe o Sexo (m ou f): ");
            sexo = sc.nextLine().charAt(0);
            if (sexo != 'm' && sexo != 'f') {
                System.out.println("Sexo inválido! Digite novamente.");
                System.out.println("Informe o Sexo (m ou f): ");
                sexo = sc.nextLine().charAt(0);
                continue;
            }
            System.out.println("Informe o salario: ");
            salario = sc.nextDouble();
            if (salario < 0) {
                System.out.println("Salario inválido! Digite novamente.");
                System.out.println("Informe o salario: ");
                salario = sc.nextDouble();
                continue;
            }
            sc.nextLine(); // Consome a quebra de linha pendente
            System.out.println("Informe a cor dos olhos (A- azuis/ V-verdes/ C-castanhos/ P-pretos):");
            olhos = sc.nextLine().charAt(0);
            if (olhos != 'a' && olhos != 'v' && olhos != 'c' && olhos != 'p') {
                System.out.println("Cor inválida! Digite novamente.");
                System.out.println("Informe a cor dos olhos (A- azuis/ V-verdes/ C-castanhos/ P-pretos):");
                olhos = sc.nextLine().charAt(0);
                continue;
            }
            System.out.println("Informe a cor do cabelo (L-loiros/ C-castanhos/ R-ruivos/ P-pretos):");
            cabelos = sc.nextLine().charAt(0);
            if (cabelos != 'l' && cabelos != 'c' && cabelos != 'p' && cabelos != 'r') {
                System.out.println("Cor inválida! Digite novamente.");
                System.out.println("Informe a cor do cabelo (L-loiros/ C-castanhos/ R-ruivos/ P-pretos):");
                cabelos = sc.nextLine().charAt(0);
                continue;
            }
            countParticipantes++;
            if (sexo == 'f' && idade >= 18 && idade <= 35 && olhos == 'c' && cabelos == 'c') {
                caracteristicas++;
            }
            System.out.println("Informe a Idade entre 10 e 100 anos (-1 para sair):");
            idade = sc.nextInt();
        }
        double porcentagem = ((double) caracteristicas / countParticipantes) * 100;
        System.out.println("A porcentagem de mulheres com cabelos e olhos castanhos, entre 18 e 35 anos na pesquisa eh de: " + porcentagem + "%");
    }
}
