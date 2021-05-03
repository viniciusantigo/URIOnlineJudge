'''Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da 
mensagem “eh o maior”. Utilize a fórmula: 

Maior AB = (a + b + abs(a - b)) / 2

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é 
necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".'''

valor = input().split(' ')

a, b, c = valor

formula = (int(a) + int(b) + abs((int(a) - (int(b))))) / 2 
maior = formula
if int(c) > maior:
    maior = int(c)
print('{:.0f} eh o maior'.format(maior))
