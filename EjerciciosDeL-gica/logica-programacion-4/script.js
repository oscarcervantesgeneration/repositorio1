let n = prompt("Introduce un número para mostrar la serie de Fibonacci:");

while(isNaN(n) || n <= 0) {
  n = prompt("Error: Introduce un número válido para mostrar la serie de Fibonacci:");
}

let a = 0, b = 1, c;
let serie = "";

for(let i = 0; i < n; i++) {
  serie += a + ", ";
  c = a + b;
  a = b;
  b = c;
}

console.log("La serie de Fibonacci de " + n + " números es: " + serie);