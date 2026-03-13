package taller.mecanico;

public class Main {
    public static void main(String[] args) {
        TallerMecanico taller = new TallerMecanico(
                new Motor(),
                new Aceite(),
                new Ruedas()
        );
        taller.realizarServicio();
    }
}