/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaDeSelecao_Repeticao;

/**10) Faça um programa que leia um número n e mostre na tela os n
primeiros números primos.
 *
 * @author Alan
 */
import java.util.Scanner;
public class Lista03_Questao10 {
       public static void main (String [] args){
            Scanner ler = new Scanner (System.in);
            int num;
            //Entrada de dados
        System.out.println("Digite um número: ");
         num = ler.nextInt();
         System.out.println("Os primos ate"+num+"são:");
        //Estrutura de repetição que vai contar até o número digitado
        for (int j = 1; j <= num; j++) {
            int contador = 0;
            //Estrutura de repetição que vai testar o "i" do primeiro for
            for (int i = 1; i <= num; i++) {
                if (j % i == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                System.out.println(j);
            }
        }

    }
}
    

