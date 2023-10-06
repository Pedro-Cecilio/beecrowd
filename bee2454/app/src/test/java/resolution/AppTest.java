/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package resolution;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AppTest {
    @Test
    void testMain() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        ByteArrayInputStream entradaTeste = new ByteArrayInputStream("1 0".getBytes());
        System.setIn(entradaTeste);

        // Chame o método que lê a entrada e escreve a saída
        App.main(new String[0]);

        // Restaure a entrada e saída padrão
        System.setOut(System.out);
        System.setIn(System.in);

        // Converta a saída para uma string e verifique se corresponde ao esperado (42)
        String saida = outputStream.toString().replaceAll("\\r\\n", "\n");
        assertEquals("B\n", saida);
    }
}