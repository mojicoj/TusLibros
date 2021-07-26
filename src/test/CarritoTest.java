package test;

import main.Catalogo;
import main.Libro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Carrito;
import java.util.Collections;
import java.util.List;

public class CarritoTest {

    @Test
    @DisplayName("Al crear un carrito, el carrito tiene una lista vacia de libros")
    void testCarritoVacio() {
        Assertions.assertEquals(new Carrito(generarCatalogo()).getLibros(), Collections.emptyList());
    }

    @Test
    @DisplayName("Al agregar un item al carro, devuelve el carro con un item")
    void testAgregarUnItem() {
        Libro libro = new Libro("La novena revelacion");
        Carrito carrito = new Carrito(generarCatalogo());
        carrito.agregarLibro(libro);

        assert(carrito.getLibros().contains(libro));
    }

    @Test
    @DisplayName("Al agregar un item ya existente al carrito, contiene 2 unidades del item")
    void testAgregarItemRepetido() {
        Libro libro = new Libro("La novena revelacion");
        Carrito carrito = new Carrito(generarCatalogo());
        carrito.agregarLibro(libro);
        carrito.agregarLibro(libro);

        assert(carrito.getLibros().contains(libro));
    }

    private Catalogo generarCatalogo(){
        Libro a = new Libro("a");
        Libro b = new Libro("b");
        Libro c = new Libro("c");
        return new Catalogo(List.of(a,b,c));
    }

}
