import java.util.Scanner;

public class FiguraR {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la altura");
        int altura = scanner.nextInt();
        System.out.println("Introduce el ancho");
        int ancho = scanner.nextInt();

        for(int  i=0;  i<altura; i++){
            for (int a=0; a<ancho; a++){

                System.out.print("*");
            }
            System.out.println();
        }


    }

}
