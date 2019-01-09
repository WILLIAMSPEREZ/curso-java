public class PruebaCaja {
    public static void main(String[] args) {

        //Agregar medidas de los atributos
        int medidaAncho = 3;
        int medidaAlto = 2;
        int medidaProfundo = 6;


        //Agregar un objeto
        Caja caja1 = new Caja();
        int Resultado =caja1.calcularVolumen(medidaAncho, medidaAlto, medidaProfundo );
        System.out.println("Resultado = " + Resultado);



        Caja caja2 = new Caja(2,4,6);
        System.out.println("Resultado de caja2 = " + caja2.calcularVolumen());






    }
}


