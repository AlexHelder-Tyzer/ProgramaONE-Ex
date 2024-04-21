import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        /*
        Crea un programa que simule un juego de adivinanzas.
        El programa debe generar un número aleatorio entre 0 y 100,
        y pedir al usuario que intente adivinar ese número en un máximo de 5 intentos.
        En cada intento, el programa debe informar si el número ingresado por el usuario es mayor o menor
        que el número generado.

        Consejos:

        Para generar un número aleatorio en Java: new Random().nextInt(100);
        Utiliza el Scanner para obtener los datos del usuario.
        Utiliza una variable para contar los intentos.
        Utiliza un bucle para controlar los intentos.
        Utiliza la instrucción ‘break;’ para salir del bucle.
         */

        int MAX_INTENTOS = 5;
        int numero = 0;
        int intentos = 0;
        int numeroAleatorio = new Random().nextInt(100);

        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el numero a encontrar: ");
        for (int i = 0; i < MAX_INTENTOS; i++) {
            numero = lectura.nextInt();
            if(intentos+1 < 5){
                if(numero == numeroAleatorio){
                    System.out.println(String.format("Acertaste!! en %d intentos ",intentos+1));
                    break;
                }
                else{
                    if(numero > numeroAleatorio){
                        System.out.println("El numero ingresado es menor");
                    }
                    else{
                        System.out.println("El numero ingresado es mayor");
                    }
                    intentos++;
                }
            }
            else{
                System.out.println("Utilizaste todos tus intentos, suerte para la proxima");
            }

        }


    }
}
