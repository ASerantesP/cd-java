package com.campusdual.exercises;

import java.sql.SQLOutput;

public class Coche {
    public String marca;
    public String modelo;
    public int velocidadMax;
    public String combustible;
    public int velocimetro=0;
    public int tacometro=0;
    public boolean encendido;
    public int giro;

    public Coche (String marca, String modelo, int velocidadMax, String combustible){
        this.marca=marca;
        this.modelo=modelo;
        this.velocidadMax=velocidadMax;
        this.combustible=combustible;
    }
    public void arrancar(){
        this.tacometro=1000;
        this.encendido=true;
    }
    public void apagar(){
        if(this.velocimetro!=0){
            this.encendido=false;
        this.tacometro=0;}
    }
    public int acelerar(){
        if (this.encendido == true) {
            if(this.velocimetro<120) {
                this.velocimetro = this.velocimetro + 10;
            }
        } return this.velocimetro;


    }
    public int frenar(){
        if(this.velocimetro>0){
        this.velocimetro=this.velocimetro-10;
        } return this.velocimetro;
    }
    public void girarVolante(int grados){
        if (grados<0){ if (grados<-45){
            grados=-45;
        }
            System.out.println("El coche gira a la izquierda");
        this.giro=grados;}
        else if(grados>0){ if (grados>45){
            grados=45;}
            System.out.println("El coche gira hacia la derecha");
            this.giro=grados;
        }else {
            System.out.println("El coche va recto");
            this.giro=grados;
        }
    }
    public void marchaAtras(){
        System.out.println("El coche va marcha atrás");
    }
    public void mostrarDetalles(){
        System.out.println(this.marca+ " "+this.modelo+" "+this.velocidadMax+" "+this.combustible);
        System.out.println(this.velocimetro+" km/h "+this.tacometro+ " RPM "+this.giro+"º");

    }
    public static void main(String[] args) {
        Coche miCoche=new Coche("BMW","M3",270,"Gasolina");
        System.out.println("Muestro los detalles del coche");
        miCoche.mostrarDetalles();
        System.out.println("Arranco el coche");
       miCoche.arrancar();
        System.out.println("Acelero el coche");
       miCoche.acelerar();
       for(int i=0;i<15;i++){
           miCoche.acelerar();
       }
        System.out.println("Freno el coche 25 veces");
       for(int i=0; i<25;i++){
       miCoche.frenar();}
        System.out.println("Muestro los detalles del coche");
       miCoche.girarVolante(35);
        miCoche.mostrarDetalles();

    }

}
