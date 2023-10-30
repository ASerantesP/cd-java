package com.campusdual.exercises;

public class Exercise05 {
    //Comprobar si un número es positivo o negativo. Mayor o menor que 0
    //Comprobar si un número es múltiplo de otro. Resto de la división es 0
    //Comprobar si un número es menor a otro. Mayor que el otro

    public static void main(String[] args) {
        System.out.print("Comprobar si el numero es positivo o negativo: ");
        esPositivo( 0);

        System.out.print("Comprobar si son múltiplos 2 números: ");
        esMultiplo(6,3);

        System.out.print("Comprobar si un numero es mayor que el otro");
        esMayor(5,4);

    }
    public static void esPositivo(int numero){
        if (numero>=0) {
            System.out.println("Es un numero positivo");
        }else {
            System.out.println(" Es un numero negativo");
        }
    }
    public static void esMultiplo(int numero1,int numero2){
        int resto= numero1%numero2;

        if (resto==0){
            System.out.println("Es mn múltiplo del otro");
        }else{
            System.out.println("No son multiplos");
        }

    }
    public static void esMayor(int num1, int num2){
        if (num1>num2){
            System.out.println("Es mayor: ");
        } else if (num1<num2){
            System.out.println("Es menor: ");
        }else{
            System.out.println("Son el mismo número: ");        }
    };

}
