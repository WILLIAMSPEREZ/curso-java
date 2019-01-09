public class Aritmetica {
      // atributo de clase

    int a;
    int b;
    //constructor vacio
    Aritmetica(){

    }

    //constructor con 2 argumentos
    Aritmetica(int arg1, int arg2){

        this.a = arg1;
        this.b = arg2;
    }

    //Este metodo sumar toma  los atributos de la clase

    int sumar(){

        return a + b ;

    }

    //Metodo restar

    int restar(){

        return a-b;

    }
     // Metodo multiplicar

    int multiplicar(){

        return a*b;
    }

    //Metodo dividir
    int dividir(){
        return a/b;
    }











   }
