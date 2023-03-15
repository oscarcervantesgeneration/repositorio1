var num;

do {
    num = parseInt(prompt("Ingresa un número:"));
} while (isNaN(num));

let fact = 1;
for (let i = 2; i <= num; i++) {
    fact *= i;
}

console.log("El factorial de " + num + " es: " + fact);