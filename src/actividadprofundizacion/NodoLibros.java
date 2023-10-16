package actividadprofundizacion;

public class NodoLibros {
    private Libro libro;
    private NodoLibros siguiente;
    private NodoLibros anterior;

    public NodoLibros(Libro libro) {
        this.libro = libro;
        this.siguiente = null;
        this.anterior = null;
    }

    public Libro getLibro() {
        return libro;
    }

    public NodoLibros getSiguiente() {
        return siguiente;
    }

    public NodoLibros getAnterior() {
        return anterior;
    }

    public void setSiguiente(NodoLibros nodo) {
        this.siguiente = nodo;
    }

    public void setAnterior(NodoLibros nodo) {
        this.anterior = nodo;
    }

    public void editar(Libro libro) {
        this.libro = libro;
    }
}
