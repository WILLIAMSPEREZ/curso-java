import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {

        Boolean respuesta = true;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Genera un numero al azar piedra papel o tijera");
            int pc = (int)(Math.random()*2);
            String[] opcion;
            opcion  = new String[2];
            opcion[0] = "piedra";
            opcion[1] = "papel";
            opcion[2] = "tijera";
            String pcseles = opcion[pc];
            String mano = scanner.next();

            if (mano.equals("piedra")){
                if(pcseles == "tijera"){
                    System.out.println("Ganaste la pc eligio:" + pcseles);
                }
                else if (pcseles == "papel"){
                    System.out.println("Perdiste la pc eligio:" + pcseles);
                }
                else{
                    System.out.println("empate");
                }
            }
            if (mano.equals("papel")){
                if (pcseles == "piedra"){
                    System.out.println("Ganaste la pc eligio:" + pcseles);
                }
                else if (pcseles == "tijera"){
                    System.out.println("Perdiste la pc eligio:" + pcseles);
                }
                else{
                    System.out.println("Empate");
                }
            }
            if (mano.equals("tijera")){
                if (pcseles == "papel"){
                    System.out.println("Ganaste la pc eligio:" + pcseles);
                }
                else if (pcseles == "piedra"){
                    System.out.println("Perdiste la pc eligio:" + pcseles);
                }
                else{
                    System.out.println("Empate");
                }
            }

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Escribe si quieres seguir jugando si o no");
            String respuestaf = scanner.next();

            if (respuestaf.equals("si")){
                respuesta = true;
            }else
                respuesta = false;


        }while(respuesta);



        }
}





