/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Emilly
 */
import java.util.Scanner;
public class Projeto1 {
 
    public static void main(String[] args) {
        
        String pet;
        String raca;
        int idade;
        float peso;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual eh o nome do seu Pet? ");
        pet = sc.nextLine();
        System.out.println("Qual eh a raca dele? ");
        raca = sc.nextLine();
        System.out.println("Quantos anos ele tem?");
        idade = sc.nextInt();
        System.out.println("Qual eh o peso dele? ");
        peso  = sc.nextFloat();
    }
}