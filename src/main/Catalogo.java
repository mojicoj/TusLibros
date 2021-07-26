package main;

import java.util.List;

public class Catalogo {
    private List<Libro> disponibles;

    public Catalogo(List<Libro> disponibles){
        this.disponibles = disponibles;
    }

    public List<Libro> getDisponibles() {
        return disponibles;
    }

    public void agregarLibro(Libro libro) throws Exception {
        if (!existeLibro(libro)) {
            this.disponibles.add(libro);
        } else throw new Exception("El libro ya existe en el catalogo");
    }

    public boolean existeLibro(Libro libro) {
        return this.disponibles.contains(libro);
    }

}
