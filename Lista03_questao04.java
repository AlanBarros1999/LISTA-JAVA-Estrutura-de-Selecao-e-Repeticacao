/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaDeSelecao_Repeticao;

/**@author Alan
 * 4) Escreva um algoritmo que gera números entre 1000 e 1999 e mostra
aqueles que divididos por 11 dão resto 5.
 */
public class Lista03_questao04 {
    public static void main (String[] args){
        
        double num;
        
        for (num = 1000; num <=1999; num=num+1){
            if (num % 11 == 5){
                System.out.println(num+"Dividido por 11 dá resto 5!");
            }
        }
        
    }
    
}
