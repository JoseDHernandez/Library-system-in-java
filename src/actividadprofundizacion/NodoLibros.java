package actividadprofundizacion;

public class NodoLibros {
    private Libro libro; //Objecto libro
    //Punteros
    private NodoLibros siguiente; 
    private NodoLibros anterior;
    //Crear nodo
    public NodoLibros(Libro libro) {
        this.libro = libro;
        this.siguiente = null;
        this.anterior = null;
    }
    //Obtener contenido
    public Libro getLibro() {
        return libro;
    }
    //Obtener y fijar punteros
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
    //Cambiar valor del nodo
    public void editar(Libro libro) {
        this.libro = libro;
    }
}
