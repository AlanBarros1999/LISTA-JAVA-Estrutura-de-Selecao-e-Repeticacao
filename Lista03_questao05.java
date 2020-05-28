/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaDeSelecao_Repeticao;

/**@author Alan
 * 5) Faça um programa que leia vários inteiros positivos e mostre, no
final, a soma dos números pares e a soma dos números ímpares. O
programa para quando entrar um número maior que 1000.
 */
import java.util.Scanner;

public class Lista03_questao05 {
    public static void main (String [] args){
        Scanner ler = new Scanner(System.in);
        
         int num = 0;
        int par = 0;
        int imp = 0;
        
        par = 0;
        imp = 0;
        
        
       while (num <=1000){

            System.out.println("Digite os numeros que deseja:");
            num = ler.nextInt();
                         
         if (num < 0){
            System.out.println("numero invalido");
        }
                           
            else if (num <= 1000 && num % 2 == 0){
                par = par+num;
                            }
            else if (num <= 1000 && num %2 != 0) {
                imp = imp+num;
            }
       }
            System.out.println("A sua soma dos numeros PARES:"+par);
            System.out.println("A sua soma dos numeros IMPARES:"+imp);
         
        } 
            
}