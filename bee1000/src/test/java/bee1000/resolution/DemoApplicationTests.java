package bee1000.resolution;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class DemoApplicationTests {

	@Test
	void contextLoads() {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		PrintStream printStream = new PrintStream(outputStream);
		System.setOut(printStream);
		DemoApplication.main(new String[0]);
		System.setOut(System.out);

		assertEquals(outputStream.toString(), "Hello World!\r\n");
	}

}
