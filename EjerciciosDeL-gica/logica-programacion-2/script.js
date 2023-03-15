var celsius;

do {
    celsius = parseFloat(prompt("Ingresa la temperatura en grados Celsius:"));
} while (isNaN(celsius));

let fahrenheit = (celsius * 9 / 5) + 32;
let kelvin = celsius + 273.15;

console.log("Grados Fahrenheit: " + fahrenheit);
console.log("Grados Kelvin: " + kelvin);
