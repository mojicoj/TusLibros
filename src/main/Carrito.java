package main;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    public static final String EL_LIBRO_NO_PERTENECE_AL_CATALOGO = "El libro no pertenece al catalogo";
    public static final String LA_CANTIDAD_NO_PUEDE_SER_NEGATIVA = "La cantidad no puede ser negativa";
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

    public void agregarLibro(Libro libro) throws Exception{
        if(!catalogo.existeLibro(libro)) {
            throw new Exception(EL_LIBRO_NO_PERTENECE_AL_CATALOGO);
        }
        libros.add(libro);
    }

    public long cantidadLibro(Libro libro){
        return this.getLibros().stream().filter(unLibro -> unLibro.equals(libro)).count();
    };

    public boolean contieneLibro(Libro libro){
        return this.getLibros().contains(libro);
    }

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

    public void agregarLibroEnCantidad(int unaCantidad, Libro libro) throws Exception {
        if (unaCantidad <0) throw new Exception(LA_CANTIDAD_NO_PUEDE_SER_NEGATIVA);
        for (int i = 0; i < unaCantidad;i++){
            agregarLibro(libro);
        }
    }
}
