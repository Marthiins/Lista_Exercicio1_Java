/*
 Faça um algoritmo que leia
dois valores para as variáveis A e B, efetue a troca dos valores de forma
que a variável A passe a possuir o valor da variável B e que a variável B
passe a possuir o valor da variável A. Apresentar os valores trocados.
 */
package lista1portugol;

import java.util.Scanner;

/**
 *
 * @author Paulo Sérgio Martins
 */
public class Lista1_Exercicio4 {

   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c;        
        Scanner leitura=new Scanner (System.in);
        System.out.println("Informe o Valor de A");
        a=leitura.nextInt();
        System.out.println("Informe o Valor de B");
        b=leitura.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("Novo Valor de A  "+a );
        System.out.println("Novo Valor de B  "+b);
     
    }
    
}


   
    
    
