package com.campusdual.exercises.Exercise16;

public class Sandbox {
    public static void main(String[] args) {
//      Plane p1=new Plane("Boeing"); si ponemos de nombre iMachine las funciones nno tiran porque no están definidas en iMachine
//        p1.start();
//        p1.fly();
//        p1.stop();
//        p1.maintenance();
//        System.out.println(p1.getDetailsAvion());
//        Tractor t1=new Tractor(110);
//        t1.start();
//        t1.stop();
//        System.out.println(t1.getDetailsTractor());
        iMachine p1=new Plane("Airbus");
        iMachine t1=new Tractor(1700);
        ((Tractor)t1).stop();//no podría usar las funciones del avion
        ((Plane)p1).fly();

    }
}
