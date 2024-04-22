import java.util.Scanner;

public class CuentaBancaria {
    public static void main(String[] args) {
        String cliente = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldo = 1000000.15d;

        double montoRetiro = 0;
        double montoDeposito = 0;

        int opcion = 0;

        Scanner lectura = new Scanner(System.in);

        while(opcion != 9){
            Menu();
            opcion = lectura.nextInt();
            switch (opcion){
                case 1:
                    System.out.println(String.format("Nombre del cliente: %s", cliente));
                    System.out.println(String.format("Tipo de cuenta: %s", tipoCuenta));
                    System.out.println(String.format("Saldo disponible: %.2f $", saldo));
                    break;
                case 2:
                    System.out.println("Ingrese el monto de retiro: ");
                    montoRetiro = lectura.nextDouble();
                    if(montoRetiro < saldo && montoRetiro > 0){
                        saldo -= montoRetiro;
                        System.out.println("Saldo retirado exitosaente");
                    }
                    else{
                        System.out.println("No tiene suficiente saldo en su cuenta");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el monto de deposito: ");
                    montoDeposito = lectura.nextDouble();
                    if(montoDeposito > 0){
                        saldo += montoDeposito;
                        System.out.println("Saldo depositado exitosaente");
                    }
                    else{
                        System.out.println("Ingrese un monto valido");
                    }
                    break;
            }
        }
    }

    public static void Menu(){
        System.out.println("********************************");
        System.out.println("** Escriba la opcion deseada **");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Retirar");
        System.out.println("3. Depositar");
        System.out.println("9. Salir");
    }
}
