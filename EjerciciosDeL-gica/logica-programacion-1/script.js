
var num1 = parseInt(prompt("Ingresa el primer número:"));
var num2 = parseInt(prompt("Ingresa el segundo número:"));
var num3 = parseInt(prompt("Ingresa el tercer número:"));
let mayor, centro, menor;

if (num1 >= num2 && num1 >= num3) {
    mayor = num1;
    if (num2 >= num3) {
        centro = num2;
        menor = num3;
    } else {
        centro = num3;
        menor = num2;
    }
} else if (num2 >= num1 && num2 >= num3) {
    mayor = num2;
    if (num1 >= num3) {
        centro = num1;
        menor = num3;
    } else {
        centro = num3;
        menor = num1;
    }
} else {
    mayor = num3;
    if (num1 >= num2) {
        centro = num1;
        menor = num2;
    } else {
        centro = num2;
        menor = num1;
    }
}

console.log("Ordenado de mayor a menor: " + mayor + ", " + centro + ", " + menor);
console.log("Ordenado de menor a mayor: " + menor + ", " + centro + ", " + mayor);

if (num1 === num2 && num1 === num3) {
    console.log("Los números son iguales");
}
