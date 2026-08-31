/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.del.word;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Rafael Vicario Pérez
 */
public class EjerciciosDelWord {

    // EJERCICIO 49
    public static int naturales (int n){
        if(n > 1){
            // debe tener una condición de parada. (como los bucles)
            n = n + naturales (n - 1);
            // el método debe llamarse a sí mismo.
            return n;
        }else {
            
            return n;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //1. Imprime "Hola, Mundo!"
        System.out.println("hola mundo");

        //2. Suma dos números introducidos por el usuario.
        Scanner sn_teclado = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int resultado = 0;
        System.out.println("dime los dos numeros para sumar");

        numero1 = sn_teclado.nextInt();
        numero2 = sn_teclado.nextInt();
        resultado = numero1 + numero2;
        System.out.println("el resultado es: " + resultado);

        //3. Comprueba si un número es par o impar.
        int numero = 0;
        System.out.println("dime el numero para comprobar si es par");
        numero = sn_teclado.nextInt();
        if (numero % 2 == 0) {
            System.out.println("es par");
        } else {
            System.out.println("es impar");
        }

        /* numero %2 != 0 es para decir que es impar
        el 2 no es igual a 0, es impar*/
        
        
        //4. Calcula el factorial de un número.
        /*factorial de 5, 5! = 1 x 2 x 3 x 4 x 5
         */
        int factorial = 1;
        /*el factorial empieza por 1*/
        int n = 0;
        System.out.println("dime el numero para el factorial");
        n = sn_teclado.nextInt();
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
            System.out.println(factorial);
            // es igual que factorial *= 1
        }
        /*
         int i = 1 → empezamos desde 1

         i <=n → seguimos mientras i no pase de n

         i++ → aumentamos i de uno en uno
         */

        //5. Imprime la secuencia de Fibonacci hasta n términos.
        /*la secuencia de fibonacci es la lista de numeros empezando por el 0,
        donde cada numero es la suma de los dos anteriores*/
        int fibonacci = 0;
        int a = 0;
        int b = 1;
        System.out.println("ingrese de cuantos números quiere el fibonacci: ");
        fibonacci = sn_teclado.nextInt();

        for (int i = 0; i <= fibonacci; i++) {
            System.out.println(a + " ");
            // metemos " " para que imprima con un espacio
            int aux = 0;
            aux = a + b;
            // es lo mismo que int aux = a + b;
            a = b;
            b = aux;
        }
        /*porque i<=fibonacci: porque queremos que esté dentro del bucle siempre
        y cuaando el numero que nos de sea inferior o igual al que yo le meto, porque
        si quiero que sea 7 numeros, no debe superar esa cifra */

 /*¿como funciona este código? primero lee y entra en el for, y lo que lee
        es que debe poner a que es 0, vuelve a leer el for y AHORA la cosa cambia
        porque ha leido aux = a + b y todo el codigo siguiente por lo tanto a ya
        no vale 0, ahora vale 1, y asi sucesivamente hasta que i ya es igual que
        el numero que yo he metido que era 7, aqui ya sale del bucle*/
 
 
        // 6. Invierte una cadena de texto.
        System.out.println("invertir hola mundo");
        String texto = "hola mundo";
        String invertido = new StringBuilder(texto).reverse().toString();
        System.out.println(invertido);

        //7. Comprueba si una cadena de texto es un palíndromo.
        System.out.println(" PALÍNDROMO ");

        String cadena2 = "";
        boolean correcto = true;
        sn_teclado.nextLine();
        // con esta linea estamos evitando un error al mezclar nextInt con nextLine en el mismo proyecto
        // siempre debemos ponerlo justo antes del nuevo nextLine o vicecersa.

        cadena2 = sn_teclado.nextLine();
        // lee toda la frase, si pongo next() solo lee la palabra primera.
        // utilizamos de ejemplo la palabra RADAR

        for (int i = 0; i <= cadena2.length() / 2; i++) {
            // /2  estamos diciendo que pare en la mitad.

            if (cadena2.charAt(i) == cadena2.charAt(cadena2.length() - (i + 1))) {

                /*
            EXPLICACIÓN
           - la primera condición indica la primera letra de la palabra
           - la segunda condición indica la última letra de la palabra
            porque .length() nos dice el total de caracteres que al restarle 1
            seria igual al último indice de la palabra ya que los indices empiezan por 0
            y una palabra de 4 letras tiene el indice 0, 1, 2, 3.
            IMPORTANTE  meterlo dentro del charArt para que compare los caracteres
            ya que si pongo solo cadena.length - 1 nos da como resultado el indice,
            no el caracter
                porque i + 1? porque debe comparar la primera con la ultima, la segunda con la penultima
                etc.. entonces si i es 0 , queremos que compare con la ultima que seria el total del
                lenght - 1, si i es 1, pues habría que restar - 2, etc
            
            le indicamos que siempre que la primera y la ultima sean iguales cumple la condición
     
                 */
            } else {
                correcto = false;

            }

        }
        if (correcto) {
            System.out.println("Es palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }

        /*
        utilizamos el metodo charArt(indice de la palabra empezando por 0)
        este metodo nos dice que caracter hay en la palabra en funcion de su indice
         H O L A
         0 1 2 3 INDICE
        EJEMPLO: 
        String palabra = "hola";

System.out.println(palabra.charAt(0)); // h
System.out.println(palabra.charAt(1)); // o
System.out.println(palabra.charAt(2)); // l
System.out.println(palabra.charAt(3)); // a
         */
        
        
//8. Convierte Celsius a Fahrenheit.
//******* recla matemática 1C = (1*1,8) + 32 = 32F
        System.out.println("cambio de celcius a Fahrenheit");
        int celcius = 0;
        double fahrenheit = 0;
        double obligatorio1 = 1.18;
        int obligatorio2 = 32;
        System.out.println("dime los celcius");
        celcius = sn_teclado.nextInt();

        fahrenheit = (celcius * obligatorio1) + obligatorio2;
        System.out.println("resultado del cambio: " + fahrenheit);
        
        
//9. Encuentra el número más grande en un array.

        int[] array = new int[4];
        array[0] = 2;
        array[1] = 5;
        array[2] = 8;
        array[3] = 1;
        int mayor = array[0];
// suponemos que el mayor es el número de la posición 0
        for (int i = 1; i < array.length; i++) {
            // empezamos por la posición primera int i = 1
            // porque la posición 0 es la que vamos a coger de referencia mayor = array [0]
            /* el .length es para que recorra todo, si ponemos 4, y cambiamos el array
     y metemos mas cajitas, se romperia el código, pero al poner eso podemos
    modificar el array sin problemas*/
            if (array[i] > mayor) {
                /* con lo de arriba comparamos el número actual con el número guardado
        en mayor*/
                mayor = array[i];
                // si el actual es mas grande reemplazamos el valor de mayor
                // así siempre mayor tendrá el mas grande
            }

        }

        System.out.println("el array mayor es " + mayor);
        /*una vez que sale del bucle porque ha encontrado el mas grande leemos.
         */
//10. Suma todos los elementos de un array.
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma = array[i] + suma;
            System.out.println("la suma es: " + suma);
        }
//11. Cuenta las vocales en una cadena de texto.

        String palabra = " ";
        char comprobarV = 'a';
        char comprobarV2 = 'e';
        char comprobarV3 = 'i';
        char comprobarV4 = 'o';
        char comprobarV5 = 'u';
        int vocales_encontradas = 0;
        System.out.println("DIME LA PALABRA PARA CONTAR SUS VOCALES");
        sn_teclado.nextLine();
        // reseteamos el Scanner
        palabra = sn_teclado.nextLine();
        for (int i = 0; i < palabra.length(); i++) {

            if (palabra.charAt(i) == comprobarV || palabra.charAt(i) == comprobarV2
                    || palabra.charAt(i) == comprobarV3 || palabra.charAt(i) == comprobarV4
                    || palabra.charAt(i) == comprobarV5) {

                vocales_encontradas++;

            }

        }

        System.out.println("El número total de vocales de esta palabra es: " + vocales_encontradas);

//11.1 cuenta todos los caracteres de una cadena de texto.
        String cadena = "hola mundo";
        System.out.println(cadena.length());

//12. Genera una tabla de multiplicar.
        int contador = 5;
        int resultadotabla = 0;
        System.out.println("tabla de multiplicar del 5");
        for (int i = 0; i <= 10; i++) {
            resultadotabla = i * contador;
            System.out.println(i + "x" + contador + "=" + resultadotabla);
        }
        /* se podria con un while pero el i++ se sustituye por una variable que yo declare
ejemplo declaro int numerotabla= 0; y pondria while (numerotabla<= 10) y dentro 
abría que poner numerotabla++. es mas sencillo con un FOR.
         */
// se podría tambien introduciendo numero por teclado
//

//13. Comprueba si un número es primo.
        int numeroprimo = 0;
        System.out.println("dime el número");

        numeroprimo = sn_teclado.nextInt();
        if (numeroprimo % 2 == 0) {
            System.out.println("es primo");
        } else {
            System.out.println("no es primo");
        }

// igual si quiero ver si es par o impar
//

//14. Calcula la suma de los dígitos de un número.
        System.out.println("SUMA DE DÍGITOS");

        int numeroprueba = 12345;
        int sumaprueba = 0;
        while (numeroprueba > 0) {
            sumaprueba = sumaprueba + (numeroprueba % 10);
            // forma abreviada suma += numero % 10
            // con % 10 obtiene el ultimo digito del numero que sería el 5
            // al dividir entre 10 el resto es siempre el último
            // se añade a suma el último dígito

            numeroprueba /= 10;
            // forma sin abreviar numeroprueba = numeroprueba / 10
            // con /= 10 elimina el ultimo digito que ya hemos sumado
            /*
    explicación:
    primera vuelta:
    
    sumaprueba = 0 + 5
    numeroprueba = 1234
    
    segunda vuelta:
    sumaprueba = 5 + 4
    numeroprueba = 123
    
    tercera vuelta:
    sumaprueba = 9 + 3
    numeroprueba = 12
    
    ETC HASTA 0.
             */

        }
        System.out.println(sumaprueba);

//15. Imprime un patrón de pirámide usando bucles.
        System.out.println(" PIRAMIDE ");
        int filas = 5;
// quiero 5 filas

        for (int i = 1; i <= filas; i++) {
            // primer bucle recorre las filas

            // espacios
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");

                // añade espacios 
                /* for (int j = 1; j <= 5 -1; j++)
        primera vuelta
        1 <= 4 ---> 1 espacio
        2 <= 4 ---> 2 espacios
        3 <= 4 ---> 3 espacios
        4 <= 4 ---> 4 espacios
        salta al otro bucle
                 */
 /* for (int j = 1; j<= 4 - 1; j++ )
         2 <= 3 ---> 1 espacio
         3 <= 3 ---> 2 espacios
         4 <= 3 ---> 3 espacios
        
        salta al otro bucle
        
        ETC hasta 5 <= 4 que no se cumple
                 */
            }
            // asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
                // cantidad de asteriscos (2 * i - 1)

                /*
        primera vuelta
        1 <= 2 * 1 - 1 --> imprime 1 *
        2 <= 2 * 1 - 1 --> salta el bucle
        
        segunda vuelta 
        1 <= 2 * 2 - 1 --> imprime 1 *
        2 <= 2 * 2 - 1 --> imprime 2 *
        3 <= 2 * 2 - 1 --> salta el bucle
        
        ETC HASTA FINALIZAR
        
                 */
            }

            System.out.println();
            // con esto hacemos que salte a cada linea cada vez que termina los dos bucles de dentro

        }

        System.out.println("PIRAMIDE MÁS GRANDE");

        int filasgrandes = 10;

        for (int i = 1; i <= filasgrandes; i++) {

            // espacios
            for (int j = 1; j <= filasgrandes - i; j++) {
                System.out.print(" ");
            }
            // asteriscos 
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");

            }

            System.out.println();

        }
//16. Encuentra el valor ASCII de un carácter.
        System.out.println("DIME EL CARÁCTER QUE QUIERES QUE TE DIGA SU VALOR ASCII");

        String caracter;
        sn_teclado.nextLine();
        caracter = sn_teclado.nextLine();

        // UTILIZAMOS CASTING
        /*
convertir un tipo de dato en otro, formula:
(en que lo quiero convertir) + el dato que tengo)
         */
        System.out.println("El valor ASCII ES: " + (int) caracter.charAt(0));

//17. Intercambia dos variables.
        System.out.println("INTERCAMBIO DE VARIBALES");
        int variable1 = 7;
        int variable2 = 10;
        System.out.println(variable1);
        System.out.println(variable2);
        int variableaux = 0;
        variableaux = variable1;
        variable1 = variable2;

        variable2 = variableaux;

        System.out.println(variable1);
        System.out.println(variable2);
//18. Convierte decimal a binario.

        System.out.println("BINARIO");
        int decimal = 1234;
        String binario = "";
        while (decimal > 0) {
            int resto = decimal % 2;
            binario = resto + binario;
            decimal /= 2;
        }
        System.out.println(binario);
        System.out.println("");
        /*
        % 10 → sacar dígitos decimales (4, 3, 2, 1)
        / 10 → quitar dígitos decimales
        % 2 → sacar bits para binario
        / 2 → avanzar en la conversión a binario
        
         */

//19. Calcula el interés simple.
        System.out.println("Vamos a calcular el interés simple");
        double interes = 0;
        double capitalInicial = 0;
        double tipoInteres = 0;
        double tiempo = 0;

        System.out.println("dime capital inicial");
        capitalInicial = sn_teclado.nextDouble();
        System.out.println("dime tipo de interes");
        tipoInteres = sn_teclado.nextDouble();
        System.out.println("dime el tiempo");
        tiempo = sn_teclado.nextDouble();
        interes = capitalInicial * (tipoInteres / 100) * tiempo;
        System.out.println("el interes sería: " + interes);

//20. Encuentra el área de un círculo.
// A = pi * Radio(al cuadrado)
        System.out.println("RADIO");
        double pi = Math.PI;
        double A = 0;
        double R = 20;

        A = pi * (R * R);
        System.out.println(A);

        /*SIMPLIFICADO
double R = 20;
double A = Math.PI * R * R;

System.out.println(A);


         */
        
        
//21. Comprueba si un año es bisiesto.
/*EXPLICACIÓN
AÑO BISIESTO DEBE SER 2 condiciones:
- divisible entre 4 y no entre 100
- divisible entre 4, entre 100 y entre 400 (si es entre 400 ya cumple las otras 2)


         */
        System.out.println("Comprobemos si un año es bisiesto");
        System.out.println("Dime el año: ");
        int año;

        año = sn_teclado.nextInt();
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }

        //
        //
//22. Elimina duplicados de una lista.
        System.out.println("ELIMINAR DUPLICADOS DE UNA LISTA: ");
        ArrayList<Integer> duplicados = new ArrayList<Integer>();
        duplicados.add(2);
        duplicados.add(4);
        duplicados.add(2);
        duplicados.add(3);
        duplicados.add(5);

        for (int i = 0; i < duplicados.size(); i++) {
            for (int j = i + 1; j < duplicados.size(); j++) {
                if (duplicados.get(i) == duplicados.get(j)) {
                    duplicados.remove(j);
                    j--;
                    /* EXPLICACIÓN:
        Recorremos primero la I y la comparamos con el siguiente que será la J,
        como queremos que el primero compruebe todos los anteriores y así sucesivamente
        necesitamos dos bucles.
       
        IMPORTANTE: el segundo bucle debe empezaer siempre uno despues de i, (i + 1).
        Despues tenemos la condición del if: siempre que la posición i sea igual a la posición
        j. Entra al bucle y elimina la posición j (es decir la que comprobamos).
       
        IMPORTANTE: terminamos el if añadiendo j-- ¿porqué? porque al eliminar una posición
        de la lista, y volver a comprobar se saltaría una posición, entonces debemos 
        volver a la misma posición que acabamos de comprobar y eliminar, porque la lista
        ha cambiado de tamaño y se ha modificado las posiciónes, siendo la siguiente posición,
        la actual que acabamos de eliminar. 
        Al estar dentro del if esto solo se cumple si elimina una posición.
                     */

                }
            }

        }
        System.out.println(duplicados);
// lo ponemos fuera para mostrar el resultado de la operación.
//
//
//

//23. Calcula la media de los elementos de una lista.
        System.out.println("MEDIA DE UNA LISTA");
        ArrayList<Integer> media = new ArrayList<Integer>();
        media.add(1);
        media.add(4);
        media.add(6);
        media.add(8);
        System.out.println("Números de la lista: " + media);
        double sumamedia = 0;
        // importante que empiece por 0
        double mediatotal;
        // por si da decimales.
        // importante que las dos sean las mismas variables para que se realice bien la operación

        for (int i = 0; i < media.size(); i++) {

            sumamedia = sumamedia + media.get(i);
// 0 + 1
// 1 + 4
// 5 + 6
// etc
        }
        mediatotal = sumamedia / media.size();
        // total de la suma / total de elementos de la lista
        System.out.println("Media de esta lista: " + mediatotal);
        //
        //
        //

//24. Comprueba si un número es positivo, negativo o cero.
        int comprobar = 0;
        System.out.println("dime el número que quieres comprobar");
        comprobar = sn_teclado.nextInt();
        if (comprobar >= 1) {

            System.out.println("es positivo");
        } else {
            if (comprobar < 0) {
                System.out.println("es negativo");
            } else {
                System.out.println("es cero");
            }
        }

//25. Fusiona dos listas.
        System.out.println("FUSIONAR DOS LISTAS");

        ArrayList<String> lista1 = new ArrayList<String>();
        ArrayList<String> lista2 = new ArrayList<String>();

        lista1.add("Dacia");
        lista1.add("Ford");
        lista1.add("Renault");
        lista1.add("Seat");
//
        lista2.add("Fiat");
        lista2.add("BMW");
        lista2.add("Mercedes");
        lista2.add("Jaguar");

        ArrayList<String> fusion = new ArrayList<String>();

        for (int i = 0; i < lista1.size(); i++) {
            fusion.add(lista1.get(i));

            if (i == lista1.size() - 1) {
                // lista1.size es 4 y la i debe alcanzar maximo 3 al empezar por 0 que es el primer índice
                // lista1.size te da el número total de elementos que son 4, pero el primer índice es 0

                for (int j = 0; j < lista2.size(); j++) {
                    fusion.add(lista2.get(j));
                }
            }

        }
// OTRA OPCIÓN  (quizás más sencilla):
// los dos bucles separados. no habría que introducir ningún if. 
//
//
        System.out.println(fusion);

//26. Encuentra el MCD (Máximo Común Divisor) de dos números.
// RECORDEMOS: 
// ---> / dividimos
// ---> % obtenemos el resto
        System.out.println("DIME LOS NÚMEROS PARA CALCULAR EL MÁXIMO COMÚN DIVISOR");
        int numeroMCD = 0;
        int numeroMCD2 = 0;
        int resto = 0;
        numeroMCD = sn_teclado.nextInt();
        numeroMCD2 = sn_teclado.nextInt();
        do {

            resto = numeroMCD % numeroMCD2;
            // ejemplo: 50 % 30 = 20
            // en el caso de no dar 0 el resto --> segunda vuelta 30 % 20
            // en el caso de no dar 0 el resto --> tercera vuelta 20 % .. etc

            numeroMCD = numeroMCD2;
            // debe adquirir el valor del segundo numero para la siguiente vuelta
            numeroMCD2 = resto;
            // debe adquirir el valor del resto para la siguiente vuelta.
        } while (resto != 0);
        // una vez que el resto es 0, ya tenemos el MCD

        System.out.println("El MCD es: " + numeroMCD);
        // ponemos la variable que termina con el MCD al terminar el bucle.
        // ya que el numero (el segundo número) que deja en 0 el resto, es el MCD 

//27. Comprueba si una cadena de texto es un anagrama.
        System.out.println("VAMOS A COMPROBAR SI LA PALABRA ES UN ANAGRAMA");
        String anagrama = "";
        String anagrama2 = "";

        System.out.println("Dime las palabras: ");
        sn_teclado.nextLine();
        anagrama = sn_teclado.nextLine();

        anagrama2 = sn_teclado.nextLine();
        boolean[] coincidencia = new boolean[anagrama2.length()];
        // se rellena todo con false automáticamente
        boolean para = true;
        boolean anagrama_encontrado = true;
        // importante la creación de array justo despues de tener la palabra
        // para que se cree con un valor y no con 0

        if (anagrama.length() == anagrama2.length()) {
            for (int i = 0; i < anagrama.length(); i++) {
                para = true;
                // debemos ponerlo otra vez en true ya que en el siguiente bucle se coloca en false para parar de buscar la que ya ha encontrado
                for (int j = 0; j < anagrama2.length(); j++) {
                    if (anagrama.charAt(i) == anagrama2.charAt(j) && coincidencia[j] != true && para == true) {
                        /*
                        estamos diciendo que la letra de anagrama es igual a anagrama 2 y ademas no tiene marcado true,
                        es decir no esta ya guardada como coincidencia en anagrama2
                         */
                        coincidencia[j] = true;

                        para = false;
                        // paramos de buscar hemos encontrado la coincidencia

                    }

                }
                // este if debe estar dentro del primer for, para que lo compruebe cuando el segundo for se haya ejecutado completo.
                if (para == true) {
                    anagrama_encontrado = false;
                    /* para true nos dice que la letra no ha sido encontrada, por lo tanto una vez
                    el segundo for comprueba todo y una letra no ha sido encontrado porque para sigue en true
                    guardamos una variable que indique que esa posición no ha sido encontrada, por lo tanto
                    no es un anagrama
                    
                     */

                }
// recordemos que el orden es muy importante 
            }
            if (anagrama_encontrado == true) {
                System.out.println("Es un Anagrama");
            } else {
                System.out.println("No es un Anagrama");
            }

        } else {
            System.out.println("No es un Anagrama");
        }

//28. Convierte una lista en un diccionario con los índices como claves.
        System.out.println("VAMOS A CONVERTIR UNA LISTA EN UN DICCIONARIO");
        ArrayList<String> listaD = new ArrayList<String>();
// creamos la lista
        Map<Integer, String> diccionario = new HashMap<Integer, String>();
// creamos el diccionario
        listaD.add("amor");
        listaD.add("odio");
        listaD.add("maldad");
        listaD.add("bondad");
        listaD.add("tristeza");
        System.out.println("Aqui te muestro los elementos de la lista: " + listaD);
// añadimos los elementos a la lista
        for (int i = 0; i < listaD.size(); i++) {
            diccionario.put(i, listaD.get(i));
            // pasamos esa lista al diccionario.
        }

        System.out.println("Aqui podemos ver el diccionario: " + diccionario);

//29. Cuenta las ocurrencias de un carácter en una cadena de texto.
        System.out.println("Vamos a contar las ocurrencias de un carácter en una palabra: ");
        String cadenaP;
        String ocurrencia;
        int contadorP = 0;
        System.out.println("Dime la palabra: ");

        cadenaP = sn_teclado.nextLine();
        System.out.println("Dime el carácter que quieres ver cuánto se repite: ");
        ocurrencia = sn_teclado.nextLine();

        for (int i = 0; i < cadenaP.length(); i++) {
            if (cadenaP.charAt(i) == ocurrencia.charAt(0)) {
                contadorP++;
            }

        }
        System.out.println("El número de veces que se repite es: " + contadorP);

//30. Imprime los números del 1 al 100 (omite los múltiplos de 3).
        for (int i = 0; i <= 100; i++) {

            if (i % 3 != 0) {
                System.out.println(i);
            }
        }
        /*primero recorro los 100 numeros, el for, y posterior mente con el if selecciono
que quiero quitar
i %3 !=0 imprime si NO es multiplo de 3
i %3 ==0 imprime si, SI es multiplo de 3
EXPLICACIÓN:
i = número
if(i %3 !=0){
        System.out.println(i);
si número no es multiplo de 3 me lo imprimes
if(i %3 ==0){
        System.out.println(i);
si el número es multiplo de 3 me lo imprimes
         */

//31. Encuentra la raíz cuadrada de un número.
        System.out.println("Hagamos la raíz cuadrada de un número: ");
        int raiz = 0;
        System.out.println("Dime el número: ");
        raiz = sn_teclado.nextInt();

        System.out.println("La raíz cuadrada de ese número es: " + Math.sqrt(raiz));
//
//

//32. Calcula el IMC (Índice de Masa Corporal).
        double peso = 0;
        double estatura = 0;
        System.out.println("vamos a calcular tu indice de masa corporal");
        System.out.println("selecciona 1 si quieres iniciar");
        int programa = 0;
        boolean salir = false;
        programa = sn_teclado.nextInt();
        while (programa == 1 && salir == false) {

            System.out.println("dime tu peso");
            peso = sn_teclado.nextDouble();
            System.out.println("dime tu estatura");
            estatura = sn_teclado.nextDouble();
            double IMC = 0;
            IMC = peso / (estatura * estatura);
            System.out.println("el indice es: " + IMC);
            salir = true;

        }

//33. Encuentra el máximo de tres números.
// podría utilizarse Math. pero vamos a razonarlo de otra manera.
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        System.out.println("Dime 3 números y te diré el mayor de los 3: ");
        num1 = sn_teclado.nextInt();
        num2 = sn_teclado.nextInt();
        num3 = sn_teclado.nextInt();

        if (num1 > num2 && num1 > num3 || num1 == num2 && num3 < num1) {
            if (num1 == num2) {
                System.out.println("Empate entre : " + num1 + " y " + num2);
            } else {
                System.out.println("Este número es mayor: " + num1);
            }

        } else {
            if (num2 > num3 || num2 == num3 && num2 > num1) {
                if (num2 == num3) {
                    System.out.println("Empate entre : " + num2 + " y " + num3);
                } else {
                    System.out.println("Este número es mayor: " + num2);
                }

            } else {
                if (num3 > num2 || num1 == num3 && num2 < num1) {
                    if (num1 == num3) {
                        System.out.println("Empate entre : " + num1 + " Y " + num3);
                    } else {
                        System.out.println("Este número es mayor: " + num3);
                    }

                } else {
                    System.out.println("Empate los tres números");
                }

            }
        }
//34. Cuenta las palabras en una frase.
        System.out.println("Vamos a contar las palabras de una frase: ");

        String frase = "hola soy tu programador de confianza";
        int palabrasContador = 0;
        char espacio = ' ';
        System.out.println("La frase es: " + frase);
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == espacio) {
                // importante cuenta cada vez que haya un espacio, pues indica una palabra nueva.
                // ya que el contador cuenta cada letra
                palabrasContador++;
            }
        }
        palabrasContador++;
// aquí sumamos una mas porque la ultima palabra no la cuenta al no finalizar en espacio.

        System.out.println("La frase tiene: " + palabrasContador + " " + "palabras");

//35. Invierte una lista.
        System.out.println("Invertir una lista");
        ArrayList<String> invertir = new ArrayList<String>();
        invertir.add("rafa");
        invertir.add("irene");
        invertir.add("tina");
        invertir.add("juan");
        invertir.add("raquel");
        invertir.add("rafaPapa");
        System.out.println("Lista en orden correcto: " + " " + invertir);
// tenemos un método concreto de que sería Collections.reverse(invertir);
// pero vamos a prácticarlo de otra manera que nos haga pensar un poco.

        ArrayList<String> invertir2 = new ArrayList<String>();
// aquí añadiremos los elementos de manera invertida

        for (int i = 0; i < invertir.size(); i++) {

            invertir2.add(invertir.get(invertir.size() - (i + 1)));
// aquí añade el elemento a invertir2 que corresponde a las posiciones empezando por el final

        }
        System.out.println("Lista invertida: " + " " + invertir2);

//36. Comprueba si una lista está vacía.
        System.out.println("Comprobamos si una lista está vacía");
        ArrayList<String> listavacia = new ArrayList<String>();

        if (listavacia.isEmpty()) {
            // es un método que devuelve verdadero si la lista no tiene elementos
            // en caso de tener elementos devolvería falso y no entraria en el if
            System.out.println("La lista está vacía");
        }

//37. Pon en mayúscula la primera letra de cada palabra en una cadena de texto.
        String cadenaNueva = "hola soy tu programador de confianza";
        System.out.println("Vamos a poner en mayúsculas la primera letra de cada palabra");
        System.out.println("LA FRASE: " + " " + cadenaNueva);
        String cadenaT = "";
        char espacio1 = ' ';
// necesitamos una cadena nueva la cual añadiremos el cambio, ya que los String no se pueden modificar.
        for (int i = 0; i < cadenaNueva.length(); i++) {
            if (i == 0 || cadenaNueva.charAt(i - 1) == espacio1) {
                // siempre que i sea el primer carácter o siempre que el carácter esté justo antes que un espacio.
                cadenaT += Character.toUpperCase(cadenaNueva.charAt(i));
                // es un método Character.toUpperCase() para convertir a mayúscula
                // importante indicarle dentro que queremos el carácter y dentro del parentesis la posición
            } else {
                cadenaT += cadenaNueva.charAt(i);
                // aquí simplemente añadimos el carácter siguiente tal cual. 
            }

        }
        System.out.println("Nueva frase: " + " " + cadenaT);

//38. Genera un número aleatorio.
        System.out.println("Generamos un número aleatorio");
        double aleatorio = 0;
// Math.random();
// método para generar números aleatorios
        aleatorio = Math.random();
        System.out.println(aleatorio);

//39. Ordena una lista de enteros
        System.out.println("Vamos a ordenar esta lista: ");
        ArrayList<Integer> enteros = new ArrayList<Integer>();
        enteros.add(20);
        enteros.add(18);
        enteros.add(14);
        enteros.add(12);
        enteros.add(29);
        enteros.add(35);

        System.out.println(enteros);
        ArrayList<Integer> ordenado = new ArrayList<Integer>();
        do {
            int guarda = enteros.get(0);
            // importante que guarda empieze por el primer elemento dentro del bucle.
            for (int i = 0; i < enteros.size(); i++) {

                if (enteros.get(i) < guarda) {
                    guarda = enteros.get(i);

                }

            }
            enteros.remove(Integer.valueOf(guarda));
            // remove para eliminar
// remove te pide una posición y lo que queremos es que busque el valor.
// para ello tenemos el método Integer.valueOf que nos convierte int en un integer
// con esto le decimos busca este valor y eliminalo.
// es importante eliminar el valor de la primera lista para que no lo vuelva a meter
            ordenado.add(guarda);
            // añadimos guarda a la nueva lista
        } while (enteros.size() > 0);
        // una vez que la primera lista no tiene mas elementos se sale.
        System.out.println("nueva lista: " + " " + ordenado);

//40. Convierte segundos en horas, minutos y segundos. 
        int segundos = 345562;
        System.out.println("convertimos estos segundos en horas, minutos y segundos: " + segundos);
        int horas = 0;
        int minutos = 0;
        int segundosN = 0;

        minutos = segundos / 60;
        // calculamos los minutos 
        segundosN = segundos % 60;
        // añadimos los segundos restantes de esos minutos calculados

        horas = minutos / 60;
        // calculamos las horas de esos minutos
        minutos = minutos % 60;
        // calculamos los minutos restantes

        System.out.println("horas: " + " " + horas + " " + "minutos: " + " " + minutos + " " + "segundos: " + " " + segundosN);

//41. Comprueba si una cadena de texto contiene solo dígitos.
        System.out.println("Comprobemos si solo tenemos digitos");
        String cadenaTex = "1234545rafa";
        char numeroD = '0';
        char numeroD2 = '1';
        char numeroD3 = '2';
        char numeroD4 = '3';
        char numeroD5 = '4';
        char numeroD6 = '5';
        char numeroD7 = '6';
        char numeroD8 = '7';
        char numeroD9 = '8';
        char numeroD10 = '9';
        System.out.println("cadena de texto: " + " " + cadenaTex);
        boolean encontradoD = false;
        // lo inicializamos en false porque todavía no ha encontrado nada 
        for (int i = 0; i < cadenaTex.length(); i++) {
            if (cadenaTex.charAt(i) != numeroD && cadenaTex.charAt(i) != numeroD2
                    && cadenaTex.charAt(i) != numeroD3 && cadenaTex.charAt(i) != numeroD4
                    && cadenaTex.charAt(i) != numeroD5 && cadenaTex.charAt(i) != numeroD6
                    && cadenaTex.charAt(i) != numeroD7 && cadenaTex.charAt(i) != numeroD8
                    && cadenaTex.charAt(i) != numeroD9 && cadenaTex.charAt(i) != numeroD10) {

                encontradoD = true;
                // encuentra, cambia a true
                // no hace falta else pues si en else ponemos que lo volvemos a false daría mal el resultado, debe permanecer en true. 
            }

        }
        if (encontradoD == true) {
            System.out.println("Contiene otros caracteres");
        } else {
            System.out.println("Contiene solo digitos");
        }

//42. Encuentra la diferencia entre dos listas.
        ArrayList<Integer> diferencia = new ArrayList<Integer>();
        ArrayList<Integer> diferencia2 = new ArrayList<Integer>();

        diferencia.add(1);
        diferencia.add(2);
        diferencia.add(3);

        diferencia2.add(1);
        diferencia2.add(2);
        diferencia2.add(4);
        ArrayList<Integer> diferenciaEncontrada = new ArrayList<Integer>();

        for (int i = 0; i < diferencia.size(); i++) {
            if (diferencia.get(i) != diferencia2.get(i)) {
                diferenciaEncontrada.add(diferencia2.get(i));
            }

        }
        System.out.println("Diferencias encontradas: " + " " + diferenciaEncontrada);

//43. Imprime todos los números primos en un rango.
        /* RECUERDA NÚMERO PRIMO AQUEL QUE SOLO SE PUEDE DIVIDIR POR 1 y POR EL MISMO
SIN INCLUIR EL 1*/ //
        int numeroPrimo = 0;
        int numeroPrimo2 = 0;
        ArrayList<Integer> primo = new ArrayList<Integer>();
        boolean verdaderoP = true;
        System.out.println("Dime el primer y ultimo número del rango que quieres que busque números primos");
        numeroPrimo = sn_teclado.nextInt();
        numeroPrimo2 = sn_teclado.nextInt();

        for (int i = numeroPrimo; i <= numeroPrimo2; i++) {
            // se recorre en el rango establecido
            verdaderoP = true;
            for (int j = 2; j < i; j++) {
                // se divide unicamente entre el 2 y el número marcado por i

                if (i % j == 0) {
                    // en el caso de que la división de ambos números de como resto 0 no es primo
                    verdaderoP = false;
                }
            }
            if (verdaderoP == true && i != 1) {
                // si se mantiene en true y siempre y cuando no sea 1. añadimos el número como primo
                primo.add(i);
            }
        }

        System.out.println("Números primos en ese rango: " + " " + primo);

        //
//44. Convierte una cadena de texto a minúsculas.
        String cadenaText = "HOLA SOY RAFA";
        String cadenaMinuscu = "";

        for (int i = 0; i < cadenaText.length(); i++) {
            cadenaMinuscu += Character.toLowerCase(cadenaText.charAt(i));
            // método para las minúscula

        }
        System.out.println("Aquí lo tenemos en minúscula: " + cadenaMinuscu);

//45. Encuentra la longitud de una cadena de texto sin funciones integradas.
        String longitud = "hola soy rafa";
        int longitudD = 0;
        int contadorL = 0;
        boolean entrar = true;
        while (entrar == true) {
            // como no podemos poner contadorL <= a algo porque no sabemos cuanto mide y tampoco podemos poner .lenght porque el ejercicio nos pide que no lo hagamos.
            // entramos con un boolean que es precisamente el que nos dará la salida 
// este ejercicio normalmente se resuelve con longitud.length, pero es algo mas rebuscado para pensar.
            try {

                longitud.charAt(contadorL);
                longitudD++;
                contadorL++;
                // aquí metemos toda la lógica del ejercicio, si algo no cuadra por un error salta solo al catch.

            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("No hay letras");
                entrar = false;
                // importante salir del bucle una vez salta el error.
            }

        }
        System.out.println("la longitud de la cadena es: " + longitudD);

//46. Multiplica dos matrices.
        /* EXPLICACIÓN: tenemos dos matrices 
        A = 1  5
            2  6
        B = 6  7
            4  8
        
        para obtener el resultado de la multiplicación de la primera posición se multiplica la primera fila con la primera columna
        1 x 6 + 5 x 4 = 26
        
        matriz C = 26  0
                   0   0
         */
        int[][] matriz_A = new int[2][2];
        int[][] matriz_B = new int[2][2];
        // primero filas, segundo columnas.
        // creamos dos matrices bidimensionales
        matriz_A[0][0] = 1;
        matriz_A[0][1] = 5;
        matriz_A[1][0] = 2;
        matriz_A[1][1] = 6;

        matriz_B[0][0] = 6;
        matriz_B[0][1] = 7;
        matriz_B[1][0] = 4;
        matriz_B[1][1] = 8;

        int[][] matriz_C = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int resultadoM = 0;
                for (int k = 0; k < 2; k++) {
                    // recoremos filas de A y columnas de B. por eso 3 for. 
                    // primer for recorre filas de A segundo for recorre columnas de B. no hace falta recorrer columnas de A ni filas de B
                    // for de K recorremos los elementos que queremos multiplicar
                    resultadoM += matriz_A[i][k] * matriz_B[k][j];

                }
                matriz_C[i][j] = resultadoM;
            }

        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz_C[i][j]);
            }
            System.out.println("");
            // para que de un salto de linea
        }

//47. Comprueba si una lista es un palíndromo.
        ArrayList<Integer> palindromo = new ArrayList<Integer>();
        palindromo.add(1);
        palindromo.add(2);
        palindromo.add(1);
        boolean verdadero = true;

        for (int i = 0; i < palindromo.size(); i++) {
            if (palindromo.get(i) == palindromo.get(palindromo.size() - (i + 1))) {

                // dentro del get metemos el indice, con la condición del size le estamos diciendo el ultimo, penultimo, etc.
            } else {
                verdadero = false;
            }

        }
        if (verdadero == true) {
            System.out.println("Es palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }

//48. Imprime las primeras n filas del triángulo de Pascal.
        int filasN = 0;

        ArrayList<Integer> filaprimera = new ArrayList<Integer>();
        ArrayList<Integer> filasegunda = new ArrayList<Integer>();
        // se podria utilizar un arraylist bidimensional---> ArrayList <ArrayList <Integer>> triangulo = new ArrayList <ArrayList <Integer>> ();
        ArrayList<Integer> auxiliar = new ArrayList<Integer>();
        System.out.println("Dime de cuantas filas quieres el triángulo de pascal");
        filasN = sn_teclado.nextInt();

        filaprimera.add(1);
        for (int i = 0; i < filasN; i++) {
            // el primer for dice en que fila nos encontramos
            filasegunda.add(1);
            // añadimos el extremo
            auxiliar = filaprimera;
            // utilizamos auxiliar para poder ir intercambiando filas
            for (int j = 1; j < auxiliar.size(); j++) {
                // el segundo for dice que elementos debe estar en esa fila.
                // para que no nos de errores la suma debe producirse cuando al menos haya 2 elementos en auxiliar, por lo tanto no debe darse en la primera vuelta.

                filasegunda.add(auxiliar.get(j - 1) + auxiliar.get(j));

            }

            if (i != 0) {
                // este extremo no se añade en la primera fila
                filasegunda.add(1);
                // añadimos el extremo
            }

            for (int k = 0; k < filasegunda.size(); k++) {

                // imprimimos las filas
                System.out.print(filasegunda.get(k) + " ");
            }
            System.out.println(" ");
            // salto de linea 
            filaprimera = filasegunda;
            // la primera fila es ahora la nueva creada
            /*aquí tendríamos:
            filaprimera = la nueva creada
            filasegunda = la nueva creada
            auxiliar = la antigua
            */
            filasegunda = auxiliar;
            // filasegunda pasa a apuntar a auxiliar
            // porque queremos vaciarla, y si la vaciamos antes de este movimiento, vaciariamos la nueva fila creada ya que tenemos esto filaprimera = filasegunda;
            /* en este punto tendriamos:
            filaprimera = la nueva creada 
            auxiliar = la antigua
            filasegunda = la antigua
             */
            filasegunda.clear();
            // eliminamos todos los elementos de la fila segunda para dejarla vacía para las demas vueltas
            /* EXPLICACIÓN:
            Es así porque esto que hemos hecho hace referencias a los arrays no los copia en filas nuevas, entonces
            si eliminamos una de las filas, se elimina para todo el que le haga referencia. por eso el clear debe hacerse cuando filasegunda = auxiliar
            porque aquí si podemos vaciarlo, ya que vaciaría la fila antigua de ambos, tanto de auxiliar como de filasegunda, y es lo que buscamos.
            
            Al comenzar de nuevo el bucle tendriamos:
            filaprimera = la fila nueva creada
            auxiliar = vacía (a la espera de asignarle otra vez que sea la filaprimera)
            filasegunda = vacía (a la espera de volver a calcular la nueva fila que tenemos que crear)          
            */

        }

//49. Encuentra la suma de los números naturales usando recursión.
        // suma de números naturales ejemplo: 5 ----> 5 + 4 + 3 + 2 + 1
        // EL MÉTODO LO TENEMOS AL PRINCIPIO.
        System.out.println("Dime el número para hacer la suma de los naturales con recursividad: ");
        int naturales = 0;
        naturales = naturales(sn_teclado.nextInt());
        
        
        System.out.println("Resultado: " + " " + naturales);
        
        
        
        
//50. Simula un cajero automático básico (depósito/retirada/consulta de saldo).
        int saldo = 0;
        int opcion = 0;
        int deposito = 0;
        int retirada = 0;
        /*importante declarar todas las varibales fuera de cualquier operación
porque si lo meto dentro solo existe dentro, por lo tanto si la pongo como
condición para salir del bucle ( while(opcion != 4) ) si está dentro el bucle
no lo reconoce porque es una condición de entrada que pide desde fuera*/
        System.out.println("vamos a iniciar un cajero automático");
        do {
            System.out.println("¿Qué operación desea realizar?");
            System.out.println("1.depósito");
            System.out.println("2.retirada");
            System.out.println("3.consultar saldo");
            System.out.println("4.salir");

            opcion = sn_teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("¿Cuánto desea depositar?");
                    deposito = sn_teclado.nextInt();
                    System.out.println("ha depositado: " + deposito);

                    break;
                case 2:
                    System.out.println("¿Cuánto desea retirar?");
                    retirada = sn_teclado.nextInt();
                    System.out.println("ha retirado: " + retirada);

                    break;
                case 3:
                    saldo = deposito - retirada;
                    System.out.println("tu saldo es: " + saldo);
                    break;
                case 4:
                    System.out.println("ha salido del cajero");
                    break;
                default:
                    System.out.println("opción incorrecta");
                    break;
            }

        } while (opcion != 4);
        /*esto tambien se puede hacer con métodos (procedimientos y funciones)*/

    }

}
