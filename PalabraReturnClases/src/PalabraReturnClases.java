public class PalabraReturnClases {
    public static void main(String[] args) {

        suma s = creaObjetoSuma();
        int Resultado = s.a + s.b;
        System.out.println("Resultado = " + Resultado);



    }

    public static suma creaObjetoSuma(){

        suma s = new suma(3,4);
        return s;
    }

}

class suma{

    int a;
    int b;

    suma(int a, int b){

        this.a = a;
        this.b = b;

    }
}
