package com.campusdual.exercises.Exercise16;

public class Plane implements iMachine{
    private final String name;
    public Plane(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void start() {
        System.out.println("El avión está encendido");
    }

    @Override
    public void stop() {
        System.out.println("El avión está parado");
    }

    @Override
    public void maintenance() {
        System.out.println("El avión está en mantenimiento");
    }
    public void takeoff(){
        System.out.println("El avión despega");
    }
    public void land(){
        System.out.println("El avión aterriza");
    }
    public void fly(){
        System.out.println("El avión está volando");
    }
    public String getDetailsAvion(){
        return "El modelo del avión es "+this.getName();
    }
}

