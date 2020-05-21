/*
calcular e apresentar o valor do volume de uma lata de óleo, utilizando a
equação: Volume = PI * raio2 * altura.
 */
package lista1portugol;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author Paulo Sérgio Martins
 */
public class Lista1_Exercicio3 {
    
     public static void main(String[] args) {
        
    double altura,volume,raio, tac;
    Scanner leitura = new Scanner(System.in);
    System.out.println("Informe a altura da Lata");
    altura=leitura.nextDouble();
    System.out.println("Informe o raio da Lata");
    raio=leitura.nextDouble();
    volume=(PI*Math.pow(raio, 2)*altura);
    tac = volume/100;
    System.out.println(tac);

}
}
    

