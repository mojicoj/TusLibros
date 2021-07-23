package main;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private int id;
    private List<Libro> libros;

    public Carrito() {
        this.libros = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    private boolean clienteValido(Cliente cliente) {
        return true;
    }
}
