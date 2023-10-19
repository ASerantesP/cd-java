package com.campusdual;

public class Exercise03 {
    //Funciones y procedimientos van fuera del main

    public static String saludo(String nombre){
        String mensaje="Hola, Bienvenido: "+nombre;
                return mensaje;}

    public static void fechaActual(String fecha){
        System.out.println(fecha);
    }

    public static void main(String[] args) {
        System.out.println(saludo("Pablo"));
        fechaActual("19/10/2023");
    }
}
