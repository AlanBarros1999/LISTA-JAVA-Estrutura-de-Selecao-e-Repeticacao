/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaDeSelecao_Repeticao;



/** @author Alan
 * 3) Faça um algoritmo que calcula e escreve a seguinte soma:
soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
 */

public class Lista03_questao03 {
    public static void main (String[] args){
      
        int x, y;
        double result = 0; 
        
        x = 1;
        
        for (y = 1; y <= 50; y = y+1){
            
           result = result+(x/y);
           
           
            System.out.println("Soma:"+x+"/"+y);
            x = x+2;
            System.out.println("A soma dos numeros é:"+result);
            
            
            
            
        
        }
    }
    
}
