
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MySecondClassTest {
	@Test(timeout=10000)
	public void sumOfZeroIntegersShouldReturnZero() {

		// MyClass is tested
		MyClass tester = new MyClass();

		// assert statements
		assertEquals("10 + 0 must be 10", 10, tester.sum(10, 0));
		assertEquals("0 + 10 must be 11", 11, tester.sum(0, 10));
		assertEquals("0 + 0 must be 0", 0, tester.sum(0, 0));
	}
	
	@Test(expected=Exception.class)
	public void methodExc(){
		try {
			   int i = 1/0;
			   
			} catch (Exception e) {
			   // expected
			   // could also check for message of exception, etc.
			} 

	}
}
