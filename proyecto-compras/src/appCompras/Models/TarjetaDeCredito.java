package appCompras.Models;

import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> listaCompras;

    public TarjetaDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaCompras = new ArrayList<>();
    }
    public double getLimite() {
        return limite;
    }

    public List<Compra> getListaCompras() {
        return listaCompras;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean lanzarCompra(Compra compra){
        if(this.saldo >= compra.getPrecio()){
            this.saldo -= compra.getPrecio();
            this.listaCompras.add(compra);
            return true;
        }
        else{
            return false;
        }
    }
}
