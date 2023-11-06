package com.campusdual.exercises;
/*
 Crea una clase llamada Cat
 La clase debe tener las siguientes propiedades sin inicializar:
 - nombre (name)
 - raza (breed)
 - sexo (sex)
 - edad en meses (age) (estática)
 - tamaño del pelo (hair)
 - color del pelo (colour) (estática)
 - un booleano que indique si está castrado/a o no (castrated)I

 La clase debe tener las siguientes propiedades con los valores inicializados
 - el color de los ojos (eyeColour): "green"

 Crea un constructor que incluya todos los atributos no inicializados

 Crea un método estático que cambie el color del pelo y otro no estático que cambie el color de los ojos

 Crea un método estático que cambie la edad del gato y otro no estático que permita recuperar ese valor cuando se invoque

 Crea un método no estático que castre a los gatos y otro no estático, llamado isCastrated, que devuelva su estado

 Crea un método no estático llamado catDetails() que muestre todas las características de un gato (sé original en la presentación de los datos, dale un poco de arte)

 Crea un main()

 Crea un gato de la raza siamesa, otro de raza persa, y otro de raza esfinge

 Castra a los dos primeros gatos cambiando su booleano a true. Deja el otro gato sin castrar (false)

 Cámbiale el color del pelo a los dos primeros gatos

 Cámbiale el color de los ojos al último gato

 Cambia la edad del último gato. Intenta ponerle un valor negativo (su setter debe hacer la comprobación)

 Muestra los detalles de cada gato (fijaros qué dato muestra en la edad y el color del pelo)

 Vuelve a hacer el ejercicio en una nueva clase CatEncapsulated, aplicando la encapsulación (atributos private, ninguno estático, getters y setters)
Verás cómo afecta a los métodos estáticos
*/
public class Cat {
    public String nombre;
    public String raza;
    public String sexo;
    public String colorOjo="verde";
    public int guardarEdadEnMeses;
    public static int edadEnMeses;
    public int tamañoPelo;
    public static String colorPelo;
    public boolean castrado;

    public Cat(String nombre, String raza, String sexo, int edadEnMeses,int tamañoPelo,String colorPelo, boolean castrado){
        this.nombre=nombre;
        this.raza=raza;
        this.sexo=sexo;
        Cat.edadEnMeses=edadEnMeses;
        this.tamañoPelo=tamañoPelo;
        Cat.colorPelo=colorPelo;
        this.castrado=castrado;

    }
    public void mostrarDetalles(){
        System.out.println("El gato es de nombre "+ this.nombre+", su raza es "+this.raza+", su sexo es "+this.sexo+", su color de ojos es "+this.colorOjo+", su edad en meses es "+Cat.edadEnMeses+", el tamaño de su pelo es de "+this.tamañoPelo+" cm, su color de pelo es "+Cat.colorPelo);
    }
    public String cambiarColorDeOjos(String colorOjos){
        if ( this.colorOjo!=colorOjos){
            System.out.println("El color de ojos ha sido cambiado a "+ colorOjos);
            this.colorOjo=colorOjos;
        }
        return this.colorOjo;
    }

    public static String getColorPelo() {
        return colorPelo;
    }

    public static void setColorPelo(String colorPelo) {
        Cat.colorPelo = colorPelo;
    }


    public static int getEdadEnMeses() {
        return edadEnMeses;
    }

    public static void setEdadEnMeses(int edadEnMeses) {
        if(edadEnMeses>0){
        Cat.edadEnMeses = edadEnMeses;
        } else
            System.out.println("Esa edad no es válida");
    }
    public int mostrarEdad(){
        this.guardarEdadEnMeses=edadEnMeses;
        if(edadEnMeses>0){
        System.out.println("La edad en meses es: "+this.guardarEdadEnMeses);}
        return this.guardarEdadEnMeses;
    }


    public boolean isCastrated(){
        if(this.castrado==true){
        System.out.println("El gato "+ this.raza + " está castrado ");
        }else System.out.println("El gato "+this.raza+" no está castrado");
    }

//    public void cambioPelo(){
//        this.cambioPelo=colorPelo;
//        if(getColorPelo()!=colorPelo){
//            this.cambioPelo=getColorPelo();
//        }
//    }




    public static void main(String[] args) {
        Cat Gato =new Cat("","","",0,0,"",true);
        Cat Gato2 = new Cat("","","",0,0,"",true);
        Cat Gato3 = new Cat("","","",0,0,"",true);
        Cat Gato4 = new Cat("","","",0,0,"",true);


        Gato.cambiarColorDeOjos("azul");
        Cat.setColorPelo("verde");
        Cat.setEdadEnMeses(10);
        Gato.mostrarEdad();
        Gato.isCastrated();
        Gato.mostrarDetalles();

        Gato2.isCastrated();
        Gato3.isCastrated();
        Gato4.isCastrated();

        Cat.setColorPelo("marrón");
        Cat.getColorPelo();
        Gato.mostrarDetalles();
        Gato2.mostrarDetalles();

        Gato4.cambiarColorDeOjos("castaño");
        Gato4.mostrarDetalles();

        Cat.setEdadEnMeses(17);
        Gato4.mostrarEdad();
        Gato4.mostrarDetalles();

    }


}

