
package actividadprofundizacion;

public class Lista {
    
    private Nodo cabeza;
    private int size;
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
