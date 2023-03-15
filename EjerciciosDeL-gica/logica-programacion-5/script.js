
const secreto = Math.floor(Math.random() * 100) + 1;

const numeros = [];

function esEntero(numero) {
  if (Number.isInteger(numero)) {
    return true;
  } else {
    console.log('El número ingresado no es un entero. Inténtalo de nuevo.');
    return false;
  }
}

function estaEnRango(numero) {
  if (numero >= 1 && numero <= 100) {
    return true;
  } else {
    console.log('El número ingresado no está dentro del rango de 1 a 100. Inténtalo de nuevo.');
    return false;
  }
}

function adivinar() {
  let numero = parseInt(prompt('Adivina el número secreto (entre 1 y 100): '));

  if (esEntero(numero) && estaEnRango(numero)) {
    numeros.push(numero);

    if (numero === secreto) {
      console.log(`Felicidades, adivinaste el número secreto en ${numeros.length} intentos.`);
      console.log(`Números ingresados: ${numeros.join(', ')}`);
    } else {
      console.log('Ups, el número secreto es incorrecto, vuelve a intentarlo.');
      adivinar();
    }
  } else {
    adivinar();
  }
}

adivinar();