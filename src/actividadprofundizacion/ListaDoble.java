package actividadprofundizacion;

public class ListaDoble {
    private NodoLibros cabeza;
    private NodoLibros cola;
    private int size;

    public ListaDoble() {
        cabeza = null;
        cola = null;
        size = 0;
    }
    
    public int getSize(){
        return size;
    }
    public void agregar(Libro libro) {
        NodoLibros nuevo = new NodoLibros(libro);

        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
            cabeza = nuevo;
        }

        size++;
    }
    public Object[][] getLibros(){
        Object[][] libros = new Object[size][5];
        NodoLibros temp = cabeza;
        int i = 0;
        while(temp != null){
            Libro act = temp.getLibro();
            libros[i][0] = act.getCodigo();
            libros[i][1] = act.getNombre();
            libros[i][2] = act.getAutor();
            libros[i][3] = act.getMateria();
            libros[i][4]=act.getNumeroPaginas();
            temp= temp.getSiguiente();
            i++;
        }
        return libros;
    }
    
    public void editar(int index, Libro libro) {
        if (index < 0 || index >= size) {
            System.out.println("Índice fuera de rango.");
            return;
        }

        NodoLibros temporal = cabeza;
        for (int i = 0; i < index; i++) {
            temporal = temporal.getSiguiente();
        }

        temporal.editar(libro);
    }
    public int buscarCodigo(String code){
        NodoLibros temporal = cabeza;
        for (int i = 0; i < size; i++) {
            if(code.equalsIgnoreCase(temporal.getLibro().getCodigo())){
                return i;
            }else{temporal = temporal.getSiguiente();}
        }
        return -1;
    }
    public Libro obtenerLibro(int index){
        NodoLibros temporal = cabeza;
        for (int i = 0; i < index; i++) {
            temporal = temporal.getSiguiente();
        }
        return temporal.getLibro();
    }
    public void eliminar(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Índice fuera de rango.");
            return;
        }
        NodoLibros temporal = cabeza;
        for (int i = 0; i < index; i++) {
            temporal = temporal.getSiguiente();
        }
        //nodos anteriores y siguientes al indicado 
        NodoLibros nodoAnterior = temporal.getAnterior();
        NodoLibros nodoSiguiente = temporal.getSiguiente();

        if (nodoAnterior != null) {
            nodoAnterior.setSiguiente(nodoSiguiente);
        } else {
            cabeza = nodoSiguiente;
        }

        if (nodoSiguiente != null) {
            nodoSiguiente.setAnterior(nodoAnterior);
        } else {
            cola = nodoAnterior;
        }

        size--;
    }
    public boolean isNull (){
        return (cabeza==null)?true:false;
    }
}
