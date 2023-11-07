package com.campusdual.exercises;

public class catEncapsulated {
    private String nombre;
    private String raza;
    private String sexo;
    private String colorOjo = "verde";
    private int guardarEdadEnMeses;
    private int edadEnMeses;
    private int tamañoPelo;
    private String colorPelo;
    private boolean castrado;

    public catEncapsulated(String nombre, String raza, String sexo, int edadEnMeses, int tamañoPelo, String colorPelo, boolean castrado) {
        this.nombre = nombre;
        this.raza = raza;
        this.sexo = sexo;
        this.edadEnMeses = edadEnMeses;
        this.tamañoPelo = tamañoPelo;
        this.colorPelo = colorPelo;
        this.castrado = castrado;
    }

    public int getEdadEnMeses() {
        return edadEnMeses;
    }

    public void setEdadEnMeses(int edadEnMeses) { if (edadEnMeses<0){
        System.out.println("Ese valor no es correcto");}
    else this.edadEnMeses = edadEnMeses;;
    }

    public int getGuardarEdadEnMeses() {
        return guardarEdadEnMeses;
    }

    public void setGuardarEdadEnMeses(int guardarEdadEnMeses) {
        this.guardarEdadEnMeses = guardarEdadEnMeses;
    }

    public int getTamañoPelo() {
        return tamañoPelo;
    }

    public void setTamañoPelo(int tamañoPelo) {
        if(tamañoPelo>=0){
        this.tamañoPelo = tamañoPelo;}
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public void mostrarDetalles() {
        System.out.println("El gato es de nombre " + nombre + ", su raza es " + raza + ", su sexo es " + sexo + ", su color de ojos es " + colorOjo + ", su edad en meses es " + edadEnMeses + ", el tamaño de su pelo es de " + tamañoPelo + " cm, su color de pelo es " + colorPelo);
    }
    public String setColorDeOjos(String colorOjos) {
        if (this.colorOjo != colorOjos) {
            this.colorOjo = colorOjos;
        } return colorOjos;
    }


    public static void main(String[] args) {
    catEncapsulated Gato=new catEncapsulated("","","",0,0,"",false);
    Gato.setColorPelo("castaño");
    Gato.setColorDeOjos("azul");
    Gato.setEdadEnMeses(33);
    Gato.setCastrado(true);
    Gato.mostrarDetalles();

    catEncapsulated Gato2=new catEncapsulated("","siamesa","",0,0,"",false);
    catEncapsulated Gato3=new catEncapsulated("","persa","",0,0,"",false);
    catEncapsulated Gato4=new catEncapsulated("","esfinge","",0,0,"",false);

    Gato2.setCastrado(true);
    Gato3.setCastrado(true);

    Gato2.setColorPelo("Rubio");
    Gato3.setColorPelo("Negro");
    Gato4.setColorPelo("Castaño");

    Gato4.setColorDeOjos("Negro");
    Gato4.setEdadEnMeses(-3);
    Gato4.setEdadEnMeses(5);

    Gato2.mostrarDetalles();
    Gato3.mostrarDetalles();
    Gato4.mostrarDetalles();



    }
}
