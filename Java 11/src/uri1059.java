/**
 * Faça um programa que mostre os números pares entre 1 e 100, inclusive.

Entrada
Neste problema extremamente simples de repetição não há entrada.

Saída
Imprima todos os números pares entre 1 e 100, inclusive se for o caso, um em cada linha.
 */

public class uri1059 {
    public static void main(String[] args) {
        int i;

        for (i = 2; i < 101; i += 2){
            System.out.println(i);
        }
    }
}
