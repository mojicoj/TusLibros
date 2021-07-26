package test;

import com.sun.source.tree.AssertTree;
import main.Catalogo;
import main.Libro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Carrito;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarritoTest {

    @Test
    @DisplayName("Al crear un carrito, el carrito tiene una lista vacia de libros")
    void testCarritoVacio() {
        assertEquals(new Carrito(generarCatalogo()).getLibros(), Collections.emptyList());
    }

    @Test
    @DisplayName("Al agregar un item al carro, devuelve el carro con un item")
    void testAgregarUnItem() throws Exception{
        Libro libro = new Libro("La novena revelacion");
        Carrito carrito = new Carrito(generarCatalogo());
        carrito.agregarLibro(libro);

        assert(carrito.contieneLibro(libro));
    }

    @Test
    @DisplayName("Al agregar un item ya existente al carrito, contiene 2 unidades del item")
    void testAgregarItemRepetido() throws Exception{
        Libro libro = new Libro("La novena revelacion");
        Carrito carrito = new Carrito(generarCatalogo());
        carrito.agregarLibro(libro);
        carrito.agregarLibro(libro);

        assertTrue(carrito.contieneLibro(libro));
        assertEquals(carrito.cantidadLibro(libro),2);
    }

    @Test
    @DisplayName("Al agregar una cantidad de items iguales al carrito, contiene 2 unidades del item")
    void testAgregarItemRepetidoPorCantidad() throws Exception{
        Libro libro = new Libro("La novena revelacion");
        Carrito carrito = new Carrito(generarCatalogo());
        carrito.agregarLibroEnCantidad(2, libro);

        assertTrue(carrito.contieneLibro(libro));
        assertEquals(carrito.cantidadLibro(libro),2);
    }

    @Test
    @DisplayName("Cuando intento agregar un libro que no existe en la editorial entonces espera una exception")
    void testLibroInvalisdo() throws Exception{
        Libro libro = new Libro("aguante chaca");
        Carrito carrito = new Carrito(generarCatalogo());

        assertThrows(Exception.class, () -> carrito.agregarLibro(libro), Carrito.EL_LIBRO_NO_PERTENECE_AL_CATALOGO);
    }

    @Test
    @DisplayName("Al agregar una cantidad de items en negativo al carrito, espero una exception")
    void testAgregarItemRepetidoPorCantidadNegativa() throws Exception{
        Libro libro = new Libro("La novena revelacion");
        Carrito carrito = new Carrito(generarCatalogo());

        assertThrows(Exception.class, () -> carrito.agregarLibroEnCantidad(-2, libro), Carrito.LA_CANTIDAD_NO_PUEDE_SER_NEGATIVA);
    }

    private Catalogo generarCatalogo(){
        Libro a = new Libro("a");
        Libro b = new Libro("b");
        Libro c = new Libro("c");
        Libro d = new Libro("La novena revelacion");
        return new Catalogo(List.of(a,b,c,d));
    }

}
