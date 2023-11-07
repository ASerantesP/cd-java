package com.campusdual.exercises.Herencia;

public class Pez extends Animal {
    protected String habitat;
    protected String reproduccion;
    protected String desplazamiento;

    public Pez(int altura, int peso, int edad, String habitat, String reproduccion, String desplazamiento) {
        super(altura, peso, edad);
        this.habitat = habitat;
        this.reproduccion = reproduccion;
        this.desplazamiento = desplazamiento;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getReproduccion() {
        return reproduccion;
    }

    public void setReproduccion(String reproduccion) {
        this.reproduccion = reproduccion;
    }

    public String getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(String desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public void presentarse1() {
        System.out.println(saludar() + " concretamente un pez");

    }
}
