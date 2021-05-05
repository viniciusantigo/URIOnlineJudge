'''Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor 
pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor 
lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o 
exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa 
apresentará a mensagem: “Presentation Error”.'''

n = int(input())

print(n)

cem = n // 100
n = n - cem * 100

cinquenta = n // 50
n = n - cinquenta * 50

vinte = n // 20
n = n - vinte * 20

dez = n // 10 
n = n - dez * 10

cinco = n // 5 
n = n - cinco * 5

dois = n // 2 
n = n - dois * 2

um = n // 1
n = n - um * 1

print('{} nota(s) de R$ 100,00'.format(cem))
print('{} nota(s) de R$ 50,00'.format(cinquenta))
print('{} nota(s) de R$ 20,00'.format(vinte))
print('{} nota(s) de R$ 10,00'.format(dez))
print('{} nota(s) de R$ 5,00'.format(cinco))
print('{} nota(s) de R$ 2,00'.format(dois))
print('{} nota(s) de R$ 1,00'.format(um))
