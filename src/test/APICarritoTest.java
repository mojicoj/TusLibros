package test;


import main.Carrito;
import main.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;

public class APICarritoTest {

    @Test
    @DisplayName("Al intentar crear un carrito, y el usuario es valido, entonces se crear el carrito")
    void testUsuarioValido() throws Exception {
        Cliente cliente = new Cliente("clientId","Password");
        Assertions.assertEquals(new Carrito(cliente).getLibros(), Collections.emptyList());
    }

    @Test
    @DisplayName("Al intentar crear un carrito, y el usuario es invalido, entonces espera un exception")
    void testUsuarioInvalido()  {
        Cliente cliente = new Cliente("clientId","Password");
        Assertions.assertThrows(Exception.class, () -> new Carrito(cliente));
    }
}
