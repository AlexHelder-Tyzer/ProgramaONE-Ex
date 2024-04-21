import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Escribe un programa que convierta una temperatura en grados Celsius a Fahrenheit.
        Utiliza variables para representar los valores de las temperaturas e imprime en la
        consola el valor convertido de Celsius a Fahrenheit.

        Después de terminar, probar y verificar que tu programa se haya ejecutado correctamente,
        crea una variable entera para mostrar la temperatura en Fahrenheit sin decimales.
        Recuerda que probablemente necesitarás realizar un casting de valores.*/

        Scanner lectura = new Scanner (System.in);
        System.out.println("Ingrese la temperatura en Celsius: ");
        float tempCelsius = lectura.nextFloat();
        //float tempCelsius = 45.5f;
        float tempFahrenheit = (tempCelsius * 1.8f) + 32;
        System.out.println(String.format("Temperatura en Fahrenheit: %.2f",tempFahrenheit));

        int tempFahSinDecimales = (int)tempFahrenheit; // casting de float a int
        System.out.println(String.format("Temperatura en Fahrenheit sin decimales: %d",tempFahSinDecimales));
    }
}