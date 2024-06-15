package appCompras.Models;

public class Compra implements Comparable<Compra>{
    private String descripcion;
    private double precio;

    public Compra(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return  "descripcion: " + descripcion +
                ", precio: " + precio;
    }

    @Override
    public int compareTo(Compra otraCompra) {
        return Double.valueOf(this.precio).compareTo(Double.valueOf(otraCompra.precio));
    }
}
