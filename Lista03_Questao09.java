/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaDeSelecao_Repeticao;

import java.util.Scanner;

/**9) Faça um programa que leia um número n e imprima se ele é primo ou
não. (um número primo tem apenas 2 divisores: 1 e ele mesmo! O
número 1 não é primo!!!)
 *
 * @author Alan
 */
    import java.util.Scanner;
    public class Lista03_Questao09 {
        public static void main (String [] args){
            Scanner ler = new Scanner (System.in);
            int n, divisor, contador=0;

            System.out.println("Digite um número para saber se ele é primo ou não: ");
            n = ler.nextInt();
            for (divisor = 1;divisor <= n;divisor = divisor+1) {
                if (n % divisor == 0) {
                    contador = contador+1;
                }
            }
            if (contador == 2) {
                System.out.println("seu numero é primo");
            }else{
                System.out.println("seu numero não é primo");
            }
        }

    }
