package tiposDeDatosYVariables;

public class tiposDeDatos {

    public static void main(String[] args) {
    

        /*byte centigrados = 1;
        double fahrenheit = (centigrados * 1.8) + 32;
        double kelvin = centigrados + 273.15;

        System.out.println("1 centigrado a fahrenheit es " + fahrenheit);

        System.out.println("1 centigrado a kelvin es " + kelvin);

        /*
         * ºF = ºC x 1.8 + 32 formula para convertir grados centigrados a fahrenheit K =
         * ºC + 273.15
         */
        byte horasTrabajadas = 8;
        byte pago = 10;
        int multiplicacionb = horasTrabajadas * pago;
        System.out.println(multiplicacionb);
        
        //Practicamos como cambiar un dato a otro tipo de dato.
        double num = 1.61;
        //Aqui le estamos diciendo que cambie a entero.
        int numInt = (int)num;
        //Aqui le estamos diciendo que cambie a long
        long numLong = (long)num;
        
        System.out.println("double: " + num);
        System.out.println("int: " + numInt);
        System.out.println("long: " + numLong);
        
      //conversion casting o casteo

        /*
        double num=1.61; 
        int numInt = (int) num; 
        long numLong = (long) num;

        System.out.printIn("double: " + num);
        System.out.printIn("int: " + numInt);
        System.out.println("long: " + numLong);
        */

         //string

        String cantidad = "15";
        String precio = "115.20";


        int cantEntero = Integer.parseInt(cantidad);  
        double precioDouble = Double.parseDouble(precio);


        System.out.println("El valor total de la compra es: " + (cantEntero * precioDouble));

         

        int edad = 30;
        double estatura = 1.61;
         

        String edadString = String.valueOf (edad);
        String estaturaString = String.valueOf (estatura); 

        System.out.println( "Edad: " + edadString + estatura + estaturaString);

        //conversiones
        
        int numero1 = 5;
        int numero2 = 7;
        int numero3 =12;
        
        int suma = numero1 + numero2 + numero3; //operador +, esperamos un 24
        int resta = numero1 - numero2 - numero3; //esperamos -14
        int multiplicación = numero1 * numero2 * numero3; //operador *, esperamos 420
        int división = numero2 / numero1; //operador /, esperamos 1,4
        int modulo = numero2 % numero1; //operador %, esperamos un 2
        int incremento = ++numero3;
        int decremento= --numero2;
        
        System.out.println("La suma es: "+ suma);
        System.out.println("La resta es: "+ resta);
        System.out.println("La multiplicación es: "+ multiplicación);
        System.out.println("La división es: "+ división);
        System.out.println("La modulo es: "+ modulo);
        System.out.println("El incremento es: "+ incremento);
        System.out.println("El decremento: "+ decremento);
        
        
        //Ejemplo... 4?
        /*Scanner pesosc = new Scanner(System.in);
        System.out.println ("Ingresa tu peso");
        float peso = pesosc.nextFloat();
        Scanner alturasc = new Scanner(System.in);
        System.out.println ("Ingresa tu altura");
        float altura = alturasc.nextFloat();

        float IMC = peso / (altura * altura);

        System.out.println("El indice de masa corporal es: " + IMC);
        {

            if (IMC < 16) {
                System.out.println("Criterio de ingreso");
            } else if (IMC >= 16 && IMC < 17) {
                System.out.println("Infrapeso");
            } else if (IMC >= 17 && IMC < 18.5) {
                System.out.println("Bajo peso");
            } else if (IMC >= 18.5 && IMC < 25) {
                System.out.println("Peso normal");
            } else if (IMC >= 25 && IMC < 30) {
                System.out.println("sobrepeso");
            } else if (IMC >= 30 && IMC < 35) {
                System.out.println("Obesidad premorbida");
            } else if (IMC >= 35 && IMC < 40) {
                System.out.println("Obesidad morbida");
            } else {
                System.out.println("Obesidad hipermorbida"); */
        
        //Ejemplo 5
        
        /*float num1 = 3;
        float num2 = 2;
        float num3 = 2;
        float num4 = 5;
        float sumaf = num1 + num2;
        float multiplicaciónf = num3 * num4;
        float divisiónf = sumaf / multiplicaciónf;

        System.out.println(sumaf);
        System.out.println(multiplicaciónf);
        System.out.println(divisiónf); */
        //Ejercicios
        
       
    }
    

}

/*
//casteo a entero 

Como ponemos un entero? 

int numInt = (int) num; // se pone entre parentesis el tipo de dato que quiero convertir y luego el nombre de la variable que quiero convertir 

//casteo a long 

long numLong = (long) num;

System.out.printIn (”double:  “ + num);

System.out.printIn (”int:  “ + numInt);

System.out.printIn (”long:  “ + numLong);

Como es un número entero lo corta y solo lo marca com el 1, por que el entero pues es solo ese número 

Supongamos que yo ahora tengo un string 

String cantidad = “15”;

String precio = “115.20”;

que pasaria si quisieramos hacer una operación ?

tendriamos que cambiarlos 

String es una clase y es por eso que tiene metodos para hacer estas conversiones 

ahora como lo hariamos para cambiarlo a un double o un int?

int cantEntero = Integer.parseInt(cantidad);  

( Integer que es la clase que hace referencia a los enteros ) Pars es un parseo es decir una conversión de un string a un entero  y vamos a hacer lo mismo con double 

double precioDouble = Double.parseDouble(precio);

(Para los double tenemos una clase raper que Double pero con mayuscula la D y luego tenemos parseDouble que es el metodo y ahi abrimos parentesis y colocamos el valor que queremos convertir 

Una vez haciendo esto ya lo estamos convirtiendo y podemos hacer una operación 

System.out.printIn(El valor total de la compra es: + (“cantEntero * precioDouble”));

Ahora supongamos que lo queremos hacer al reves 

tenemos un 

int edad = 30;

double estatura = 1.61;

supongamos que no vamos a utilizarlos como número ni para alguna operación 

vamos a utilizar un metodo que se llama value of / valor de 

String edadStrin = String.valueof (edad);

String estaturaStrin = String.valueof (estatura); y ahi mismo te da todos los valores que puedes utilizar para hacer conversion 

System.out.printIn(”Edad: “ + edadString + estatura + EstaturaString);

conversiones

*/