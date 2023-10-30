package com.campusdual.exercises;
/*Sintaxis de for
 * El bucle for consta de 3 partes:
 * Una expresión de inicialización (se ejecuta al principio, asignando a la variable de control un valor inicial)
 * Una expresión de condición que hará que el bucle se mantenga mientras que se cumpla
 * Una expresión de incremento/decremento sobre la variable de control para conseguir la finalización del bucle
 * El código que se repetirá en cada iteración será el que vaya entre llaves*/

public class Excersise07 {

    //Mostrar los priemros 15 números naturales
    //sumar los 100 primeros naturales


    public static void printNNumbers(int num) {
        for (int i = 0; i < 15; i++) {
            System.out.println((i + 1) + " ");
        }
    }

    public static int sumNumbers(int numb) {
        int sum = 0;
        for (int i = 0; i <= numb; i++) {
            sum += i;
        }
        return sum;
    }

    //    public static void mostrarAbecedario (){
//        for (char letra='A';letra='Z'; letra++){
//            for(char y=letra; y<= 'Z'; letra++)
//                System.out.print(y);
    public static void main(String[] args) {
//        printNNumbers(3);
//        System.out.println(sumNumbers(100));
//        calcularCuadrado();
        contarLetras('D');
        //contarLetras2('R');
    }

    //Mostrar por pantalla los 30 primeros números pares PERO USANDO SOLO FOR
//    public static void mostrar30NumerosPares() {
////        for(int i = 2; i <= 60; i+=2) { //i+=2 --> i = i + 2
////            System.out.println(i);
////        }

//Calcular el cuadrado de los 20 primeros numeros naturales

    public static void calcularCuadrado() {
        for (int i = 1; i <= 20; i++) {
            System.out.print(i * i + " ");
        }
    }
//Construye un método que recibiendo por parámetro una letra del abecedario muestre por pantalla cuantas
//le faltan hasta llegar a la Z

    public static void contarLetras(char letra) {
        int contador = 0;
        for (char i = letra; i <= 'Z'; i++) {
            contador++;
        }
        System.out.println(contador);
    }
}

