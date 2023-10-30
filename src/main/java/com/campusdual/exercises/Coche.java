package com.campusdual.exercises;

public class Coche {
    public String marca;
    public String modelo;
    public int velocidadMax;
    public String combustible;
    public int velocimetro=0;
    public int tacometro=0;

    public Coche (String marca, String modelo, int velocidadMax, String combustible){
        this.marca=marca;
        this.modelo=modelo;
        this.velocidadMax=velocidadMax;
        this.combustible=combustible;
    }
    public void arrancar(){
        this.tacometro=1000;
    }
    public void apagar(){
        this.tacometro=0;
    }
    public int acelerar(){
        this.velocimetro=this.velocimetro+10;
        return this.velocimetro;

    }
    public int frenar(){
        this.velocimetro=this.velocimetro-10;
        return this.velocimetro;
    }
    public void girarVolante(int grados){
        if (grados<0){
            System.out.println("El coche gira a la izquierda");}
        else if(grados>0){
            System.out.println("El coche fira hacia la derecha");
        }else{
            System.out.println("El coche va recto");
        };
        


    }



}
