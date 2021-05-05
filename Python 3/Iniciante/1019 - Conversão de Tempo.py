'''Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, 
e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, 
conforme exemplo fornecido.'''

n = int(input())

hora = n // 60 ** 2
n = n - hora * 60 ** 2
minuto = n // 60
n = n - minuto * 60
segundo = n 
print('{}:{}:{}'.format(hora, minuto, segundo))
