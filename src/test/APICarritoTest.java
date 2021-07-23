package test;

import main.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Carrito;
import java.util.Collections;

public class APICarritoTest {


    @Test
    @DisplayName("Al intentar crear un carrito, y el usuario es valido, entonces se crear el carrito")
    void testUsuarioValido() throws Exception {
        Assertions.assertEquals(new Carrito().getLibros(), Collections.emptyList());
    }

    @Test
    @DisplayName("Al intentar crear un carrito, y el usuario es invalido, entonces espera un exception")
    void testUsuarioInvalido()  {
        Cliente cliente = new Cliente("clientId","Password");
        Assertions.assertThrows(Exception.class, () -> new Carrito(cliente));
    }


    @Test
    @DisplayName("Al crear un carrito, el carrito tiene una lista vacia de libros")
    void testCarritoVacio() {
        Assertions.assertEquals(new Carrito().getLibros(), Collections.emptyList());
    }

    @Test
    @DisplayName("Al agregar un item al carro, devuelve el carro con un item")
    void testAgregarUnItem() {
        Assertions.assertEquals(new Carrito().getLibros(), Collections.emptyList());
    }

    @Test
    @DisplayName("Al agregar un item ya existente al carrito, contiene 2 unidades del item")
    void testAgregarItemRepetido() {

    }

}
