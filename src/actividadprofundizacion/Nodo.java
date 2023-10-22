
package actividadprofundizacion;

public class Nodo {
    Object valor; //Contenido del nodo
    Nodo siguiente;// Puntero 
    public Nodo(Object valor){
        this.valor=valor;
        this.siguiente=null;
    }
    public void setSiguiente(Nodo nodo){
        siguiente = nodo;
    }
    public Nodo getSiguiente(){
        return siguiente;
    }
    public Object getValor(){
        return valor;
    }
}
