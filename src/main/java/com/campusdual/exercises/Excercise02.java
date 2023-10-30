package com.campusdual.exercises;

public class Excercise02 {

    public static void main(String[] args) {
        //área de un círculo  pi * r^2
        //Longitud de una circunferenica  pi*2*r
        //Área de un cuadrado: lado * lado

        double r=7;
        //al ser una constante se quita ula variable pi

        System.out.print("Área del círculo:");
        System.out.println(Math.PI*Math.pow(r,2));//pow es potencia

        System.out.print("Longitud de una circunferencia:");
        System.out.println(Math.PI*2*r);

        int l= 5;

        System.out.print("Área de un cuadrado:");
        System.out.println(l*l);


    }


}
