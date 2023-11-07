package com.campusdual.exercises.Herencia;

public class Animal {
      protected int altura;
      protected int peso;
      protected int edad;

       public Animal(int altura, int peso, int edad) {
           this.altura = altura;
           this.peso = peso;
           this.edad = edad;
       }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) { if (peso>0){
        this.peso = peso;}
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {

           if (edad >0) {this.edad = edad;}
    }
    public String saludar(){
           return "Hola soy un animal";
    };

}

