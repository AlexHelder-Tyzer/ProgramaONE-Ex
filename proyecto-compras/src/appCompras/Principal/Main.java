package appCompras.Principal;

import appCompras.Models.Compra;
import appCompras.Models.TarjetaDeCredito;

import javax.swing.event.TableColumnModelListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el limite de la tarjeta: ");

        double limite = lectura.nextDouble();
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(limite);

        int opcion = 1;

        while(opcion != 0){
            System.out.println("Digite la descipcion de la compra: ");
            String descripcion = lectura.next();

            System.out.println("Digite el precio de la compra: ");
            double precio = lectura.nextDouble();

            Compra compra = new Compra(descripcion, precio);
            boolean compraRealizada = tarjeta.lanzarCompra(compra);

            if(compraRealizada){
                System.out.println("Compra realizada!!!");
                System.out.println("Escriba 0 para SALIR, 1 para continuar comprando: ");
                opcion = lectura.nextInt();
            }
            else{
                System.out.println("Saldo insuficiente!");
                opcion = 0;
            }
        }

        System.out.println("*************************");
        System.out.println("*** RESUMEN DE COMPRAS **");

        Collections.sort(tarjeta.getListaCompras());

        for(Compra compra: tarjeta.getListaCompras()){
            System.out.println(compra.getDescripcion() + " - " + compra.getPrecio());
        }

        System.out.println("***************************");
        System.out.println("Saldo: " + tarjeta.getSaldo());
    }
}