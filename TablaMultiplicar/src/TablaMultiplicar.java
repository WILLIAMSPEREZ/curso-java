import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("Introduce un número entero: ");
        i = sc.nextInt();
        System.out.println("Tabla del " + i);


        //for( int i = 1;  i<=10; i++){
          // System.out.println("Tabla del:" + i);

            for ( int  a = 1; a<=10; a++){

                System.out.println(i + " * " + a + " = " + i*a);

               // int multiplicar = i*a;
               // System.out.println(i + "*" + a  +":" + multiplicar);
            }

            System.out.println("---------------------------------");
        }

    }

//}












