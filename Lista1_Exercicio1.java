/*
Entre com o primeiro número:
Entre com o segundo número:
Soma: valor
Diferença: valor
Produto: valor
Media: valor
 */
package lista1portugol;

import java.util.Scanner;

/**
 *
 * @author Paulo Sérgio Martins
 */
public class Lista1_Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2;
        Scanner leitura = new Scanner(System.in);
        
        System.out.println("Entre com o Primeiro Numero:");
        num1 = leitura.nextInt();
        System.out.println("Entre com o Segundo Numero:");
        num2 = leitura.nextInt();
        System.out.println("Soma "+(num1+num2));
        System.out.println("Diferença "+(num1-num2));
        System.out.println("Produto "+(num1*num2));
        System.out.println("Media "+((num1+num2)/2));
        
       
    }
    
}

        
  
