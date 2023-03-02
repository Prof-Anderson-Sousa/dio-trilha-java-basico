/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terminalargumentos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Anderson
 */
public class AboutMe {
    public static void main(String[] args){
        // Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();
        
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();
        
        System.out.println("Ola, me chamo " + nome + " ");
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura " + altura + " cm");
    }    
}
