
import com.mycompany.biblioteca.java.Revista;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RevistaTest {

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
    public void testRevista() {
        // Crear una revista con valores específicos
        Revista revista = new Revista(125, "Yakelin", "Periferia", 2025);

        // Comprobar que los métodos get devuelven los valores correctos
        assertEquals("Periferia", revista.getTitulo());  // Usar el getter heredado
        assertEquals(2025, revista.getAnoPublicacion());  // Usar el getter heredado
        assertEquals(125, revista.getNumeroRevistas());
        assertEquals("Yakelin", revista.getNombreRevista());

        // Comprobar el método toString()
        String expected = "Revista{Titulo=Periferia, anoPublicacion=2025NumeroRevistas=125, NombreRevista=Yakelin}";
        assertEquals(expected, revista.toString());

    }
    
    //esto es una prueba donde le indica que falla si pone el año mal 
    @Test
    public void testInvalido() {
        // Probar con valores inválidos, como un año de publicación futuro
        Revista revistaFutura = new Revista(5, "NombreRevista", "Hola", 2015);
        assertEquals(5, revistaFutura.getNumeroRevistas());
        assertEquals(2015, revistaFutura.getAnoPublicacion(), "El año de publicación debe ser 2015");
    }
}
