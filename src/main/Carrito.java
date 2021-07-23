package main;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private int id;
    private List<Libro> libros;

    public Carrito(Cliente cliente) throws Exception{
        if (clienteValido(cliente)) {
            this.libros = new ArrayList<>();
        } else throw new Exception("El cliente no es valido");
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

    private boolean clienteValido(Cliente cliente){
        return true;
    }
}
