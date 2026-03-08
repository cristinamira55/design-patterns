package coches;

public class Coche {
    private String marca;
    private int precio;

    public Coche(String marca, int precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public int getPrecio() {
        return precio;
    }
}