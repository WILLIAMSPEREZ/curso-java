import java.util.Scanner;

public class ParoImpar {
    public static void main(String[] args) {

        int cantidad, numero, pares=0, impares=0;
        System.out.print("Cuantos numeros desea ingresar: ");
        Scanner scanner = new Scanner(System.in);
        cantidad = scanner.nextInt();

        for(int i=1; i<=cantidad; i++){
            System.out.print("Ingresar numero " + i + " de " + cantidad + ":  ");
            numero = new Scanner(System.in).nextInt();

            if(numero%2 == 0)
                pares++;
            else
                impares++;
        }

        System.out.println("\nCantidad de numeros pares: " + pares);
        System.out.println("Cantidad de numeros impares: " + impares);

    }
}
