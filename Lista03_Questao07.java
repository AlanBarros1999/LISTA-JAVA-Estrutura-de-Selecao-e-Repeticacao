/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaDeSelecao_Repeticao;

import java.util.Scanner;

/**7) Faça um programa que leia as médias finais de vários alunos de
uma turma e mostre a maior média, a menor média e a média
aritmética da turma. O programa para quando encontrar uma média
negativa.
 *
 * @author Alan
 */
public class Lista03_Questao07 {
    public static void main (String [] args){
        Scanner ler = new Scanner (System.in);
        
        double soma,mediaArit,mediaMaior,mediaMenor,mediaFinal;
        int i=0;
        
        
        System.out.println("Digite a media final do"  +( i + 1)+" aluno:");
        mediaFinal = ler.nextDouble(); 
        mediaMenor = mediaFinal;
        mediaMaior = mediaFinal;
        soma=mediaFinal;
        if (mediaFinal>=0) {
            ++i;
        }                
        while (mediaFinal >=0){
            System.out.println("Digite a media desejada");
            mediaFinal =ler.nextDouble();
                          
            if (mediaFinal<0){
                break;
        }
            else{
                if (mediaFinal>mediaMaior)
                mediaMaior = mediaFinal;            
        }
            if (mediaFinal<mediaMenor){
               mediaMenor = mediaFinal;
            }
            soma += mediaFinal;
            i++;
        }
            mediaArit = soma/i;
            System.out.println("A maoir media da turma:"+mediaMaior);
            System.out.println("A menor media da turma:"+mediaMenor);
            System.out.println("A media aritmetica da turma:"+mediaArit);
        
    
    
}
}
    
