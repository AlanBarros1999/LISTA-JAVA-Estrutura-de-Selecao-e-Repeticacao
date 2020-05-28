/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaDeSelecao_Repeticao;

import java.util.Scanner;

/**6) Faça um programa que leia vários conjuntos de três valores reais
e mostre para cada conjunto: sua soma, seu produto e sua média. O
programa para quando um conjunto não entrar com seus valores em
ordem crescente.
 *
 * @author Alan
 */
public class Lista03_Questao06 {
    public static void main (String [] args){
        Scanner ler = new Scanner (System.in);
        
        int n1 = 1,n2 = 2,n3 = 3,soma = 0;
        double produto,media;
        
        
         while (n1<n2 && n2<n3){
        System.out.println("Digite o 1º numero: ");
        n1 = ler.nextInt();
        System.out.println("Digite o 2º numero: ");
        n2 = ler.nextInt();
        System.out.println("Digite o 3º numero: ");
        n3 = ler.nextInt();
        if(n1<n2 && n2<n3){
        soma = n1+n2+n3;
            System.out.println("Soma: " +soma);
        produto = n1*n2*n3;
            System.out.println("Produto: " +produto);
        media = (n1+n2+n3)/3;
            System.out.println("Media: " +media);
        }
        else {
            System.out.println("Sequencia invalida");
        }
        
        
        
        
    }
    
}
}
    

