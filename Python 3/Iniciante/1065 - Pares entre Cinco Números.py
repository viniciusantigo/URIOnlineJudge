'''Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e 
mostre esta informação.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.'''

cont = 0
for i in range(5):
    num = int(input())
    if num % 2 == 0:
        cont += 1
print(cont, 'valores pares')