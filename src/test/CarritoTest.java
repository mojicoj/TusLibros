package test;

import main.Libro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Carrito;
import java.util.Collections;

public class CarritoTest {

    @Test
    @DisplayName("Al crear un carrito, el carrito tiene una lista vacia de libros")
    void testCarritoVacio() {
        Assertions.assertEquals(new Carrito().getLibros(), Collections.emptyList());
    }

    @Test
    @DisplayName("Al agregar un item al carro, devuelve el carro con un item")
    void testAgregarUnItem() {
        Libro libro = new Libro("La novena revelacion");
        assert(new Carrito().getLibros().contains(libro));
    }

    @Test
    @DisplayName("Al agregar un item ya existente al carrito, contiene 2 unidades del item")
    void testAgregarItemRepetido() {

    }

}
