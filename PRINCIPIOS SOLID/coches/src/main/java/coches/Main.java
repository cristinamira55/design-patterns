package coches;

public class Main {
    public static void main(String[] args) {
        Coche[] arrayCoches = {
                new Coche("Renault", 18000),
                new Coche("Audi", 25000)
        };

        imprimirPrecioMedioCoche(arrayCoches);

    }
    public static void imprimirPrecioMedioCoche(Coche[] arrayCoches){
        ImprimirPrecio calcular = new CalculadoraPrecio(arrayCoches);
        calcular.precioCoche();
    }
}