package archivos;

class ArchivoEditable extends Archivo implements Editable, Guardable {

    public ArchivoEditable(String contenido) {
        super(contenido);
    }

    public void editar(String nuevoContenido) {
        this.contenido = nuevoContenido;
    }

    public void guardar() {
        System.out.println("Archivo guardado " + contenido);
    }
}
