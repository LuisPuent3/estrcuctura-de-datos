//programa que creara un arreglo

import java.util.Scanner;

public class Arreglo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo = new int[5];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("ingrese un numero");
            arreglo[i] = sc.nextInt();
        }
       
    }

    // mostrar el tamaño del arreglo
    public static void mostrarTamaño(int[] arreglo) {
        System.out.println("el tamaño del arreglo es: " + arreglo.length);
    }

    // mostrar el primer elemento del arreglo
    public static void mostrarPrimerElemento(int[] arreglo) {
        System.out.println("el primer elemento del arreglo es: " + arreglo[0]);
    }

    // mostrar el elemento de una posicion especifica del arreglo
    public static void mostrarElemento(int[] arreglo, int posicion) {
        System.out.println("el elemento de la posicion " + posicion + " es: " + arreglo[posicion]);
    }

    // borrar un elemento del arreglo
    public static void borrarElemento(int[] arreglo) {
        int posicion;
        // ingresar la posicion del elemento a borrar
        System.out.println("ingrese la posicion del elemento a borrar");
        posicion = sc.nextInt();
        for (int i = posicion; i < arreglo.length - 1; i++) {
            arreglo[i] = arreglo[i + 1];
        }
        arreglo[arreglo.length - 1] = 0;
    }

    // menu para mostrar las opciones del arreglo

    public static void menu() {
        System.out.println("1. mostrar tamaño del arreglo");
        System.out.println("2. mostrar primer elemento del arreglo");
        System.out.println("3. mostrar elemento de una posicion especifica del arreglo");
        System.out.println("4. borrar un elemento del arreglo");
        System.out.println("5. salir");
    }
}
