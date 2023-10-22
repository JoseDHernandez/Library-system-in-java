
package actividadprofundizacion;

public class Datos {
    //Atributos
    private static Datos instance; //Instancia de la propia clase
    private ListaDoble Libros = new ListaDoble(); //Lista de libros
    private Lista Materias = new Lista(); // Lista de mateiras
    private Lista Inicial = new Lista(); //Lista de iniciales de las materias
    //Constructor 
    private Datos() {
    }
    //Obtener instancia de la clase
    public static Datos getInstance() {
        if (instance == null) {
            instance = new Datos();
        }
        return instance;
    }
    //setters 
    public void agregarMateria(String materia){
        Materias.agregar(materia);
    }
    public void agergarIniciales(String inicial){
        Inicial.agregar(inicial);
    }
    public Lista getIniciales(){
        return Inicial;
    }
    public Lista getMaterias(){
        return Materias;
    }
    public void agregarLibro(Libro libro){
        Libros.agregar(libro);
    }
    //Eliminar libro
    public void eliminarLibro(int index){
        Libros.eliminar(index);
    }
    //Editar libro
    public void editarLibro(int index,Libro libro){
        Libros.editar(index, libro);
    }
    //Obtener lista de libros
    public ListaDoble getLibros(){
        return Libros;
    }
}
