# Programa que checa un numero Armstrong en un cierto intervalo
bajo = 100
alto = 2000

for num in range(bajo, alto + 1):

   # orden del numero
   orden = len(str(num))
    
   # inicializa la suma
   sum = 0

   temp = num
   while temp > 0:
       digit = temp % 10
       sum += digit ** orden
       temp //= 10

   if num == sum:
       print(num)