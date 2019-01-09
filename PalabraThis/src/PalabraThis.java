public class PalabraThis {
    public static void main(String[] args) {

        Persona persona = new Persona("Juan");


    }
}

class Persona{

    String nombre;

    Persona(String nombre){

        this.nombre = nombre;

        //imprimir el objeto persona
        Imprimir imprimir = new Imprimir();
        imprimir.imprimir(this); //this contiene una referencia el objeto persona

    }
}

class Imprimir{
    public void imprimir(Persona p){
        System.out.println("impresion argumento:"  +  p);
        System.out.println("impresion objeto actual (this)"  + this);
    }
}




