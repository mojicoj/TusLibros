package main;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private int id;
    private List<Libro> libros;
    private final Catalogo catalogo;
    public Carrito(Catalogo catalogo) {

        this.catalogo = catalogo;
        this.libros = new ArrayList<>();
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void agregarLibro(Libro libro){
        this.libros.add(libro);
    }

    public int cantidadLibro(Libro libro){

    };

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    private boolean esLibroValido(Libro libro){
        return !catalogo.existeLibro(libro);
    }

    private boolean clienteValido(Cliente cliente) {
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
