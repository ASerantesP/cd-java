package com.campusdual.exercises.Exercise16;

public class Tractor implements iMachine{
    protected int horsePower=0;
    public Tractor(int hp){
        this.horsePower=hp;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        System.out.println("El tractor está encendido");
    }

    @Override
    public void stop() {
        System.out.println("El tractor está parado");
    }

    @Override
    public void maintenance() {
        System.out.println("El tractor está en mantenimiento");
    }
    public String getDetailsTractor(){
        return "La potencia en caballos del tractor es de "+this.getHorsePower();
    }
}
