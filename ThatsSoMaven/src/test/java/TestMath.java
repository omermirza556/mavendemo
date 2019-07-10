import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.first.Starter;

public class TestMath {

	@Test
	public void test() {
		
		Starter s = new Starter();
		assertTrue(s.abs(-1) ==1);
	}
	
	
	@Test
	public void text2() {
		Starter s = new Starter();
		assertTrue(s.abs(1) ==1);
	}

}
