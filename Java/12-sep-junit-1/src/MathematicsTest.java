import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathematicsTest {
	static Mathematics maths;
	
	@BeforeClass		//this method is executed once for the class. Before testing any method
	public static void init()
	{
		maths=new Mathematics();
	}

	@Before
	public void setValues()
	{
		maths.setNo1(2);
		maths.setNo2(5);
	}
	
	@Test
	public void testSum() {
		float expected=7;
		maths.sum();
		float actual=maths.getResult();
		assertEquals(expected, actual,1e-15);	
	}

	@Test
	public void testDifference() {
		float expected=3;
		maths.difference();
		float actual=maths.getResult();
		assertEquals(expected, actual,1e-15);
	}

	@Test
	public void testProduct() {
		float expected=10;
		maths.product();
		float actual=maths.getResult();
		assertEquals(expected, actual,1e-15);
	}

	@Test
	public void testDivide() {
		float expected=0.4f;
		maths.divide();
		float actual=maths.getResult();
		assertEquals(expected, actual,1e-15);
	}
	
	

}
