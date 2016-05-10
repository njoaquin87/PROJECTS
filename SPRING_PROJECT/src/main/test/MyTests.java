import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyTests {
	@Test
	public void multiplicationOfZeroIntegersShouldReturnZero() {

		// MyClass is tested
		MyClass tester = new MyClass();

		// assert statements
		assertEquals("10 x 0 must be 0", 0, tester.multiply(10, 0));
		assertEquals("0 x 10 must be 0", 0, tester.multiply(0, 10));
		assertEquals("0 x 0 must be 0", 0, tester.multiply(0, 0));
	}
}
