package bee1091.resolution;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import org.junit.jupiter.api.Test;

class MainTests {

	@Test
	void testMain() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        ByteArrayInputStream entradaTeste = new ByteArrayInputStream("3\n2 1\n10 10\n-10 1\n0 33\n4\n-1000 -1000\n-1000 -1000\n0 0\n-2000 -10000\n-999 -1001\n0".getBytes());
        System.setIn(entradaTeste);

        // Chame o método que lê a entrada e escreve a saída
        Main.main(new String[0]);

        // Restaure a entrada e saída padrão
        System.setOut(System.out);
        System.setIn(System.in);

        // Converta a saída para uma string e verifique se corresponde ao esperado (42)
        String saida = outputStream.toString().replaceAll("\\r\\n", "\n");
        assertEquals("NE\ndivisa\nNO\ndivisa\nNE\nSO\nSE\n", saida);
    }

}
