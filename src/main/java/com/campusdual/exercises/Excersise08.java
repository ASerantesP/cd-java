package com.campusdual.exercises;
//Ejercicios con while y do while, se ejecuta un bucle hasta que no se cumpla la condicion de ejecución
//Se usa el do while cuando se le pide al usuario que introduzca un dato por pantalla

import com.campusdual.util.Utils;

import java.util.Scanner;

public class Excersise08 {

    public static void main(String[] args) {
//        int variableEvaluar=1;
//        while(variableEvaluar<5){
//            System.out.println("La vartiable a evaluar es menor que 5 porque vale: "+ variableEvaluar);
//            variableEvaluar++;
//        }
//        int variableEvaluar=1;
//        do {
//            System.out.println("la variable a evaluar vale " + variableEvaluar);
//            variableEvaluar++;
//        } while (variableEvaluar<7);
        mostrarSaludoConUtils();
        pedirNumeroConUtils();

    }
    //Pedir al usuario que introdizca un dato
    public static void mostrarSaludo(){
        Scanner scan= new Scanner(System.in);
        String nombreUsuario;
        nombreUsuario=scan.next();
        System.out.println("Hola " + nombreUsuario + " ! ¿Cómo estás?");

    }
    public static void mostrarSaludoConUtils(){
      String nombreUsuraio = Utils.string("Intriduce tu nombre: ");
      //La línea 34 es exactamente igual que la 26,27,28
        System.out.println("Hola,"+nombreUsuraio+ "¿Cómo estás?");
    }
    public static void pedirNumeroConUtils(){
        int numeroParaMostrar;
        do{
            numeroParaMostrar=Utils.integer();
            System.out.println("Introduce un número mmayor que 5: ");
        } while(numeroParaMostrar<5);
        System.out.println("El número que has escrito es: "+numeroParaMostrar);
    }
}
//Para evitar bucles infinitos hay dos estructuras de control
//Break rompe el bucle más cercano
