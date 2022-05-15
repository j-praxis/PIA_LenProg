# Programa que encuentra el factorial de un numero

num = as.integer(readline(prompt="Ingresa un numero: "))
factorial = 1
if(num < 0) {
print("Error, no existen factoriales para numeros negativos")
} else if(num == 0) {
print("El factorial de 0 es 1")
} else {
for(i in 1:num) {
factorial = factorial * i
}
print(paste("El factorial de ", num ,"es",factorial))
}