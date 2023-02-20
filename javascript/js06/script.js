/* 

Que encontramos en el arbol de DOM?

    - Node: Es la uniadad mas basica dentro del documento. Puede ser una etiqueta, un texto dentro de una etiqueta o un comentario, etc.

        <title> NODO
            Manipulacion DOM //es un nodo, pero es hijo del tittle
        </title>

    - Document: Tambien es un nodo, del tipo documento, es el nodo raiz a partir del cual se desarrollan o generan todos los demas nodos.
    
    - Element: son todos aquellos definidos por etiquetas <div>, <img>, <h1>, <p>

    - Atributes: Nodos que dan informacion asociada al tipo de elemento

    - Comentario: Comentarios y otros elementos que estan dentro del html, son considerados nodos.

*/

/* 

Como leer nodos de mi Document Object Model (DOM)

Metodos tradicionales (que se usan en versiones antiguas de JS)

    -document.getElementById (botonSuma)
    -document.getElementByTagName (<button>)
    -document.getElementByClassName (botones)

*/

//var elementoID = document.getElementById("botonSuma");
//console.log(elementoID);

//var elementoEtiqueta = document.getElementsByTagName("button");
//console.log(elementoEtiqueta);

//console.log("Este es el primer elemento de mi coleccion de botones", elementoEtiqueta);

//var elementoClassName = document.getElementsByClassName("botones");
//console.log(elementoClassName);


/* 

Metodos recientes

    -document.querySelector(#botonSuma)
    -document.querySelector(.botones)

*/

//var unElemento = document.querySelector("#input");
//console.log(unElemento);

//var variosElementos = document.querySelector(".botones");
//console.log("variosElementos");


/* 

Creacion de nodos


    - document.createElement(tipoNodo)

*/

//Creacion de una etiqueta del tipo imagen
var imagenPerrito = document.createElement("img");

//Creanis atibutos a la etiqueta
imagenPerrito.src = "https://www.petdarling.com/wp-content/uploads/2021/01/cachorros.jpg"
imagenPerrito.atl = "Foto de perrito tierno"
imagenPerrito.style.width = "150px";
imagenPerrito.style.borderRadius = "100px"

//Poner elementos o nodos en el html
document.body.append(imagenPerrito);

/* 

Actualizar nodos

    Identidicar el nodo con un metodo para tomarlo (getElement o QuerySelector y modificarlo con innnerHTML)

*/

//var resultadoQueCambia = document.getElementById("resultado");

//resultadoQueCambia.innerHTML = "Saludos, cambie el texto juas juas"



/* Construcccion de nuestra calculadora */
var input1 = document.getElementById("input1");
var input2 = document.getElementById("input2");

var botonSuma = document.getElementById("botonSuma");
var botonResta = document.getElementById("botonResta");
var botonMulti = document.getElementById("botonMulti");
var botonDiv = document.getElementById("botonDiv");

var resultado = document.getElementById("resultado");

//Construimos las funciones de nuestra calculadora

function suma(){
    let valor1 = parseInt(input1.value); //Pido numero1
    let valor2 = parseInt(input2.value); //Pido numero2
    let suma = valor1 + valor2; //Calculo la suma
    resultado.innerHTML = suma; //Pongo el resultado en su lugar
}

function resta(){
    let valor1 = parseInt(input1.value); //Pido numero1
    let valor2 = parseInt(input2.value); //Pido numero2
    let resta = valor1 - valor2; //Calculo la resta
    resultado.innerHTML = resta; //Pongo el resultado en su lugar
}

function multi(){
    let valor1 = parseInt(input1.value); //Pido numero1
    let valor2 = parseInt(input2.value); //Pido numero2
    let multi = valor1 * valor2; //Calculo la multiplicacion
    resultado.innerHTML = multi; //Pongo el resultado en su lugar
}

function div(){
    let valor1 = parseInt(input1.value); //Pido numero1
    let valor2 = parseInt(input2.value); //Pido numero2
    let div = valor1 / valor2; //Calculo la division
    resultado.innerHTML = div; //Pongo el resultado en su lugar
}

/*Como se crea un evento (addEventListener)

    - node.addEventListener ("evento a escuchar", lo que quiero que haga cuando se escuche)

            - node (nodo donde aterrizo el evento)
            - addEventListener (palabra reservada para usar el evento)
            - evento a escribir ( clicl, mouseover, etc)
            - lo que quiero que haga (la llamada de la funcion)

*/

botonSuma.addEventListener("click", suma);
botonResta.addEventListener("click", resta);
botonMulti.addEventListener("click", multi);
botonDiv.addEventListener("click", div);


/* 

Manipulacion del DOM

    - Metodos para acceder a elementos

        - document.getElementById
        - document.getElementByTagName
        - document.getElementByClassName


    - Metodo para crear elementos

        - document.createElement(etiqueta)
        - document.createTextNode(texto)   -  Investigar


    - Metodo para insertar elementos

        - parentElement.append
        - parentElement.insertBefore
        - parentElement.insetAdjacentElement


    - Metodos para modificar elementos

        - node.outerHTML (Leer o referenciar el elemento)
        - node.innertHTML (modificar el elemento)



*/


//Primer paso: Definir con que voy a interactuar (almaceno en una variable)
//const textoAModificar = document.querySelector("#h1")

//Creo una funcion que cambia de color, segun el color que le paso como parametro
//function cambiarColor(color){
    //textoAModificar.style.color = color;
//}