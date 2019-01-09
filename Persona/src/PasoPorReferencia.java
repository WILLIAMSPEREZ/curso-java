public class PasoPorReferencia {

    public static void main(String[] args) {
        Persona p = new Persona();
        p.cambiarNombre("juan");
        imprimirNombre(p);
        modificarPersona(p);
        imprimirNombre(p);

    }

    public static void imprimirNombre(Persona p){

        System.out.println("valor recibido:"  +  p.obtenerNombre());

    }

    public static void modificarPersona(Persona arg){

        arg.cambiarNombre("Carlos");

    }
}


