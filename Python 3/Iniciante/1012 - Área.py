'''Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas 
acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado
deve ser apresentado com 3 dígitos após o ponto decimal.'''

valores = input().split(' ')

A, B, C = valores

triangulo = float(A) * float(C) / 2
circulo = float(C) ** 2 * 3.14159
trapezio = float(C) *(float(A) + float(B)) / 2
quadrado = float(B) ** 2
retangulo = float(A) * float(B)

print('TRIANGULO: {:.3f}'.format(triangulo))
print('CIRCULO: {:.3f}'.format(circulo))
print('TRAPEZIO: {:.3f}'.format(trapezio))
print('QUADRADO: {:.3f}'.format(quadrado))
print('RETANGULO: {:.3f}'.format(retangulo))
