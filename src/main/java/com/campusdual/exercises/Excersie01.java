package com.campusdual.exercises;

import java.security.KeyStore;

public class Excersie01 {

    public static void main(String[] args) {
        System.out.print("Hello World!");
        //tipo de elementos
        //se puede cambiar un string de texto a un número siempre que contenga un número
        String cnv= "200"; //cnv de convert
        int cnvInt=Integer.parseInt(cnv); //convertir a entero esta cadena de texto, se usa el int primitivo siempre que se pueda
        System.out.println(cnv+1); //Aquí da 2001 la salida porque al añadir un 1 a la cadena de texto lo interpreta como un caracter
        System.out.print(cnvInt+1);
        cnv=cnv+1;
        cnvInt = cnvInt + 1; //Aquí da error porque intentas añadir a un entero una cadena de texto
        String cnvStr = String.valueOf(cnvInt); //No pueden tener el mismo nombre dos varibales
        //Todos los índices empiezan por 0 (de 201 el indice 0 es 2, el 1 es 0 y el 2 es 1)
        char cnvChar =cnvStr.charAt(2);
        // 1= "1"=1.0= "true", 0="0"=0.0=false, 2="2"=2.0=true (Solo el 0 es false, el resto son verdaderos)
        int i=1;
        String iStr= String.valueOf(i);
        Double iDouble= Double.valueOf(iStr);
        String iDStr =String.valueOf(iDouble);
        System.out.println(Boolean.valueOf(iDStr));

        //Operadores aritméticos (Devuelven un valor)
        //Módulo= Resto de una división (usando %)
        //Incremento= aumenta el valor en una unidad i++ con i=3 sería 4 (usa++)
        //Decremento= reduce el valor en una unidad i-- con i=3 sería 3

        //Operadores lógicos (Devuelven un boolean)
        // Igual se usa con ==, 4==4 devolvería Verdadero
        //AND es verdeadero cuando ambas son verdaderas, en caso contrario es falso
        //OR es falso cuando ambos es falso, en caso contrario es verdadero

        //Una función siempre devuelve un valor y utilizan el valor static (estático); recibiendo parámetros de entrada (ej:el parseInt)

        //Los procedimientos son un conjunto de instrucciones que nunca decuelven un valor, actúa sobre los elementos (el print)

        //Los métodos están asociados SIEMPRE a un objeto, tiene que ser algo que haga una acción

        //Las estructuras nos sirven para hacer búcles o áboles de decisión








}
}
