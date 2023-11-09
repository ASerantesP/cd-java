package com.campusdual.exercises.Exercise17;

import javax.print.DocFlavor;
import java.sql.SQLOutput;

public class Arrays01 {
    public static void main(String[] args) {
        //Declaración e inicialización de  arrays
        int[] intArray=new int[3];
        String [] stringArray={"1","2","3"};

        //Establecer datos dentro del array
        intArray[0]=10;
        intArray[1]=9;
        intArray[2]=8;

        //Mostrar datos de una posición del array
        System.out.println(intArray[0]);
        System.out.println(stringArray[0]);

        //Longitud o capacidad del array
        System.out.println(intArray.length);
        System.out.println(stringArray.length);

    }

}
