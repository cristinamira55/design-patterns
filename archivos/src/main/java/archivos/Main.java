package archivos;

public class Main {
    public static void main(String[] args)  {

        Archivo miArchivo = obtenerArchivoDelUsuario();

        if (miArchivo instanceof Guardable guardable) {
            guardable.guardar();

        } else {
            System.out.println("Archivo de solo lectura");
        }
    }

    private static Archivo obtenerArchivoDelUsuario() {
        return new ArchivoSoloLectura("Contenido del archivo de solo lectura.");
    }
}