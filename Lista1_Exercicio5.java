/*
Faça um algoritmo  que
efetue a leitura de um número inteiro e apresente o resultado do
quadrado deste número.
 */
package lista1portugol;

import java.util.Scanner;

/**
 *
 * @author Paulo Sergio Martins
 */
public class Lista1_Exercicio5 {
    
 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitura=new Scanner(System.in);
        int q;
        System.out.println("Informe um Numero");
        q=leitura.nextInt();
        System.out.println("O Quadradrado é "+Math.pow(q,2));
        
      
    }
    
}

