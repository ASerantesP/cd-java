package com.campusdual.exercises.Herencia;

//Animal
// Mamífero
//   Perro   ->   Balto
//   Caballo ->   Spirit
// Ave
//    Halcón ->   ???
//    Pollo  ->   Calimero
// Pez
//    Delfín ->   Flipper
//    Orca   ->   Willy
//
//Animal -> Altura / Peso / Edad
// Mamífero, Ave, Pez -> Características únicas de estos animales ->  Habitat + 2 características
// Perro, Caballo, Halcón, Pollo, Delfín, Orca -> Nombre cientifico, Nombre del animal, Territorio donde viven, Sonido del animal
//
//Presentarse -> ONOMATOPEYA DEL SONIDO ("NOMBRE DEL ANIMAL")
public class Ejerciciosnuevos {
    public class Animal {
        protected int altura;
        protected double peso;
        protected String edad;

        public Animal(int altura, double peso, String edad) {
            this.altura = altura;
            this.peso = peso;
            this.edad = edad;
        }

        public void getDetails() {
            System.out.println("El animal mide " + altura + " cm, pesa " + peso + " kg y tiene " + edad + " años");
        }

    }

    public class tipoAnimal extends Animal {
        protected String tipoAnimal;


        public tipoAnimal(int altura, double peso, String edad, String tipoAnimal) {
            super(altura, peso, edad);
            this.tipoAnimal = tipoAnimal;
        }

        @Override
        public void getDetails() {

            System.out.println("Tipo de animal:" + tipoAnimal.toLowerCase() + " Altura: " + altura + " cm, Peso: " + peso + " kg y edad: " + edad + " años");
        }

        ;
    }


    public class mamifero extends Ejerciciosnuevos.tipoAnimal {
        String habitat = "todos los hábitats";
        String reproduccion = "viviparos";
        String desplazamiento = "corren y nadan";

        public mamifero(int altura, double peso, String edad, String tipoAnimal) {
            super(altura, peso, edad, tipoAnimal);

        }

        @Override
        public void getDetails() {
            super.getDetails();
            System.out.println("Tipo de animal:" + tipoAnimal.toLowerCase() + " Altura: " + altura + " cm, Peso: " + peso + " kg y edad: " + edad + " años");
            System.out.println("Hábitat: " + this.habitat + ", Método de reporducción: " + this.reproduccion + " Forma de desplazamiento: " + this.desplazamiento);
        }
    }

    public class ave extends Ejerciciosnuevos.tipoAnimal {
        protected String habitat = "biomas terrestres y oceanicos";
        protected String reproduccion = "oviparos";
        protected String desplazamiento = "vuelan";

        public ave(int altura, double peso, String edad, String tipoAnimal) {
            super(altura, peso, edad, tipoAnimal);
            getDetails();

        }

        @Override
        public void getDetails() {
            super.getDetails();
            System.out.println("Tipo de animal:" + tipoAnimal.toLowerCase() + " Altura: " + altura + " cm, Peso: " + peso + " kg y edad: " + edad + " años");
            System.out.println("Hábitat: " + this.habitat + ", Método de reporducción: " + this.reproduccion + " Forma de desplazamiento: " + this.desplazamiento);
        }

    }

    public class pez extends Ejerciciosnuevos.tipoAnimal {
        protected String habitat = "biomas terrestres y oceanicos";
        protected String reproduccion = "oviparos";
        protected String desplazamiento = "vuelan";

        public pez(int altura, double peso, String edad, String tipoAnimal) {
            super(altura, peso, edad, tipoAnimal);
            getDetails();
        }

        @Override
        public void getDetails() {
            super.getDetails();
            System.out.println("Tipo de animal:" + tipoAnimal.toLowerCase() + " Altura: " + altura + " cm, Peso: " + peso + " kg y edad: " + edad + " años");
            System.out.println("Hábitat: " + this.habitat + ", Método de reporducción: " + this.reproduccion + " Forma de desplazamiento: " + this.desplazamiento);
        }
    }


    public class perro extends mamifero {
        protected String nombreCientifico;
        protected String raza;
        protected String terreno;
        protected String nombre;

        public perro(int altura, double peso, String edad, String tipoAnimal, String nombreCientifico, String nombre, String raza, String terreno) {
            super(altura, peso, edad, tipoAnimal);
            this.nombreCientifico = nombreCientifico;
            this.nombre = nombre;
            this.raza = raza;
            this.terreno = terreno;

        }

        @Override
        public void getDetails() {
            super.getDetails();
            System.out.println("Tipo de animal:" + tipoAnimal.toLowerCase() + " Altura: " + altura + " cm, Peso: " + peso + " kg y edad: " + edad + " años");
            System.out.println("Hábitat: " + this.habitat + ", Método de reporducción: " + this.reproduccion + " Forma de desplazamiento: " + this.desplazamiento);
            System.out.println("Este animal pertenece a la familia " + nombreCientifico + " de raza " + raza + " que se mueve en" + terreno + " y se llama " + nombre);
        }
    }public class caballo extends mamifero {
        protected String nombreCientifico;
        protected String raza;
        protected String terreno;
        protected String nombre;
        public caballo (int altura, double peso, String edad, String tipoAnimal, String nombreCientifico, String nombre, String raza, String terreno) {
            super(altura, peso, edad, tipoAnimal);
            this.nombreCientifico=nombreCientifico;
            this.nombre=nombre;
            this.raza=raza;
            this.terreno=terreno;

        }

        @Override
        public void getDetails() {
            super.getDetails();
            System.out.println("Tipo de animal:" + tipoAnimal.toLowerCase() + " Altura: " + altura + " cm, Peso: " + peso + " kg y edad: " + edad + " años");
            System.out.println("Hábitat: " + this.habitat + ", Método de reporducción: " + this.reproduccion + " Forma de desplazamiento: " + this.desplazamiento);
            System.out.println("Este animal pertenece a la familia "+ nombreCientifico+" de raza "+raza+" que se mueve en"+terreno+" y se llama "+nombre);
        }
    }




}
