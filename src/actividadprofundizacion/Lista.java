
package actividadprofundizacion;

public class Lista {
    private Nodo cabeza; //Nodo
    private int size; //Longitud de la lista
    public Lista() {
        cabeza = null;
        size = 0;
    }
     public void agregar(Object nodo) {
        Nodo nuevo = new Nodo(nodo);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            nuevo.setSiguiente(cabeza);
            cabeza = nuevo;
        }
        size++;
    }
     public Nodo getInicio(){
         return cabeza;
     }
     public int getSize(){
         return size;
     }
}
