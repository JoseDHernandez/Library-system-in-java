/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadprofundizacion;

/**
 *
 * @author user
 */
public class Libro {
    private String nombre;
    private String codigo;
    private String autor;
    private String materia;
    private int numeroPaginas;
    public Libro(){
        nombre="";
        codigo="";
        autor ="";
        materia = "";
        numeroPaginas=0;
    }
    public Libro(String codigo,String nombre,String autor,String materia,int numeroPaginas){
        this.codigo = codigo;
        this.nombre = nombre;
        this.autor = autor;
        this.materia = materia;
        this.numeroPaginas = numeroPaginas;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public void setMateria(String materia){
        this.materia=materia;
    }
    public void setNumperoPaginas(int numeroPaginas){
        this.numeroPaginas = numeroPaginas;
    }
    public String getNombre(){
        return nombre;
    }
    public String getCodigo(){
        return codigo;
    }
    public String getAutor(){
        return autor;
    }
    public String getMateria(){
        return materia;
    }
    public int getNumeroPaginas(){
        return numeroPaginas;
    }
}
