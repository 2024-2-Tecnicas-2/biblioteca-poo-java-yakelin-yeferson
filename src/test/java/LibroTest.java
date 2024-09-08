
import com.mycompany.biblioteca.java.Libro;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibroTest {
    // TODO Adiciona tus pruebas unitarias aquí.
    // Los métodos deben estar anotados con la anotación @Test. Por ejemplo:
    //
//    @Test
//    public void testMultiplicarPositivos() {
//        int valorEsperado = 15;
//        CuentaBancaria miCuenta = new CuentaBancaria();
//        int valorActual = miCuenta.multiplicar(3, 5);
//        assertEquals(valorEsperado, valorActual);
//    }

    @Test
    public void testSetTitulo() {
        Libro libro = new Libro("Mario", 251, "Amor", 1999);
        assertEquals("Mario", libro.getAutor());
        assertEquals(1999, libro.getAnoPublicacion());
        assertEquals(251, libro.getNumero_de_paginas());
    }

    /*@Test
    public void testToString() {
        Libro libro = new Libro("Harry Potter", 500, "J.K. Rowling", 2024);
        String expected = "Libro{Titulo='Harry Potter', Numero_de_paginas=500, Autor='J.K. Rowling', Ano_publicacion=2024}";
        assertEquals(expected, libro.toString());
    }*/
    @Test
    public void testGetters() {
        // Crear un libro con valores específicos
        Libro libro = new Libro("Cien años de soledad", 417, "Gabriel García Márquez", 1967);

        // Comprobar que los métodos get devuelven los valores correctos
        assertEquals("Cien años de soledad", libro.getTitulo());  // Usar el getter heredado
        assertEquals(417, libro.getNumero_de_paginas());
        assertEquals("Gabriel García Márquez", libro.getAutor());
        assertEquals(1967, libro.getAnoPublicacion());  // Usar el getter heredado
    }

}
