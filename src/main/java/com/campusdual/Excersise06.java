package com.campusdual;

import java.util.Calendar;

public class Excersise06 {
    //Switch es una estructura que usa varias alternativas, si ninguna de las comparaciones entr dentro del valor de los case entra en el default
    //El valor que sale del paréntesis es el que se compara en los cases

    //Comprobar cual es la estacion del año
    //Comprobar si es de mañana, de tarde o de noche
    public static String  checkSeason(int month) {
        String season = "";
        switch (month + 1) {
            case 1:
            case 2:
            case 3:
                season = "Invierno";
                break;
            case 4:
            case 5:
            case 6:
                season = "Primavera";
                break;
            case 7:
            case 8:
            case 9:
                season = "Verano";
                break;
            case 10:
            case 11:
            case 12:
                season = "Otoño";
                break;
            default:
            season="Must be 0-11";
            break;

        }
        return season;
    }

    public static int checkHour (int hour){
        switch(hour){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Es de madrugada");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Es de mañana");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                System.out.println("Es de tarde");
                break;
            case 20:
            case 21:
            case 22:
            case 23:
                System.out.println("Es de noche");
                break;

        }
        return hour;
    }


        public static void main (String[]args){
            Calendar cal = Calendar.getInstance();
            int month = cal.get(Calendar.MONTH);
            int hour = cal.get(Calendar.HOUR_OF_DAY);

            System.out.println(checkSeason(month));
            System.out.println(checkHour(hour));
        }
    }
