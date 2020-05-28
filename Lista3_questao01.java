/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaDeSelecao_Repeticao;
/**1) Escreva um algoritmo que lê 15 valores reais, encontra o maior e
o menor deles e mostra o resultado.
 *
 * @author Alan
 */
import java.util.Scanner;
public class Lista3_questao01 {
    public static void main(String [] args){
  Scanner leia = new Scanner(System.in);
        int x; float n1, result1, result2;
	
        System.out.println("Digite 15 números e veja qual foi o maior e o menor digitado: ");
        result1 = 0; result2 = 0;
        for (x = 1;x <= 15;x = x+1){
            n1 = leia.nextFloat();    
            if (x == 1) {
                result1 = n1;
                result2 = n1;
                        }    
            if (n1 < result1) {
                result1 = n1;
                        }
            if (n1 > result2) {
                result2 = n1;
            }
                        }
        System.out.println("o maior número foi: "+ result2);
        System.out.println("o menor número foi: "+ result1);
    }
    
}

