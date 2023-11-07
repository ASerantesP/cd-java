package com.campusdual.exercises.Herencia;

import java.sql.SQLOutput;


public class SandboxHerencias {


    public static void main(String[] args) {
        Perro p1 = new Perro(89, 23, 10, "domestico", "negro", "corre",
                "canis", "Balto", "mi casa", "oof");
        Caballo c1 = new Caballo(170, 100, 10, "serra gallega", "marron", "galopa",
                "equus", "Spirit", "o monte", "relincho");
        Halcón h1 = new Halcón(78, 10, 5, "salvaje", "oviparo", "vuela", "falco",
                "Figueroa", "el cielo", "gañido");
        Pollo po1 = new Pollo(15, 5, 1, "domestico", "oviparo", "patea",
                "gallus", "Calimero", "corral", "pio pio");
        Rape r1 = new Rape(30, 5, 1, "salvaje", "oviparo", "nada",
                "Lophius piscatorius", "Flipper", "oceano", "glu glu ");
        Sardina s1 = new Sardina(23, 1, 20, "salvaje", "oviparo", "nada",
                "Sardina pilchardus", "Willy", "oceano", "im a fish g");
        p1.presentarse1();
        c1.presentarse1();
        h1.presentarse1();
        po1.presentarse1();
        r1.presentarse1();
        s1.presentarse1();



    }

}
