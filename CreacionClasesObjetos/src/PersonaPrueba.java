public class PersonaPrueba {

    public static void main(String[] args) {

        //Creacion de un objeto

        Persona persona1 = new Persona();


        //Lllamando a un metodo del objeto creado
        System.out.println("Valores por default del objeto persona");
        persona1.desplegarNombre();

        //Modificar valores del objeto creado

        persona1.nombre = "Juan";
        persona1.apellidoPaterno = "Esparza";
        persona1.apellidoMaterno = "Lara";

        //Volver a llamar al metodo

        System.out.println("\nNuevos valores del objeto Persona");

        persona1.desplegarNombre();

        //Creacion de un segundo objeto

        Persona persona2 = new Persona();

        System.out.println("\nCreacion de nuevo objeto");
        persona2.nombre = "Carlos";
        persona2.desplegarNombre();



       }



    }

}
