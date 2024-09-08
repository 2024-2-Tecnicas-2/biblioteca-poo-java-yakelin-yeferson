import com.mycompany.biblioteca.java.Publicacion;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PublicacionTest {
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
        Publicacion publicacion = new Publicacion();
        publicacion.setTitulo("Jeferson Bobis");
        assertEquals("Jeferson Bobis", publicacion.getTitulo());
    }

    @Test
    public void testSetAnoPublicacion() {
        Publicacion publicacion = new Publicacion();
        publicacion.setAnoPublicacion(2023);
        assertEquals(2023, publicacion.getAnoPublicacion());
    }
    
    
}
