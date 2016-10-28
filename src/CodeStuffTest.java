import static org.junit.Assert.*;

import org.junit.Test;

public class CodeStuffTest extends CodeStuff {

	@Test
	public void testGetFirstThreeChars() {
		assertEquals("can", getFirstThreeChars("canalope"));
		assertEquals("app", getFirstThreeChars("application"));
		assertEquals("Sev", getFirstThreeChars("Seven"));
	}

	@Test
	public void testAddUnlessSame() {
		assertEquals(7, addUnlessSame(3, 4));
		assertEquals(0, addUnlessSame(10, 10));
		assertEquals(25, addUnlessSame(5, 20));
		assertEquals(0, addUnlessSame(1, 1));

	}

	@Test
	public void testReduceArrayByHalf(){
		int[] a1 = {10, 4, 24};
		int[] a2 = {5, 2, 12};
		
		assertArrayEquals(a2, reduceArrayByHalf(a1));
	}
}