/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pabmar
 */
public class PruebaMetodos1 {



//    Escribe un método, de nombre mostrarArrayPantalla2, que reciba por
//    parámetro un array de enteros y muestre sus valores por pantalla
//    separados por comas.
    public static void mostrarArrayPantalla2(double[] matriz) {
        for (int x = 0; x < matriz.length; x++) {
            System.out.print(matriz[x] + " ,");
        }
        System.out.println();
    }

    //    Escribe un método, de nombre obtenerArrayComoString, que reciba
//    un array de enteros por parámetro y devuelva una cadena de
//    caracteres con su contenido.
    public static void obtenerArrayComoString(String[] matriz) {

        System.out.println(Arrays.toString(matriz));

    }

//    Escribe un método, de nombre completarArray3, que reciba un array
//    de enteros por parámetro y lo rellene de forma que contenga tantos
//    números pares, a partir del cero, como permita su capacidad.
    public static void completarArray3(int[] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = (int) (((Math.random() * 9) + 1) * 2);
        }

        System.out.println(Arrays.toString(matriz));

    }

//    Escribe un método, de nombre obtenerSumaArray, que reciba por
//    parámetro un array de enteros y devuelva la suma de sus elementos.
    public static int obtenerSumaArray(int[] matriz) {
        int contadorSuma = 0;
        for (int i = 0; i < matriz.length; i++) {
            contadorSuma += matriz[i];
        }
        return contadorSuma;
    }

//    Escribe un método, de nombre arrayPotencias2, que cree un array y lo
//    rellene con potencias de 2. Las potencias de 2 comenzarán en 2º y el
//    número total de ellas se recibirá por parámetro. El método devolverá el
//    array creado.
    public static double[] arrayPotencias2(double[] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = Math.pow(2, i);
        }
        return matriz;
    }

//    Escribe un método que reciba como parámetro un array de cadenas y
//    devuelva la cadena resultante de concatenar todas las contenidas en
//    el array.
    public static String arrayCadenasConcatenadas() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena de caracteres ");
        String[] matrizCadena = new String[5];
        String cadenaConcatenada = "";
        for (int i = 0; i < matrizCadena.length; i++) {
            matrizCadena[i] = teclado.nextLine();
            cadenaConcatenada += matrizCadena[i];
        }
        for (int x = 0; x < matrizCadena.length; x++) {
            System.out.print(matrizCadena[x] + " | ");
        }
        System.out.println("");
        return cadenaConcatenada;

    }

//    Escribe un método, de nombre obtenerSumaLongCadArray, que
//    reciba por parámetro un array de cadenas y devuelva el número total
//    de caracteres de todas las cadenas del array.
    public static int obtenerSumaLongCadArray() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena de caracteres ");
        String[] matrizCadena = new String[5];
        String cadenaConcatenada = "";
        for (int i = 0; i < matrizCadena.length; i++) {
            matrizCadena[i] = teclado.nextLine();
            cadenaConcatenada += matrizCadena[i];
        }
        return cadenaConcatenada.length();
    }

//    Escribe un método, de nombre obtenerLongCadenas, que reciba por
//    parámetro un array de cadenas y devuelva un array de enteros con los
//    tamaños de las cadenas contenidas en el array.
    public static int[] obtenerLongCadenas() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena de caracteres ");
        String[] matrizCadena = new String[5];
        for (int i = 0; i < matrizCadena.length; i++) {
            matrizCadena[i] = teclado.nextLine();
        }
        int[] longitudCadena = new int[matrizCadena.length];
        for (int i = 0; i < matrizCadena.length; i++) {
            longitudCadena[i] = matrizCadena[i].length();
        }
        return longitudCadena;
    }

//    Escribe un método, de nombre obtenerArrCad5Vocales, que reciba por
//    parámetro un array de cadenas y devuelva un array con las que
//    contengan las 5 vocales. Para la consideración de un carácter como
//    vocal no se tendrá en cuenta si está en mayúsculas o minúsculas
    public static String[] obtenerArrCad5Vocales() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena de caracteres ");
        String[] matrizCadena = new String[5];
        for (int i = 0; i < matrizCadena.length; i++) {
            matrizCadena[i] = teclado.nextLine();
        }

        int contador = 0;
        int k = 0;
        String[] aux = new String[matrizCadena.length];
        for (int i = 0; i < matrizCadena.length; i++) {
            if (matrizCadena[i].toLowerCase().contains("a")
                    && matrizCadena[i].toLowerCase().contains("e")
                    && matrizCadena[i].toLowerCase().contains("i")
                    && matrizCadena[i].toLowerCase().contains("o")
                    && matrizCadena[i].toLowerCase().contains("u")) {
                aux[k++] = matrizCadena[i];
                contador++;
            }
        }

        String[] vocales = new String[contador];

        for (int i = 0; i < contador; i++) {
            vocales[i] = aux[i];
        }

        return vocales;
    }
    
    
//    Escribe un método, de nombre obtenerArrayOrdAlfab, que reciba por
//    parámetro un array de cadenas de caracteres y las ordene alfabéticamente.
//    La ordenación no se verá afectada por la expresión de los caracteres
//    expresados en mayúsculas o minúsculas. Es decir, las cadenas “ALBACETE”, 
//    “antonio”, y “BURGOS” quedarán ordenadas en este mismo orden.
    
    public static void obtenerArrayOrdAlfab(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena de caracteres ");
        String[] matrizCadena = new String[5];
        for (int i = 0; i < matrizCadena.length; i++) {
            matrizCadena[i] = teclado.nextLine();
        }
        Arrays.sort(matrizCadena);
    }
    

//        mostrarArrayPantalla2(matriz);
//        obtenerArrayComoString(matriz);
//        completarArray3(matriz);
//        System.out.println(obtenerSumaArray(matriz));
//        mostrarArrayPantalla2(arrayPotencias2(matriz));
//        System.out.println(arrayCadenasConcatenadas);
//        System.out.println(obtenerSumaLongCadArray());
//        obtenerArrayComoString(obtenerLongCadenas());
//        obtenerArrayComoString(obtenerArrCad5Vocales());
       obtenerArrayOrdAlfab();
    }
