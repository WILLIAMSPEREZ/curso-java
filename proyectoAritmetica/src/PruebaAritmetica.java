public class PruebaAritmetica {
    public static void main(String[] args) {



        //variables locales
        int operandoa = 6;
        int operandob = 2;

        //creamos un objeto de la clase  Aritmetica enviado argumentosd

        Aritmetica objeto1 = new Aritmetica(operandoa, operandob);

        //imprimimos los valores de los operando

        System.out.println("operandoa = " + operandoa);
        System.out.println("operandob = " + operandob);

        //Imprimimos el resultado de suma
        System.out.println("\nResultado suma:"  +  objeto1.sumar());

        //imprimo el valor restar
        System.out.println("\nResultado de la resta:"  +  objeto1.restar());

        //imprimimos el valor de multiplicar
        System.out.println("\nResultado de la multiplicacion:"  +  objeto1.multiplicar());

        //imprimimos el valor de la divicion
        System.out.println("\nResultado de la division:"  +  objeto1.dividir());


    }

}
