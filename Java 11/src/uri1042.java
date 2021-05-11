/**
 * Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, 
 * uma linha em branco e em seguida, os valores na sequência como foram lidos.

Entrada
A entrada contem três números inteiros.

Saída
Imprima a saída conforme foi especificado.
*/

import java.util.Scanner;

public class uri1042 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int n1 = leitor.nextInt();
        int n2 = leitor.nextInt();
        int n3 = leitor.nextInt();

        if (n1 < n2 && n1 < n3){
            System.out.println(n1);
            if (n2 < n3){
                System.out.println(n2);
                System.out.println(n3);
            }
            else {
                System.out.println(n3);
                System.out.println(n2);
            }
        }
        else if (n2 < n3) { 
            System.out.println(n2);
            if (n1 < n3) {
                System.out.println(n1);
                System.out.println(n3);
            }
            else {
                System.out.println(n3);
                System.out.println(n1);
            }
        }
        else {
            System.out.println(n3);
            if (n1 < n2) {
                System.out.println(n1);
                System.out.println(n2);
            }
            else {
                System.out.println(n2);
                System.out.println(n1);
            }
        }

        System.out.println();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
