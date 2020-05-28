/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaDeSelecao_Repeticao;

import java.util.Scanner;

/**2) Faça um programa algoritmo para exibir a tabuada de 0 a 9.
 *
 * @author Alan
 */
public class Lista03_questao02 {
public static void main (String [] args){
     Scanner ler = new Scanner(System.in);
     int tabuada,result, num; 
     
     System.out.println("Digite um numero para a tabuada:");
     num = ler.nextInt();
     
     for ( tabuada = 0; tabuada <= 10; tabuada =tabuada+1){
     result = num*tabuada;
     System.out.println(num + "x" + tabuada + "="+result);
     }
     
     
      
  }  
}
