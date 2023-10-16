/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadprofundizacion;

/**
 *
 * @author user
 */
public class Datos {

    private static Datos instance;
    private ListaDoble Libros = new ListaDoble();
    private Lista Materias = new Lista();
    private Lista Inicial = new Lista();
    private Datos() {
    }

    public static Datos getInstance() {
        if (instance == null) {
            instance = new Datos();
        }
        return instance;
    }
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
    public void eliminarLibro(int index){
        Libros.eliminar(index);
    }
    public void editarLibro(int index,Libro libro){
        Libros.editar(index, libro);
    }
    public ListaDoble getLibros(){
        return Libros;
    }
}
