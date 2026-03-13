package coches;

public class CalculadoraPrecio implements ImprimirPrecio{
    private final Coche[] arrayCoches;

    public CalculadoraPrecio(Coche[] arrayCoches){
        this.arrayCoches = arrayCoches;
    }

    public double calcularPrecioMedio(){
        int suma = 0;
        for (Coche coche : arrayCoches) {
            suma += coche.getPrecio();
        }
        return (double) suma / arrayCoches.length;
    }

    @Override
    public void precioCoche() {
        System.out.println("Precio medio: " + calcularPrecioMedio() + "EUR");

    }
}
