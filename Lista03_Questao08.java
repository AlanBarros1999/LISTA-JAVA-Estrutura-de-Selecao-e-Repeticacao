/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaDeSelecao_Repeticao;

import java.util.Scanner;

/**8) Faça um programa que leia um número n e mostre na tela os n
primeiros números pares e depois os n primeiros números ímpares.
 *
 * @author Alan
 */
public class Lista03_Questao08 {
    public static void main (String [] args){
        Scanner ler = new Scanner (System.in);
            int num;
            int pares;
            int impares;
            int i;
    System.out.println("Digite um numero:");
    num = ler.nextInt();
    System.out.println("Digite quantos nuemros pares deseja");    
    pares = ler.nextInt();
    System.out.println("Digite quantos nuemros impares deseja"); 
    impares = ler.nextInt();
    
        if (pares<num & impares<num){
           
            System.out.println("Os"+pares+"primeiros pares sÃ£o:");
        
        for ( i = 2; i <= pares*2; i =i+2){
           System.out.println(i);          
        }
        System.out.println("Os"+impares+"primeiros impares sÃ£o:");
        for (i = 1; i < impares*2;i=i+2){
            System.out.println(i);
        }       
        }else {
              System.out.println("O numero maximo Ã© menor que os numeros desejados!");  
                }
    
    }
    
}
